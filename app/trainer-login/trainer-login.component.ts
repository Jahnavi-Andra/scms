import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import trainer from './_files/data.json';
import { TrainerService } from '../trainer.service';
import { Trainer } from '../trainer';

@Component({
  selector: 'app-trainer-login',
  templateUrl: './trainer-login.component.html',
  styleUrls: ['./trainer-login.component.css']
})

export class TrainerLoginComponent implements OnInit {
  username : string;
  password :string;
  user:string;
  pass:string;
  isValidFormSubmitted : boolean;
i:number;
j:number=0;
train:Trainer;
flag:number;
msg:string;
// public TrainerList:{id:string,name:string,PhoneNo:string,Age:string,Experience:string,Username:string,Password:string, sport:string}[] = trainer;

  aboutus(){
    this._router.navigate(['/aboutus']);
  }
  homepage() {
    this._router.navigate(['/default']);
  }

login(form : NgForm) {
  this.isValidFormSubmitted=false;
  if(form.invalid) {
    return;
  }
//   this.isValidFormSubmitted=true;
//  for(this.i =0; this.i<this.TrainerList.length;this.i++){
//   if(this.username==this.TrainerList[this.i].Username && this.TrainerList[this.i].Password==this.password){
//     this.j++;  
//   }} if(this.j==1){
//     this._router.navigate(['/trainerdashboard']);
//   }else{
//     alert("invalid");
//   }

this.traService.validatecount(this.username,this.password).subscribe(x => {
  if(x == "1") {
    this.traService.validate(this.username,this.password).subscribe(x => {
      this.train=x;
      localStorage.setItem('trainer', JSON.stringify(x));
      this._router.navigate(["/trainerdashboard"]);
    })
  } else {
    this.msg = "Invalid Credentials";
  }
});
  }

  
  
  constructor(private _router : Router,private traService :TrainerService) { 
    
  }

  ngOnInit(): void {
    
  }

}

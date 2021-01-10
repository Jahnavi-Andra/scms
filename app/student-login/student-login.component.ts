import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import student from './_files/data.json';
import { StudentService } from '../student.service';
import { Observable } from 'rxjs';
import { Student } from '../student';
@Component({
  selector: 'app-student-login',
  templateUrl: './student-login.component.html',
  styleUrls: ['./student-login.component.css']
})
export class StudentLoginComponent implements OnInit {

  username : string;
  password :string;
  user:string;
  pass:string;
  isValidFormSubmitted : boolean;
i:number;
j:number=0;
stud: Student;
flag:number;
msg:string;
// public StudentList:{id:string,name:string,PhoneNo:string,Age:string,Experience:string,Username:string,Password:string, sport:string}[] = student;

  constructor(private _router : Router,private stuService:StudentService) {}
  aboutus(){
    this._router.navigate(['/aboutus']);
  }
  register(){
    this._router.navigate(['/register']);
  }
  homepage() {
    this._router.navigate(['/default']);
  }
  login(form : NgForm) {
    this.isValidFormSubmitted=false;
    if(form.invalid) {
      return;
    }
    this.isValidFormSubmitted=true;
  //  for(this.i =0; this.i<this.StudentList.length;this.i++){
  //   if(this.username==this.StudentList[this.i].Username && this.StudentList[this.i].Password==this.password){
  //     this.j++;  
  //   }} if(this.j==1){
  //     this._router.navigate(['/studentdashboard']);
  //   }else{
  //     alert("invalid");
  //   }
    this.stuService.validatecount(this.username,this.password).subscribe(x => {
      if(x == 1) {
        this.stuService.validate(this.username,this.password).subscribe(y => {
          this.stud=y;
          localStorage.setItem('student', JSON.stringify(y));
          this._router.navigate(["/studentdashboard"]);
        })
      } else {
        this.msg = "Invalid Credentials";
      }
    });

    }

  ngOnInit(): void {
  }

}

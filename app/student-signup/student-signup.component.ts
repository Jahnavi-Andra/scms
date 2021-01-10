import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { StudentService } from '../student.service';
import { Student } from '../student';
@Component({
  selector: 'app-student-signup',
  templateUrl: './student-signup.component.html',
  styleUrls: ['./student-signup.component.css']
})
export class StudentSignupComponent implements OnInit {
  student = new Student();
  msg:string;
  flag:number;
  homepage() {
    this._router.navigate(['/default']);
  }
  login() {
    this._router.navigate(['/studentlogin']);
  }
  register(regForm: NgForm){
    if(regForm.invalid){
      alert("Enter all the details");
    }
    else{
      this.stuService.register(this.student).subscribe(x=>{
        this.msg=x;
        this.flag=1;
      })
    }
    
  }
  constructor(private _router : Router,private stuService:StudentService) { }

  ngOnInit(): void {
  }

}

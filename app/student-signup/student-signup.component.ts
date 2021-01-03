import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
@Component({
  selector: 'app-student-signup',
  templateUrl: './student-signup.component.html',
  styleUrls: ['./student-signup.component.css']
})
export class StudentSignupComponent implements OnInit {
  homepage() {
    this._router.navigate(['/default']);
  }
  // reg() {
  //   alert("Register Success");
  // }
  login() {
    this._router.navigate(['/studentlogin']);
  }
  register(regForm: NgForm){
    alert("Registered");
  }
  constructor(private _router : Router) { }

  ngOnInit(): void {
  }

}

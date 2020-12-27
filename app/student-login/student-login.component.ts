import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
@Component({
  selector: 'app-student-login',
  templateUrl: './student-login.component.html',
  styleUrls: ['./student-login.component.css']
})
export class StudentLoginComponent implements OnInit {

  constructor(private _router : Router) { }
  // student(){
  //   this._router.navigate(['/studentdashboard']);
  // }
  register(){
    this._router.navigate(['/register']);
  }
  homepage() {
    this._router.navigate(['/default']);
  }
  login(loginForm : NgForm) {
    this._router.navigate(['/studentdashboard']);
    }
//   onClickSubmit(data) {
//     alert("Entered Email id : " + data.username);
//  }
  ngOnInit(): void {
  }

}
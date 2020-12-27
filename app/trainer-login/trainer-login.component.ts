import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
// import * as $ from 'jquery';
import { NgForm } from '@angular/forms';
@Component({
  selector: 'app-trainer-login',
  templateUrl: './trainer-login.component.html',
  styleUrls: ['./trainer-login.component.css']
})

export class TrainerLoginComponent implements OnInit {
  // trainer() {
  //   this._router.navigate(['/trainerdashboard']);
  // }
  homepage() {
    this._router.navigate(['/default']);
  }
//   onClickSubmit(data) {
//     alert("Entered Email id : " + data.emailid);
//  }
login(loginForm : NgForm) {
  this._router.navigate(['/trainerdashboard']);
   
  }

  // x(){
  //   $('input[type="password"]')
  // .on("focus", () => {
  //   $("*").addClass("password");
  // })
  // .on("focusout", () => {
  //   $("*").removeClass("password");
  // });;
  // }
  
  constructor(private _router : Router) { 
    
  }

  ngOnInit(): void {
    
  }

}

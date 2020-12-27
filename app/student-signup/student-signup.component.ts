import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-student-signup',
  templateUrl: './student-signup.component.html',
  styleUrls: ['./student-signup.component.css']
})
export class StudentSignupComponent implements OnInit {
  homepage() {
    this._router.navigate(['/default']);
  }
  reg() {
    alert("Register Success");
  }
  constructor(private _router : Router) { }

  ngOnInit(): void {
  }

}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-student-dashboard',
  templateUrl: './student-dashboard.component.html',
  styleUrls: ['./student-dashboard.component.css']
})
export class StudentDashboardComponent implements OnInit {
  homepage(){
    this._router.navigate(['/default']);
    }
  constructor(private _router : Router) { }

  ngOnInit(): void {
  }

}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-trainer-dashboard',
  templateUrl: './trainer-dashboard.component.html',
  styleUrls: ['./trainer-dashboard.component.css']
})
export class TrainerDashboardComponent implements OnInit {
  homepage() {
    this._router.navigate(['/default']);
  }
  constructor(private _router : Router) { }

  ngOnInit(): void {
  }

}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  homepage() {
    this._router.navigate(['/default']);
  }
  trainer() {
    this._router.navigate(['/trainerlogin']);
  }
  student(){
    this._router.navigate(['/studentlogin']);
  }
  Aboutus(){
    this._router.navigate(['/aboutus']);
  }
  constructor(private _router : Router) { }

  ngOnInit(): void {
  }

}

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-enroll',
  templateUrl: './enroll.component.html',
  styleUrls: ['./enroll.component.css']
})
export class EnrollComponent implements OnInit {
enroll(){
  alert("Enrolled");
}
login(loginForm : NgForm) {
  this._router.navigate(['/studentdashboard']);
  }
  constructor() { }

  ngOnInit(): void {
  }

}

import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
@Component({
  selector: 'app-enroll',
  templateUrl: './enroll.component.html',
  styleUrls: ['./enroll.component.css']
})
export class EnrollComponent implements OnInit {
// enroll(){
//   alert("Enrolled");
// }
enroll(enrollForm: NgForm){
  if (enrollForm.invalid) {
    alert("Enter all details");
  }
  else{
    alert("Enrolled");
  }
}
  constructor() { }

  ngOnInit(): void {
  }

}

import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
@Component({
  selector: 'app-update-points',
  templateUrl: './update-points.component.html',
  styleUrls: ['./update-points.component.css']
})
export class UpdatePointsComponent implements OnInit {
studentid : string;
points:number;
  update(pointsForm: NgForm){
    if (pointsForm.invalid) {
      alert("Enter all details");
    }
    else{
      alert("Done");
    }
  }
  constructor() { }

  ngOnInit(): void {
  }

}

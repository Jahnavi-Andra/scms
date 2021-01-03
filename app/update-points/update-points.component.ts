import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
@Component({
  selector: 'app-update-points',
  templateUrl: './update-points.component.html',
  styleUrls: ['./update-points.component.css']
})
export class UpdatePointsComponent implements OnInit {

  update(pointsForm: NgForm){
    alert("Points Updated");
  }
  constructor() { }

  ngOnInit(): void {
  }

}

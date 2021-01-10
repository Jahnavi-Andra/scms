import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Observable } from 'rxjs';
import { Student } from '../student';
import { StudentService } from '../student.service';
import { Trainer } from '../trainer';
import { TrainerService } from '../trainer.service';
@Component({
  selector: 'app-update-points',
  templateUrl: './update-points.component.html',
  styleUrls: ['./update-points.component.css']
})
export class UpdatePointsComponent implements OnInit {
studentid : number;
ids:number[];
idss:any[];
trainer:Trainer;
item:number;
points:number;
msg:string;
flag:number;
studentName : string;
  update(pointsForm: NgForm){
    if (pointsForm.invalid) {
    //  alert("Enter all details");
    }
    else{
     this.stuService.updatePoints(this.points,this.studentid).subscribe(x=>{
      this.msg=x;
      this.flag=1;
     })
    }
  }
  stud(){
    this.stuService.studentById(this.studentid).subscribe(y=>{
      // this.studList = y;
     this.studentName= y.studentName;
    })
  }
  constructor(private traService:TrainerService,private stuService:StudentService) { 
    this.trainer = JSON.parse(localStorage.getItem('trainer') || '{}');
    this.traService.selectStudId(this.trainer.trainerId).subscribe(x=>{
      this.ids=x;
    })
  }

  ngOnInit(): void {
  }

}

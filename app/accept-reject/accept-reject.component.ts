import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Student } from '../student';
import { StudentService } from '../student.service';
import { Trainer } from '../trainer';
import { TrainerService } from '../trainer.service';
import { Trainingcamp } from '../trainingcamp';
@Component({
  selector: 'app-accept-reject',
  templateUrl: './accept-reject.component.html',
  styleUrls: ['./accept-reject.component.css']
})
export class AcceptRejectComponent implements OnInit {
  trainer : Trainer;
  status : string;
  studentId : number;
  trainerId : number;
  msg : string;
  pendingList: Trainingcamp[];
  doj : string;
  flag : number;
  studList: Student;
  studentName : string;
  Name : string;
  acceptreject(arForm: NgForm){
    if (arForm.invalid) {
     // alert("Enter all details");
    }
    else{
      //alert("Done");
      this.traService.UpdateStatus(this.status, this.studentId, this.trainerId).subscribe(x=>{
        this.msg = x;
        this.flag = 1;
      })
    }
  }
  doj1(){
    this.stuService.studentById(this.studentId).subscribe(y=>{
      this.studList = y;
     this.studentName= y.studentName;
    })
  this.traService.selectDojbyStudId(this.studentId).subscribe(x=>{
    this.doj = x;

   })

  }
  constructor(private traService :TrainerService,private stuService:StudentService ) {
    this.trainer = JSON.parse(localStorage.getItem('trainer') || '{}');
    this.trainerId = this.trainer.trainerId;
    this.traService.showPendingStudentList(this.trainerId).subscribe(y=>{
      this.pendingList = y;
    })
    
   }

  ngOnInit(): void {
  }

}

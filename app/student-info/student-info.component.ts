import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from '../student';
import { TrainerService } from '../trainer.service';
import { Trainingcamp } from '../trainingcamp';
import student from './_files/data.json';
import enroll from './_files/enroll.json';
@Component({
  selector: 'app-student-info',
  templateUrl: './student-info.component.html',
  styleUrls: ['./student-info.component.css']
})
export class StudentInfoComponent implements OnInit {

  title = 'scms';
  student:Student;
  enrolll:Trainingcamp[];
  // public studentList:{studentId:number, studentName:string, studentUserName:string,
  //   studentPassword:string,studentPhNo:string,studentWallet:number,studentPoints:number}[] = student;

  //   public enrollList:{studentId:number, trainerId:number, sportId:number,
  //     enrollId:number}[] = enroll;

  
  constructor(private traService:TrainerService) { 

    this.student = JSON.parse(localStorage.getItem('student') || '{}');
    // alert(this.student.studentId);

    this.traService.studentEnrollInfo(this.student.studentId).subscribe(x=>{

      this.enrolll=Array.of(x);
    })


  }

  ngOnInit(): void {
  }

}

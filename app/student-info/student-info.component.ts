import { Component, OnInit } from '@angular/core';
import student from './_files/data.json';
import enroll from './_files/enroll.json';
@Component({
  selector: 'app-student-info',
  templateUrl: './student-info.component.html',
  styleUrls: ['./student-info.component.css']
})
export class StudentInfoComponent implements OnInit {

  title = 'scms';
  public studentList:{studentId:number, studentName:string, studentUserName:string,
    studentPassword:string,studentPhNo:string,studentWallet:number,studentPoints:number}[] = student;

    public enrollList:{studentId:number, trainerId:number, sportId:number,
      enrollId:number}[] = enroll;
  
  constructor() { }

  ngOnInit(): void {
  }

}

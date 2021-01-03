import { Component, OnInit } from '@angular/core';
import listofstud from 'C:/Users/53256/workspace/angular/scms/src/app/listofstud.json';
@Component({
  selector: 'app-listof-students',
  templateUrl: './listof-students.component.html',
  styleUrls: ['./listof-students.component.css']
})
export class ListofStudentsComponent implements OnInit {
  public StudentList:{traincampid:string,studentname:string,PhoneNo:string,sport:string,points:string}[] = listofstud;
  constructor() { }

  ngOnInit(): void {
    
  }

}

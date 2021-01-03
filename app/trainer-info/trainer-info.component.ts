import { Component, OnInit } from '@angular/core';
import students from 'C:/Users/53256/workspace/angular/scms/src/app/students.json';
@Component({
  selector: 'app-trainer-info',
  templateUrl: './trainer-info.component.html',
  styleUrls: ['./trainer-info.component.css']
})
export class TrainerInfoComponent implements OnInit {
  public StudentList:{id:string,name:string,PhoneNo:string,Age:string,Experience:string,Username:string,sport:string}[] = students;
  constructor() { }

  ngOnInit(): void {
  }

}

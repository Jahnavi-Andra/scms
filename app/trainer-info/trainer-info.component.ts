import { Component, OnInit } from '@angular/core';
import { Trainer } from '../trainer';
import { TrainerService } from '../trainer.service';
//import students from 'C:/Users/53243/workspace/angular/scms/src/app/students.json';
@Component({
  selector: 'app-trainer-info',
  templateUrl: './trainer-info.component.html',
  styleUrls: ['./trainer-info.component.css']
})
export class TrainerInfoComponent implements OnInit {
  trainer:Trainer;
  //public StudentList:{id:string,name:string,PhoneNo:string,Age:string,Experience:string,Username:string,sport:string}[] = students;
  constructor(private traService:TrainerService) {
    this.trainer = JSON.parse(localStorage.getItem('trainer') || '{}');

   }

  ngOnInit(): void {
  }

}

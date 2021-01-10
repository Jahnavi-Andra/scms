import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Trainer } from '../trainer';
import { TrainerService } from '../trainer.service';
import { Trainingcamp } from '../trainingcamp';
// import listofstud from 'C:/Users/53243/workspace/angular/scms/src/app/listofstud.json';
@Component({
  selector: 'app-listof-students',
  templateUrl: './listof-students.component.html',
  styleUrls: ['./listof-students.component.css']
})
export class ListofStudentsComponent implements OnInit {

  listStud:Observable<Trainingcamp[]>;
  trainer:Trainer;
  //public StudentList:{traincampid:string,studentname:string,PhoneNo:string,sport:string,points:string}[] = listofstud;
  constructor(private traService:TrainerService) { 
    this.trainer = JSON.parse(localStorage.getItem('trainer') || '{}');

   this.listStud=this.traService.listOfStudents(this.trainer.trainerId);
  //  alert(this.trainer.trainerId);

  }

  ngOnInit(): void {
    
  }

}

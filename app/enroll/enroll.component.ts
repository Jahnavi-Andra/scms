import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Sport } from '../sport';
import { Student } from '../student';
import { StudentService } from '../student.service';
import { Trainer } from '../trainer';
import { TrainerService } from '../trainer.service';
import { Trainingcamp } from '../trainingcamp';
import { DatePipe } from '@angular/common';
@Component({
  selector: 'app-enroll',
  templateUrl: './enroll.component.html',
  styleUrls: ['./enroll.component.css'],
  providers :[DatePipe]
})
export class EnrollComponent implements OnInit {
student:Student;
trainercamp= new Trainingcamp();
msg:string;
sportsn:Sport[];
trainen:Trainer[];
fee : number;
myDate = new Date();
myDate1 : string="";
a:string;
enroll(enrollForm: NgForm){
  if (enrollForm.invalid) {
    //alert("Enter all details");
  }
  else{
    //alert("Enrolled");
    this.trainercamp.doj = this.myDate1;
    // alert(this.trainercamp.doj + );
    // alert(this.myDate1);
    this.traService.Enroll(this.trainercamp).subscribe(x=>{
      
      this.msg=x;
    
    })
  }
  // taketrainer(){
  //   this.traService.showtrainerById(this.trainercamp.sport_id).subscribe(x=>{
  //     alert(this.trainercamp.sport_id);
  //     this.trainen=x;
  //   })
  
  // }
}
taketrainer(){
 
  this.traService.showtrainerById(this.trainercamp.sport_id).subscribe(x=>{
  
    this.trainen=x;
  })


}
takeFee(){
  this.stuService.sportfeeById(this.trainercamp.trainer_id).subscribe(x=>{
    this.fee = x;
  })
}
  constructor(private traService :TrainerService,private stuService:StudentService, private datePipe: DatePipe) { 
    this.student = JSON.parse(localStorage.getItem('student') || '{}');
    this.traService.selectSportgroup().subscribe(x=>{
      this.sportsn=x;
      this.trainercamp.stud_id = this.student.studentId;
    })
  this.myDate1 = this.datePipe.transform(this.myDate, 'yyyy-MM-dd')!;
  

  //  alert(this.myDate1);
  }




  ngOnInit(): void {
  }

}

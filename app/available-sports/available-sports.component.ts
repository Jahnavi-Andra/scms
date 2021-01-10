import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Sport } from '../sport';
import { StudentService } from '../student.service';
import sports from './_files/data.json';

@Component({
  selector: 'app-available-sports',
  templateUrl: './available-sports.component.html',
  styleUrls: ['./available-sports.component.css']
})
export class AvailableSportsComponent implements OnInit {

  title = 'scms';
  sportl:Observable<Sport[]>;
  public sportList:{sportId:number, sportName:string, trainerId:number,
    sportFee:number}[] = sports;

  constructor(private stuService:StudentService) {

    this.sportl=this.stuService.allSports();

   }

  ngOnInit(): void {
  }

}

import { Component, OnInit } from '@angular/core';
import sports from './_files/data.json';

@Component({
  selector: 'app-available-sports',
  templateUrl: './available-sports.component.html',
  styleUrls: ['./available-sports.component.css']
})
export class AvailableSportsComponent implements OnInit {

  title = 'scms';
  public sportList:{sportId:number, sportName:string, trainerId:number,
    sportFee:number}[] = sports;

  constructor() { }

  ngOnInit(): void {
  }

}

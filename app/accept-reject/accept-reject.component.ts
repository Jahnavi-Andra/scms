import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
@Component({
  selector: 'app-accept-reject',
  templateUrl: './accept-reject.component.html',
  styleUrls: ['./accept-reject.component.css']
})
export class AcceptRejectComponent implements OnInit {
  acceptreject(arForm: NgForm){
    alert("Done!!");
  }
  constructor() { }

  ngOnInit(): void {
  }

}

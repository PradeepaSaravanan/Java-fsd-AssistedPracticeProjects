import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-greet',
  templateUrl: './greet.component.html',
  styleUrls: ['./greet.component.css']
})
export class GreetComponent implements OnInit {

  constructor() { }
name: string="Anu";
  ngOnInit(): void {
  }
  greet(): void{
    alert("Hello All!!!"+this.name);
  }

}
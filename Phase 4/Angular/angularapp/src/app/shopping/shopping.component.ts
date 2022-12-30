import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-shopping',
  templateUrl: './shopping.component.html',
  styleUrls: ['./shopping.component.css']
})
export class ShoppingComponent implements OnInit {

  constructor() { }

   @Input() productlist:Array<any>=[];

  ngOnInit(): void {
  }
  //count change on @output
  public clickcount:number=0;
   @Output() onChanged=new EventEmitter<number>();

  countchange(count:number){
    count++;
    this.clickcount=count;
    this.onChanged.emit(this.clickcount);
  }

}
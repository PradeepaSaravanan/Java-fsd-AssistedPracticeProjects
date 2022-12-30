import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ShoppingProject';
  products:Array<any>=[{name:"Rice",price:200},
  {name:"Sugar",price:300}
]

public clickcount:number=0;
onCountChanged(count:number):void{
  this.clickcount=count;

}
}
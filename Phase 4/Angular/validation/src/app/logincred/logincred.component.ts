import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-logincred',
  templateUrl: './logincred.component.html',
  styleUrls: ['./logincred.component.css']
})
export class LogincredComponent implements OnInit {

  constructor() { }
  user:string="";
  pwd:string="";
  status:string="";
  msg:string="";
  imgpath:string="./assets/flowerimage.jpg"
  ngOnInit(): void {
  }
  validate(): void{
      /*if(this.user=="admin" &&  (this.pwd=="admin123")){
        alert("Welcome User!!");
      }
      else{
        alert("Invalid Credentials");
      }*/

      if(this.user=="Divya" && this.pwd=="12345"){
        this.status='';
          this.msg="Welcome"+this.user;
        
        }
        else{
        this.msg="Invalid User";
        this.status='error';
        
        }
      
  }
}
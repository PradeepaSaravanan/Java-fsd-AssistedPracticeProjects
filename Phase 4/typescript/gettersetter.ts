class Rectangle{
    len=0;
    bred=0;

    public get length():number{
        return this.len
    }
    public get breadth():number{
        return this.bred;
    }
     public set length(l:number){
        this.len=l;
     }
     public set breadth(b:number)
     {
        this.bred=b;
     }
}

 let rect= new Rectangle();
 rect.length=20;
 rect.breadth=10;
  console.log("Length:"+rect.length);
  console.log("breadth:"+rect.breadth);

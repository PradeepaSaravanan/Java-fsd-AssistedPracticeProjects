interface Employee1{
    id:number;
    name:string;
    tasks:string[];
    dowork():void;
}
class Developer implements Employee1{
    constructor( public id:number, public name:string, public  tasks:string[])
    {
        this.id=id;
        this.name=name;
        this.tasks=tasks;


    }
    dowork() {
        console.log(`${this.name} writes code`);

    }

}
 let dev= new Developer(1,'KARAN',['writing', 'reading', 'testing']);
  dev.dowork();
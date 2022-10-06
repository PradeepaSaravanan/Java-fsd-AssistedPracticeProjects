class Employees{
     empid:number=0;
    empname:string="";
    public get id():number{
        return this.empid;
    }
    public get name():string{
        return this.empname;
    }
    constructor(id:number,name:string)
    {
        this.empid=id;
        this.empname=name;
    }
    show(){
    console.log("Id="+this.id);
    console.log("name="+this.name);
}
    
}
class reg_employee extends Employees{
    private salary:number=0;
    public get sal(){
        return this.salary;
    }
    constructor(id:number, name:string, salary:number)
    {
        super(id,name);
        this.salary=salary;
        
    }

    display()
    {
        super.show();
        console.log("Salary="+this.salary);
    }
}

let emp1=new reg_employee(1,"Suha", 20000);
emp1.display();

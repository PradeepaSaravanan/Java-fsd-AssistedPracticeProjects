class EmployeeDetails{
    static headcount:number=0;
    constructor(private name:string)
    {
        EmployeeDetails.headcount++;
    }
}
 let obj1= new EmployeeDetails("Pradeepa");
 console.log(EmployeeDetails.headcount);
 let obj2= new EmployeeDetails("Kannan");

 console.log(EmployeeDetails.headcount);
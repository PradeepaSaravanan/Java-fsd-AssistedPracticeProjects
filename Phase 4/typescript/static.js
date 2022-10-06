var EmployeeDetails = /** @class */ (function () {
    function EmployeeDetails(name) {
        this.name = name;
        EmployeeDetails.headcount++;
    }
    EmployeeDetails.headcount = 0;
    return EmployeeDetails;
}());
var obj1 = new EmployeeDetails("Pradeepa");
console.log(EmployeeDetails.headcount);
var obj2 = new EmployeeDetails("Kannan");
console.log(EmployeeDetails.headcount);

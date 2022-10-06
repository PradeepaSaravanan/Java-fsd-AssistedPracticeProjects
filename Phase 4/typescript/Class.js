var Employee = /** @class */ (function () {
    function Employee(code, name) {
        this.empcode = 0;
        this.empname = "";
        this.dept = "IT";
        this.empcode = code;
        this.empname = name;
    }
    Employee.prototype.display = function () {
        var num = 23;
        console.log("empcode=" + this.empcode);
        console.log("empname=" + this.empname);
        console.log("num=" + num);
        console.log("department=" + this.dept);
    };
    return Employee;
}());
var emp = new Employee(1, 'Anish');
emp.display();

class Employees {
    constructor(id, name) {
        this.empid = 0;
        this.empname = "";
        this.empid = id;
        this.empname = name;
    }
    get id() {
        return this.empid;
    }
    get name() {
        return this.empname;
    }
    show() {
        console.log("Id=" + this.id);
        console.log("name=" + this.name);
    }
}
class reg_employee extends Employees {
    constructor(id, name, salary) {
        super(id, name);
        this.salary = 0;
        this.salary = salary;
    }
    get sal() {
        return this.salary;
    }
    display() {
        super.show();
        console.log("Salary=" + this.salary);
    }
}
let emp1 = new reg_employee(1, "Suha", 20000);
emp1.display();

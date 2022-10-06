var Developer = /** @class */ (function () {
    function Developer(id, name, tasks) {
        this.id = id;
        this.name = name;
        this.tasks = tasks;
        this.id = id;
        this.name = name;
        this.tasks = tasks;
    }
    Developer.prototype.dowork = function () {
        console.log("".concat(this.name, " writes code"));
    };
    return Developer;
}());
var dev = new Developer(1, 'KARAN', ['writing', 'reading', 'testing']);
dev.dowork();

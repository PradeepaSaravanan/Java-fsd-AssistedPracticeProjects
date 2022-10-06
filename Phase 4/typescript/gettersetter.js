class Rectangle {
    constructor() {
        this.len = 0;
        this.bred = 0;
    }
    get length() {
        return this.len;
    }
    get breadth() {
        return this.bred;
    }
    set length(l) {
        this.len = l;
    }
    set breadth(b) {
        this.bred = b;
    }
}
let rect = new Rectangle();
rect.length = 20;
rect.breadth = 10;
console.log("Length:" + rect.length);
console.log("breadth:" + rect.breadth);

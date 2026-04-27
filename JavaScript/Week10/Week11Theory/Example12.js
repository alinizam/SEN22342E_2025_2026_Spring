function employee(name){
    this.name=name;
} 
const e1=new employee("Ahmet");
console.log(e1.constructor==employee);
console.log(e1.constructor.prototype==employee.prototype);
console.log(e1.__proto__==employee.prototype);
console.log(e1.__proto__==Object.getPrototypeOf(e1));


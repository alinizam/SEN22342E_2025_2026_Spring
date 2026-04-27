function employee(n){
    this.name=n;
}
const emp1=new employee("Ahmet");
console.log(emp1.name)

const emp2=new employee("Ayşe");
console.log(emp2.name)

employee.prototype.salary=2000;

const emp3=new employee("Kemal");
console.log(emp3.salary)

employee.prototype.name="Hasan";
console.log(emp2.name);
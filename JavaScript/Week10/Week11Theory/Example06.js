function employee(n,startYear){
    this.name=n; 
    this.startYear=startYear;
    this.getSalary=function(){
        return this.salary;
    };
}
console.log(employee.prototype.salary);
employee.prototype.salary=5000;

employee.prototype.getWorkingDuration=function(){
    return 2026-this.startYear;
}

const e1=new employee("Ahmet",2000);
console.log(e1.getSalary());
console.log(e1.getWorkingDuration());
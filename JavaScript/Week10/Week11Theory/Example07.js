const employee={
    firstName:"Ahmet",
    salary:5000    
}
const e1=Object.create(employee);
e1.hireDate=2026;
console.log(e1.hireDate)
console.log(e1.firstName)
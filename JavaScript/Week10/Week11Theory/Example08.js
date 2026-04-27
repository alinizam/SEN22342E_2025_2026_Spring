const employee={
    firstName:"Ahmet",
    salary:5000    
}
const e1=Object.create(employee,{salary:{value:2000}});
 
console.log(e1.salary)
console.log(e1.firstName)
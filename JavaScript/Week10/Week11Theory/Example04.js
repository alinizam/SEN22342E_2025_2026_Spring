//Non functional Object example
const employee={
    firstName:"Ahmet",
    lastName:"AK",
    getName:function(){
        return this.firstName+" "+this.lastName;
    }    
}

console.log(employee.firstName);
console.log(employee.getName())
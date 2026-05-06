const add=(a,b)=>(a+b);  
const minus=(a,b)=>(a-b);
const multiply=(a,b)=>(a*b);

function executeFunction(f, a, b){
    return f(a,b);
}

console.log(executeFunction(multiply,3,2));
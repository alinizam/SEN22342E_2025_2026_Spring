const add=(a,b)=>(a+b);  
const minus=(a,b)=>(a-b);
const multiply=(a,b)=>(a*b);
const array=[add, minus, multiply];
function callOperation(array,index){
    return array[index];
}

console.log(callOperation(array,3)(3,2));
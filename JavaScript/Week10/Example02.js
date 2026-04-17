function f1(a,b){
    return a+b;
}

console.log(f1(1,2));

const f2=function f1(a,b){
    return a+b;
}

console.log(f2(1,4));

const f3=(a,b)=>(a+b);
console.log(f3(1,6));


console.log((function f1(a,b){
    return a+b;
})(1,3));


function f(){
    console.log(this.firstName);
}
f();

const obj={
    firstName:"Ahmet",
    b:f
}

obj.b();
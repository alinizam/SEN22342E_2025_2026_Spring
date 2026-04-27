function f(){
    this.instanteField="IF";
}
f.staticField="SF"
const obj=new f();
console.log(obj.staticField)
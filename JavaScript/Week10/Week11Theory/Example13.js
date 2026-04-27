function Base(){
    this.x=10;
};
function Derived(){
    Base.call(this); 
};
Object.setPrototypeOf(Derived.prototype,Base.prototype);

const drivedObj=new Derived();
console.log(drivedObj.x);


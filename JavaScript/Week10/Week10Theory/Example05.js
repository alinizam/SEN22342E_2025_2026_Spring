function f1(){return 5};
const c=()=>(1);
array=[f1, c]
for (let index = 0; index < array.length; index++) {
    console.log(array[index]()) 
}

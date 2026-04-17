function foo() {   
function bar(a) {     
   var i = 2; // changing the 'i' in the enclosing scope's for-loop     
   console.log(a+i);   
}   
for (var i=0; i<10; i++) {     
   bar(i);
} 
} 
foo();

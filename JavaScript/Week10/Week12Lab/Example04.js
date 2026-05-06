function createPerson(name,age){
    return {  name: name,  
              age: age,  
              greet: function() {   
                                  return 'My name is '+name+"  and  I am "+age+ ' years old.'; 
              }
    }
}


const ahmet=createPerson("Ahmet",33);
console.log(ahmet.greet());

const ayse=createPerson("Ayşe",30);
console.log(ayse.greet());
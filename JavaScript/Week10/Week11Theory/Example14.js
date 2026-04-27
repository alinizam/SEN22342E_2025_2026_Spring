var data = [];
 
for (let k = 0; k < 3; k++) {
  data[k] = function () {
    console.log(k);
  };
}

for (let index = 0; index < data.length; index++) {
    data[index](); 
}
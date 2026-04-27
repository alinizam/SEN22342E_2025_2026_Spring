function f1(f2,f3){
    console.log(f2(),f3());
}

f1(()=>("Hello"),()=>("World"))
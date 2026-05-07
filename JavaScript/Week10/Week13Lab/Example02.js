function f(){
    return {
        m1:function (){
            console.log("m1 is called")
        }
    }
}

function f1(){
    return {
        m1(){
            console.log("m1 is called")
        },
        m2(){
            console.log("m2 is called")
        }
    }
}
const caller=new f();
caller.m1();

const caller1=new f1();
caller1.m1();
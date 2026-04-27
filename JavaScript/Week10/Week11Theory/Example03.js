const  module=(function modulFunction(){
    function a(){
        console.log("a called");
    }
    function b(){
        console.log("b called");
    }
    return {f1:a,
            f2:b};
})();

module.f1();
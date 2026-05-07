var Request = function (amount) {
    this.amount = amount;
    console.log("Requested: $" + amount + "\n");
}

Request.prototype = {
    get: function (bill) {
        var count = Math.floor(this.amount / bill);
        if (this.amount > count * bill){
            this.amount -= count * bill;
            console.log("Dispense " + count + " $" + bill + " bills");
            
        }else{
            console.log("Not enough money");
        }
        return this;            
    }
}
function run() {
    var request = new Request(378);

    request.get(100).get(50).get(20).get(10).get(5).get(1).get(10);
}

run()
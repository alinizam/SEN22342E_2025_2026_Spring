function add(x, y) { return x + y; }
function sub(x, y) { return x - y; }
function mul(x, y) { return x * y; }
function div(x, y) { return x / y; }
//Our basic operational functions

// We have command constructor 
// execute is the main func that will do the operation
// undo is the func that stores the opposite of that func in case of a undo

var Command = function (execute, undo, value) {
    this.execute = execute;
    this.undo = undo;
    this.value = value;
}

// these are our concrete functions 
var AddCommand = function (value) {
    return new Command(add, sub, value);
};

var SubCommand = function (value) {
    return new Command(sub, add, value);
};

var MulCommand = function (value) {
    return new Command(mul, div, value);
};

var DivCommand = function (value) {
    return new Command(div, mul, value);
};


//Our object for Calculator
var Calculator = function (initValue) {
    var current = initValue;
    var commands = [];

    //for being able to show which operation is used in the console while testing we need the names of those commands.
    function action(command) {
        return command.execute.name;
    }

    return {//we are returning 3 functions
        execute: function (command) {
            current = command.execute(current, command.value);
            commands.push(command);
            console.log(action(command) + ": " + command.value);
        },

        undo: function () {
            var command = commands.pop();
            current = command.undo(current, command.value);
            console.log("Undo " + action(command) + ": " + command.value);
        },

        getCurrentValue: function () {
            return current;
        }
    }
}

function run() {

    var calculator = new Calculator(0);

    // issue commands
    calculator.execute(new AddCommand(100));
    calculator.execute(new SubCommand(24));
    calculator.execute(new MulCommand(6));
    calculator.execute(new DivCommand(2));

    // reverse last two commands
    calculator.undo();
    calculator.undo();

    console.log("\nValue: " + calculator.getCurrentValue());
}


run()
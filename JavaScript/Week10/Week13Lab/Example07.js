// ============================================================
// 1. Car Constructor Function
// ============================================================
function Car(maker, model) {
  this.maker = maker;
  this.model = model;
}
// Method: startEngine # 1.st
Car.prototype.startEngine = function () {
  return `${this.maker} ${this.model}'s engine started.`;
};

// ============================================================
// 2. ElectricCar Constructor Function (inherits from Car)
// ============================================================
function ElectricCar(maker, model, batteryLevel) {
  Car.call(this, maker, model); // inherit properties using 'new' keyword logic # 2.nd
  this.batteryLevel = batteryLevel || 0; // # 3.rd
}

// Prototype chain kurulumu
// with this we are enabling the prototype of the electric car to inherit the methods inside of the Car.prototype
// Bu satırdan sonra ElectricCar.prototype, artık bir Car nesnesi olur.
// Dolayısıyla electric car'ın constructor özelliği de otomatik olarak Car'ı gösterir.
ElectricCar.prototype = new Car;
ElectricCar.prototype.constructor = ElectricCar;

// Method: chargeBattery # 4.th
ElectricCar.prototype.chargeBattery = function () {
  this.batteryLevel = 100;
  console.log("Battery charged to 100%.");
};

// Override: startEngine # 5.th
ElectricCar.prototype.startEngine = function () {
  if (this.batteryLevel > 0) {
    return `${this.make}, ${this.model}'s engine started. Battery level: ${this.batteryLevel}%`;
  } else {
    return `${this.make} ${this.model}'s engine cannot start. Battery is empty!`;
  }
};

// ============================================================
// 3. Test
// ============================================================

// Normal Car testi
let myCar = new Car("Toyota", "Corolla");
console.log(myCar.startEngine());// → Toyota Corolla's engine started.

// ElectricCar testi
const myTesla = new ElectricCar("Tesla", "Model 3", 0);
console.log(myTesla.startEngine()); // → Tesla Model 3's engine cannot start. Battery is empty!
myTesla.chargeBattery(); // Şarj et ve tekrar dene
console.log(myTesla.startEngine());// → Battery charged to 100%. Tesla Model 3's engine started.

// Başlangıç bataryası ile test
const myBMW = new ElectricCar("BMW", "iX", 75);
console.log(myBMW.startEngine());// → BMW iX's engine started. Battery level: 75%


// ============================================================
// 4. Car Object ile çözüm (not function)
// ============================================================
const CarObject = {
  make: "",
  model: "",
  startEngine() {
    return `${this.make} ${this.model}'s engine started.`;
  },
};

// Object.create ile ElectricCar nesnesi
const ElectricCarObject = Object.create(CarObject);
ElectricCarObject.batteryLevel = 0;

ElectricCarObject.chargeBattery = function () {
  this.batteryLevel = 100;
  console.log(`Battery charged to 100%.`);
};

ElectricCarObject.startEngine = function () {
  if (this.batteryLevel > 0) {
    return `${this.make} ${this.model}'s engine started. Battery level: ${this.batteryLevel}%`;
  } else {
    return `${this.make} ${this.model}'s engine cannot start. Battery is empty!`;
  }
};

// Object testi
const myRivian = Object.create(ElectricCarObject);
myRivian.make = "Rivian";
myRivian.model = "R1T";
myRivian.batteryLevel = 50;

console.log(myRivian.startEngine());
// → Rivian R1T's engine started. Battery level: 50%

myRivian.chargeBattery();
console.log(myRivian.startEngine());
// → Rivian R1T's engine started. Battery level: 100%
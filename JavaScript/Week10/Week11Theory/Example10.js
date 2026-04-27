const shape={
    getArea:function(){
        return this.x*this.y;
    }
}
console.log(shape.getArea());

const square={
    x:10,
    y:10,
    __proto__:shape
}


console.log(square.getArea());

const rectangle={
    x:10,
    y:20,
    __proto__:square
}

console.log(rectangle.getArea());

const triangle={
    x:10,
    y:20
}
Object.setPrototypeOf(triangle,shape);
console.log(triangle.getArea());


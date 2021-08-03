function sum(a, b) { //Java style
    console.log(a + b)
}
sum(10, 2);

var sum2 = function (a, b) { //JS style, annonymous way
    console.log(a + b)
}
sum2(10, 2);

// function programming
var sumA = (a, b) => { //ES6, arrow function ( Lambda function),
    console.log(a + b)
}
sumA(10, 2)

var add = (a, b) => {
    return a + b;
}
const result = add(10, 2)
console.log("Result ", result)

export const addLamdaWay = (a , b) => a + b
console.log("Result ", addLamdaWay(10, 20))

export class Bank {
    constructor(name) {
       this.name = name;
    }
}

export class Car extends Bank {
    constructor() {
        super();
    }
}

export default sumA
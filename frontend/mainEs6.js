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


///ES6 features
//spread operator =>
// named property
const student = { //student json object
    firstName: 'Ram',
    college: 'NSW ',
    country: 'Australia'
}
//1 way
console.log(student.firstName, student.college, student.country)
//2 way
const { firstName, college, country } = student
console.log(firstName, college, country)

//Copy by reference or copy by value.
const studCopy = student //copy by reference
const studValueCopy = {...student} //copy value(no reference) => Spread operator (...)
console.log(studCopy)


export class Bank {
    constructor(name) {
       this.name = name;
    }
}

export class Car extends Bank {
    constructor(props) {
        super(props);
    }
}

export default sumA
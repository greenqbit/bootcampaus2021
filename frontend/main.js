function chagen(jQuery) {
    (function() {
        const colorDiv = document.getElementById("colorDiv");
        colorDiv.style.color = 'green';
    })(jQuery) //IEE
}

chagen

function changeColor() {
    //only two datatype in javascript
    //var , const (es6)
    const colorDiv = document.getElementById("colorDiv");
    colorDiv.style.color = 'green';
}

function showDialog() {
    alert('Bootcamp readonly web from Today :) ')
}

function init() {
    console.log(1, 'First JS Program') //System.out.println(1 + "First JS Program");
    var x = 20;
    var y = 30;
    var sum = x + y;
    console.log('Sum: ', sum)

    var nos = [30, 20, 15]
    nos.sort()

    var mathMarks = 90;
    if(mathMarks >= 40 && mathMarks <= 100) {
        console.log("PASS in Math")
    } else {
        console.log("failed in Math")
    }

    var mathMarksX = '40'
    if(mathMarksX == 40) { //check value
        console.log("JUST PASS")
    }
    if(mathMarksX === 40) { //check value and data type
        console.log("JUST PASS");
    }

    var mathMarkXInt = parseInt(mathMarksX); //int: gurranted

    //Date===
    var d = new Date();
    console.log("Date: ", d);
    console.log("Date: Min ", d.getMonth());

    //====TimeOut
    console.log("Before Timeout");
    setTimeout(function (){
        console.log("Heavey task runing in next cycle ");
    }, 3000);
    console.log("After Timeout");

    console.log("The End");

}

init()
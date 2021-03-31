var getNextArmstrong = /** @class */ (function () {
    function getNextArmstrong() {
    }
    getNextArmstrong.prototype[Symbol.iterator] = function () {
        var no = 0;
        return {
            next: function () {
                var temp = returnArmstrong(++no);
                no = temp;
                return { value: temp };
            }
        };
    };
    return getNextArmstrong;
}());
function returnArmstrong(num) {
    var noofdigits = num.toString().length;
    var temp = num, sum = 0, remainder;
    while (temp > 0) {
        remainder = temp % 10;
        sum += Math.pow(remainder, noofdigits);
        temp = Math.floor(temp / 10);
    }
    if (sum == num) {
        return num;
    }
    else {
        num = num + 1;
        return returnArmstrong(num);
    }
}
var arm = new getNextArmstrong()[Symbol.iterator]();
console.log(arm.next().value);
console.log(arm.next().value);
console.log(arm.next().value);
console.log(arm.next().value);
console.log(arm.next().value);
console.log(arm.next().value);
console.log(arm.next().value);
console.log(arm.next().value);
console.log(arm.next().value);
console.log(arm.next().value);
console.log(arm.next().value);
console.log(arm.next().value); // for more numbers call next() again

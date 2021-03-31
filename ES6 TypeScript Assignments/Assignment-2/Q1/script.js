var Fibonaaci = /** @class */ (function () {
    function Fibonaaci() {
        this.previousNo = Symbol('n1');
        this.currentNo = Symbol('n2');
    }
    Fibonaaci.prototype[Symbol.iterator] = function () {
        var n1 = 0, n2 = 1, value;
        return {
            next: function () {
                var _a;
                _a = [n1, n2, n1 + n2], value = _a[0], n1 = _a[1], n2 = _a[2];
                return { value: value };
            }
        };
    };
    return Fibonaaci;
}());
var fib = new Fibonaaci();
var f = fib[Symbol.iterator]();
console.log("Fibonacci series");
console.log("The next value: ", f.next().value);
console.log("The next value: ", f.next().value);
console.log("The next value: ", f.next().value);
console.log("The next value: ", f.next().value);
console.log("The next value: ", f.next().value);
console.log("The next value: ", f.next().value);
console.log("The next value: ", f.next().value);
console.log("The next value: ", f.next().value); //Even more can be added, just call next().value;

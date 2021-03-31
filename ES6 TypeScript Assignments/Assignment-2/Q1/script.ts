class Fibonaaci {
    previousNo=Symbol('n1');
    currentNo= Symbol('n2');
    [Symbol.iterator](){
        let n1=0,n2=1,value;
        return{
            next(){
                [value,n1,n2] = [n1, n2, n1+n2];
                return {value: value};
            }
        };
    }
}

var fib= new Fibonaaci();
var f= fib[Symbol.iterator]();
console.log("Fibonacci series");
console.log("The next value: ",f.next().value);
console.log("The next value: ",f.next().value);
console.log("The next value: ",f.next().value);
console.log("The next value: ",f.next().value);
console.log("The next value: ",f.next().value);
console.log("The next value: ",f.next().value);
console.log("The next value: ",f.next().value);
console.log("The next value: ",f.next().value);   //Even more can be added, just call next().value;


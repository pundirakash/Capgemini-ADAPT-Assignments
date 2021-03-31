class getNextArmstrong{
    
    [Symbol.iterator](){
        var no = 0;
        return{
            next(){
                let temp=returnArmstrong(++no);
                no=temp;
                return {value: temp }
            }
        }
    }
}

function returnArmstrong(num) {
    let noofdigits=num.toString().length;
    let temp= num,sum=0,remainder;
    while(temp>0)
    {
        remainder = temp %10;
        sum += remainder ** noofdigits;
        temp = Math.floor(temp/10);
    }
    if(sum == num)
    {
       return num;
    }
    else
    {
        num= num+1;
       return returnArmstrong(num);        
    }  
    
}

let arm = new getNextArmstrong()[Symbol.iterator]();
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
console.log(arm.next().value);  // for more numbers call next() again

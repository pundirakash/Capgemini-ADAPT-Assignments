interface Printable{
    radius? : Number,
    Area? : Number,
    name?: String,
    email?: String,
    Salary?: Number,
    onProject?:Boolean
}

const Circle: Printable ={
    radius : 5,
    Area : 78.54
}

const Employee: Printable ={
    name : 'Alisha',
    email : 'ak@gmail.com',
    Salary: 100,
    onProject: false 
}

function printAll(...objs){
    for( let i of objs)
    {
        prints(i);
    }
}

let prints= (i)=>{
    console.log(i);
}

printAll([Circle,Employee]);



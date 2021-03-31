class Account{
    constructor(id,name,balance)
    {
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    getBalance()
    {
        return this.balance;
    }
}

class SavingAccount extends Account{
    constructor(id,name,balance)
    {
        super(id,name,balance);
        this.interest = 8.9;
    }
}

class CurrentAccount extends Account{
    constructor(id,name,balance)
    {
        super(id,name,balance);
        this.cash_credit = 50000;
    }
}

var s1 = new SavingAccount(1,'Alisha',20000);
var s2 = new SavingAccount(2,'Snowbell',20000);

var c1 = new CurrentAccount(1,'Nitin',30000);
var c2 = new CurrentAccount(2,'Snow',45000);

console.log("Saving acc1 ",s1);
console.log("Saving acc2 :",s2);
console.log("Current acc1 :",c1);
console.log("Current acc2 :" ,c2);

console.log("Saving acc1 balance: "+s1.getBalance());
console.log("Saving acc2 balance: "+s2.getBalance());
console.log("Current acc1 balance: "+c1.getBalance());
console.log("Current acc2 balance: "+c2.getBalance());

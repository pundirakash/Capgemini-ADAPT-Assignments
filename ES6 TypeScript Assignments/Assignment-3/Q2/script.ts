class Account{
    balance;
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

    static totalBalance(...accounts)
    {
        let total=0
        for( let acc of accounts)
        {
            total+=acc.balance;
        }
        return total;
    }
}

class SavingAccount extends Account{
    interest;
    constructor(id,name,balance)
    {
        super(id,name,balance);
        this.interest = 8.9;
    }
}

class CurrentAccount extends Account{
    cash_credit;
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

//get total balance in bank
console.log("Total balance of SavingAcc1 and currentAcc1: ",Account.totalBalance(s1,c1));

var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Account = /** @class */ (function () {
    function Account(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    Account.prototype.getBalance = function () {
        return this.balance;
    };
    Account.totalBalance = function () {
        var accounts = [];
        for (var _i = 0; _i < arguments.length; _i++) {
            accounts[_i] = arguments[_i];
        }
        var total = 0;
        for (var _a = 0, accounts_1 = accounts; _a < accounts_1.length; _a++) {
            var acc = accounts_1[_a];
            total += acc.balance;
        }
        return total;
    };
    return Account;
}());
var SavingAccount = /** @class */ (function (_super) {
    __extends(SavingAccount, _super);
    function SavingAccount(id, name, balance) {
        var _this = _super.call(this, id, name, balance) || this;
        _this.interest = 8.9;
        return _this;
    }
    return SavingAccount;
}(Account));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(id, name, balance) {
        var _this = _super.call(this, id, name, balance) || this;
        _this.cash_credit = 50000;
        return _this;
    }
    return CurrentAccount;
}(Account));
var s1 = new SavingAccount(1, 'Alisha', 20000);
var s2 = new SavingAccount(2, 'Snowbell', 20000);
var c1 = new CurrentAccount(1, 'Nitin', 30000);
var c2 = new CurrentAccount(2, 'Snow', 45000);
console.log("Saving acc1 ", s1);
console.log("Saving acc2 :", s2);
console.log("Current acc1 :", c1);
console.log("Current acc2 :", c2);
//get total balance in bank
console.log("Total balance of SavingAcc1 and currentAcc1: ", Account.totalBalance(s1, c1));

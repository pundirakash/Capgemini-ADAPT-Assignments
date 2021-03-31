var __generator = (this && this.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (_) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};
var getNextArmstrong = /** @class */ (function () {
    function getNextArmstrong() {
    }
    getNextArmstrong.prototype[Symbol.iterator] = function () {
        var num, noofdigits, temp, sum, remainder, error_1;
        return __generator(this, function (_a) {
            switch (_a.label) {
                case 0:
                    _a.trys.push([0, 5, , 7]);
                    num = this.no;
                    num = 0;
                    _a.label = 1;
                case 1:
                    if (!(num < 1000)) return [3 /*break*/, 4];
                    noofdigits = num.toString().length;
                    temp = num;
                    sum = 0, remainder = void 0;
                    while (temp > 0) {
                        remainder = temp % 10;
                        sum += Math.pow(remainder, noofdigits);
                        temp = Math.floor(temp / 10);
                    }
                    if (!(sum == num)) return [3 /*break*/, 3];
                    return [4 /*yield*/, num];
                case 2:
                    _a.sent();
                    _a.label = 3;
                case 3:
                    num++;
                    return [3 /*break*/, 1];
                case 4: throw "Limit exceeded. Reset using reset() function";
                case 5:
                    error_1 = _a.sent();
                    return [4 /*yield*/, error_1];
                case 6:
                    _a.sent();
                    return [3 /*break*/, 7];
                case 7: return [2 /*return*/];
            }
        });
    };
    getNextArmstrong.prototype.reset = function () {
        this.no = 0;
    };
    return getNextArmstrong;
}());
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
console.log(arm.next().value);
console.log(arm.next().value);
console.log(arm.next().value);
console.log(arm.next().value);

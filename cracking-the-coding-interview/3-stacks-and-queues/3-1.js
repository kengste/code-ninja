var Stack = require('./Stack.js');

var TripleStack = function () {
  this._arrayOfValues = [];
  this._lengths = [0,0,0];
  this._container = [new Stack(), new Stack(), new Stack()];
}

TripleStack.prototype._getLength = function(stack) {
  return this._lengths[stack - 1];
}

TripleStack.prototype.push = function(stack, value) {
  this._container[stack - 1].push(value);
  let index = this._getLength(stack) * 3 + stack - 1;
  this._arrayOfValues[index] = value;
  this._lengths[stack - 1]++;
}

TripleStack.prototype.pop = function(stack) {
  this._container[stack - 1].pop();
  let length = this._getLength(stack);
  let value;
  if (length > 0) {
    let index = this._getLength(stack) * 3 + stack - 1;
    value = this._arrayOfValues[index];
    this._arrayOfValues[index] = undefined;
    this._lengths[stack - 1]--;
  }
  return value;
}

// TEST
var test1 = new TripleStack();
console.log('length', test1);
test1.push(1, 'apple');
test1.push(3, 'apple');
test1.push(3, 'apple');
test1.pop(3);
console.log('array: ', test1._arrayOfValues);
console.log('length: ', test1._lengths);
console.log('container: ', test1._container);
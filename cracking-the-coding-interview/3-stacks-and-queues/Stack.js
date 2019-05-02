const { LinkedList } = require('./LinkedList.js');

var Stack = function() {
  this.top = null;
}

Stack.prototype.push = function(value) {
  var node = new LinkedList(value);
  node.next = this.top;
  this.top = node;
}

Stack.prototype.pop = function() {
  var popped = this.top;
  if (this.top !== null) {
    this.top = this.top.next;
  }
  return popped.value;
}

Stack.prototype.peek = function() {
  return this.top !== null ? this.top.value : null;
}

Stack.prototype.isEmpty = function() {
  return this.top === null;
}

module.exports = Stack;
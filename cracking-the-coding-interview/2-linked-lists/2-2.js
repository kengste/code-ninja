const { LinkedList } = require('./LinkedList.js');

function findKthToLast(k, head) {
  if (head === null || k < 1) {
    return;
  } else if (k === 1) {
    console.log(head.value);
    findKthToLast(k, head.next);
  } else {
    findKthToLast(k - 1, head.next);
  }
}

/* TESTS */
var a = new LinkedList('1');
var b = new LinkedList('2');
var c = new LinkedList('3');
var d = new LinkedList('4');
var e = new LinkedList('5');
var f = new LinkedList('6');
var g = new LinkedList('7');

a.next = b;
b.next = c;
c.next = d;
d.next = e;
e.next = f;
f.next = g;

findKthToLast(3, a);
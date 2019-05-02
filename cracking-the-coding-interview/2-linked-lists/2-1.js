const { LinkedList } = require('./LinkedList.js');

function removeDups(head) {
  var node = head;
  while (node !== null) {
    if (node.next !== null && checkDups(node, node.next)) {
      node.next = node.next.next;
    } else {
      node = node.next;
    }
  }
  return head;
}

function checkDups(head, node) {
  var current = head;
  while (current !== node) {
    if (current.value === node.value) {
      return true;
    }
    current = current.next;
  }
  return false;
}

function printLinkedList(head) {
  var node = head;
  console.log('start of linked list');
  while (node !== null) {
    console.log(node.value);
    node = node.next;
  }
  console.log('end of linked list');
};

/* TESTS */
var a = new LinkedList('a');
var b = new LinkedList('b');
var z = new LinkedList('b');
var c = new LinkedList('c');
var d = new LinkedList('d');
var e = new LinkedList('e');

a.next = b;
b.next = z;
z.next = c;
c.next = d;
d.next = e;

removeDups(a);
printLinkedList(a);
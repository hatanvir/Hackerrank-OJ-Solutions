/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
    Node newNode = new Node();
    newNode.data = data;
    Node privious = head;
    if(position == 0){
        newNode.next = head;
        return newNode;
    }
    int count = 0;
    while(count < position-1){
        privious=privious.next;
        count++;
    }
    newNode.next = privious.next;
    privious.next = newNode;
    
    return head;
}

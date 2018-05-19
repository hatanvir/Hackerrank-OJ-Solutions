void Print(Node head) {
    Node current = head;
		if(current == null){
            return;
        }
		while(current != null){
			System.out.println(current.data);
            current=current.next;
		}
}

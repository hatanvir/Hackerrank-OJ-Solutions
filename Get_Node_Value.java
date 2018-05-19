
int GetNode(Node head,int n) {
    Node current = head;
        Vector<Integer> vec = new Vector<Integer>();
        
        if(head == null){
            return current.data;
        }
        
        int value = 0;
        while(current != null){
            vec.addElement(current.data);
            current = current.next;
        }
        Collections.reverse(vec);
      for(int i=0;i<vec.size();i++){
          if(i == n){
              value = vec.get(i);
          }
      }
        return value;
    }

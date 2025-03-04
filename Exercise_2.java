class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) { this.data = data;} 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if( root == null){
            return true;
        }
        else
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
 
        if (root == null) {
            root = newNode;
        }
        else {
            StackNode pastRoot = root;
            root = newNode;
            newNode.next = pastRoot;
        }
        System.out.println(data + " pushed to stack");
    } 
  
    public int pop() 
    { 	
	
    int popped = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is underflow");
        }
        else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
         if(isEmpty()) {
            return 0;
      
        }
        else {
            return root.data;
        }
    } 
  
	
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 

/**a backed linkedList data structure
 */
public class Stack {

    StackNode root;

    static class StackNode{
        int data;
        StackNode next;
        StackNode(int data){
            this.data = data;
        }
    }

    public boolean isEmpty(){
        if (root == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void push(int data){
        StackNode newNode = new StackNode(data);

        //check if stack is empty
        if(root == null){
            root = newNode;
        }
        else{

            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println( data + " pushed to pop");
    }
    public int pop(){
        int popped = Integer.MAX_VALUE;
        System.out.println(popped);
        if(root == null){
            System.out.println(" Stack is empty");
        }
        else{
            popped = root.data;
            root = root.next;
        }
        return  popped;

    }
    public int peek(){

        if (root == null){
            System.out.println("Stack is Empty");
            return Integer.MAX_VALUE;
        }
        else{
            return  root.data;
        }
    }

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

       System.out.println(stack.peek());

    }

}

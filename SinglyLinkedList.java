public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(Object data){
        Node node = new Node();
        node.setElement(data);
        node.setNext(head);
        head = node;
        if(size == 0){
            tail = node;
        }
        size++;
    }

    public Object removeFirst(){
        if (size == 0){
            return("Error list is empty");
        }
        
        else{
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
            size--;
            
            if(isEmpty()){
                head = null;
                tail = null;
            }
            return(temp.getElement());
        }
    }

    public void addLast(Object data){       
        Node n = new Node();
        n.setElement(data);
        n.setNext(null);

        if(size == 0){
            head = n;
            tail = n;
        }

        else{
            tail.setNext(n);
            tail = n;
        }

        size++;
    }

    public Object removeLast(){
        if(size == 0){
            return("Error: List is empty");
        }

        else if (size == 1) {
            Object lastElem = tail.getElement();
            head = null;
            tail = null;
            size = 0;
            return lastElem;
        }

        else {
            Node n = head;
    
            for(int i = 0; i < size - 2; i++) {
                n = n.getNext();
            }
    
            Object lastElem = tail.getElement();
            n.setNext(null);
            tail = n;
            size--;
            return lastElem;
        }
    }

    public Object getFirst(){
        if(isEmpty()){
            return("Error: List is empty");
        }
        
        return(head.getElement());
    }

    public Object getLast(){
        if(isEmpty()){
            return("Error: List is empty");
        }
        return(tail.getElement());
    }

    public int size(){
        return(size);
    }

    public boolean isEmpty(){
        return(size == 0);
    }
}

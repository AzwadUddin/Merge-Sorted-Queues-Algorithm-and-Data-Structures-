import java.util.NoSuchElementException;

public class Queue {
    private SinglyLinkedList list;
    private Node front;
    private Node rear;
    
    public Queue(){
        list = new SinglyLinkedList();
        front = null;
        rear = null;
    }

    public void enqueue(Object o){
        Node n = new Node();
        n.setElement(o);
        n.setNext(null);

        list.addLast(o);

        if(front == null){
            front = n;
            rear = n;
        }

        else{
            rear.setNext(n);
            rear = n;
        }
    }

    public Object dequeue(){
        if(!isEmpty()){
            return(list.removeFirst());
        }

        else{
            throw new NoSuchElementException("Queue is empty");
        }
    }

    public Object front(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }

        else{
            return(list.getFirst());
        }
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return(list.isEmpty());
    }
}

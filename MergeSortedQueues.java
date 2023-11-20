import java.util.Scanner;

public class MergeSortedQueues {
    public static Queue mergeSortedQueues(Queue A, Queue B){
        Queue S = new Queue(); 
        while(!A.isEmpty() && !B.isEmpty()){    
            if ((int) A.front() < (int) B.front()){ 
                S.enqueue(A.dequeue()); 
            }

            else{
                S.enqueue(B.dequeue()); 
            }
        }

        
        while(!A.isEmpty()){
            S.enqueue(A.dequeue());
        }

        while(!B.isEmpty()){
            S.enqueue(B.dequeue());
        }

        return S; 
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);  //declare scanner
        Queue A = new Queue();  //declare input queues 'A' and 'B'
        Queue B = new Queue();
        Queue S = new Queue();  //declare queue 'S' which will store the sorted queues

        System.out.print("Please enter the sorted list 'A' with each number separated by a comma (,): ");
        String inputA = scnr.nextLine();    //user nextLine() to read entire line of inupt provided by user, store into String variable inputA
        String[] numbersA = inputA.split(",");  //create array of type String and use split() to store each value with comma (,) as delimiter
        for(String numStr : numbersA){  //for each loop to iterate through numbersA which contains users input as strings
            A.enqueue(Integer.parseInt(numStr));    //enqueue each number into 'A'
        }

        //same again for 'B'
        System.out.print("Please enter the sorted list 'B' with each number separated by a comma (,): ");
        String inputB = scnr.nextLine();
        String[] numbersB = inputB.split(",");
        for(String numStr : numbersB){
            B.enqueue(Integer.parseInt(numStr));
        }

        scnr.close();   //close scanner to avoid memory leak

        S = mergeSortedQueues(A, B);    //call method to merge queues, store data in 'S'

        //output merged queue
        System.out.print("The merged result is: ");
        while(!S.isEmpty()){
            System.out.print(S.dequeue() + ", ");
        }

        System.out.println();   //newline
    }
}

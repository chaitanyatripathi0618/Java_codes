

public class ReverseLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;

        }
    }
    public static class LinkedList{
        Node head= null;
        Node tail=null;
        void insertAtEnd(int data){
            Node newData=new Node(data);
            if(head==null){
                head=newData;
            }
            else{
                tail.next=newData;
                
            }
            tail=newData;


        }
        void display(){
            int count =0;
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp= temp.next;
                
            }

        }

    }

    
    public static void main(String [] args){
       LinkedList a= new LinkedList();
       a.insertAtEnd(9);
       a.insertAtEnd(0);
       a.insertAtEnd(34);
       a.display();



        

    }
}

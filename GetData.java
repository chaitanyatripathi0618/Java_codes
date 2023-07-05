
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
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp= temp.next;
                
            }

        }
        int size(){
            int count=0;
            Node temp= head;
            while(temp!=null){
                count++;
                temp= temp.next;
                
            }
            return count;

        }
        void insertAtFirst(int data){
            Node newdata=new Node(data);
        
            if(head==null){
                head=newdata=tail;
            }else{
                newdata.next=head;
                head=newdata;
            }
        }
        void insertAtSpecificPosition(int n, int data ){
            Node t= new Node(data);
            Node temp= head;
            for(int i=1;i<=n-1;i++){
                temp=temp.next;

            }
            t.next=temp.next;
            temp.next=t;
        }
        int getData(int idx){
            Node temp = head;
            for(int i=0;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

    }

    
    public static void main(String [] args){
       LinkedList a= new LinkedList();
       a.insertAtEnd(9);
       a.insertAtEnd(0);
       a.insertAtSpecificPosition(2, 90);
       a.insertAtSpecificPosition(4, 60);
       a.display();
       a.insertAtEnd(34);
    //    a.display();
       a.insertAtFirst(20);
       a.display();
       System.out.println();
       System.out.println(a.size());
       a.getData(4);

    }
}

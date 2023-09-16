// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static class QueueA{
        int f=-1;
        int r=-1;
        int[] arr= new int[10];
        int size=0;
        public void add(int val){
            if(r==arr.length-1){
                System.out.print("Queue is full");
                return;
            }
            if(f==-1){
                f=r=0;
                arr[0]=val;
            }else{
                arr[++r]= val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.print("Queue is Empty pehle kucch dalde bhai");
                return -1;
            }
            f++;
            return arr[f-1];
            
        }
        public int topEle(){
            if(size==0){
                System.out.print("Queue is Empty pehle kucch dalde bhai");
                return -1;
            }
            return arr[f];
        }
        public void display(){
            if(size==0){
                System.out.print("Queue is Empty pehle kucch dalde bhai");
            }
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        QueueA q= new QueueA();
        q.add(1);
        q.display();
        
       
    }
}

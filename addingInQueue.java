
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(2);
        q.add(3);
        q.add(6);
        q.add(1);
        q.add(9);
        Queue<Integer> help= new LinkedList<>();
        while(q.size()>0){
            System.out.print(q.peek()+" ");
            help.add(q.poll());
        }
        while(help.size()>0){
            q.add(help.poll());
        }
    }
}

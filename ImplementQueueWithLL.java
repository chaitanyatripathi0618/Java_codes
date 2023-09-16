public class HelloWorld {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class QueueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int a = head.val;
            head = head.next;
            size--;
            return a;
        }

        public void display() {
            Node temp = head;
            if (size == 0) {
                System.out.println("Queue is Empty");
            } else {
                while (temp != null) {
                    System.out.print(temp.val + " ");
                    temp = temp.next;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueLL a = new QueueLL();
        a.display();
        a.add(8);
        a.add(4);
        a.add(2);
        a.display();
        a.remove();
        a.display();
        System.out.println(a.peek());
    }
}

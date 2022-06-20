import java.util.LinkedList;

public class FunctionClass {
    LinkedList<Integer> queue = new LinkedList<>();

    public void enQueue(int data) {
        queue.add(data);
    }

    public void toPrint() {
        System.out.println("Queue list is :");
        for (Integer i : queue) {
            System.out.println(" " + i);
        }
    }
}

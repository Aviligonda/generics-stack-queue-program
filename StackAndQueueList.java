public class StackAndQueueList {
    public static void main(String[] args) {
        System.out.println("Welcome to Stack And Queue List  Program");
        FunctionClass functionClass = new FunctionClass();
        functionClass.enQueue(56);
        functionClass.enQueue(30);
        functionClass.enQueue(70);
        functionClass.toPrint();
        functionClass.deQueue();
        functionClass.toPrint();
        functionClass.deQueue();
        functionClass.toPrint();
        functionClass.deQueue();
        functionClass.toPrint();
        functionClass.deQueue();
    }
}

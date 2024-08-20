public class Main {
    public static void main(String[] args) {

        System.out.println("Static Queue Test!");
        StaticQueueStack<Integer> staticQueueStack = new StaticQueueStack<Integer>(5);
        for (int i = 0; i < staticQueueStack.size; i++) {
                staticQueueStack.push(i);
        }
        System.out.println("Pop: "+staticQueueStack.pop());
        System.out.println(staticQueueStack.toString());

        System.out.println("Round Queue Test!");
        CircularQueue<Integer> circularQueue = new CircularQueue<Integer>(5);
        for (int i = 0; i < circularQueue.size; i++) {
            circularQueue.push(i);
        }
        circularQueue.remove();
        circularQueue.push(5);
        circularQueue.remove();
        circularQueue.push(6);
        circularQueue.remove();
        System.out.println(circularQueue.toString());
    }
}
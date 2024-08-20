public class Main {
    public static void main(String[] args) {

        System.out.println("Static Array Test!");
        StaticQueueStack<Integer> staticQueueStack = new StaticQueueStack<Integer>(5);
        for (int i = 0; i < staticQueueStack.size; i++) {
                staticQueueStack.push(i);
        }
        System.out.println("Pop: "+staticQueueStack.pop());
        System.out.println(staticQueueStack.toString());

        System.out.println("Dynamic Array Test!");
        DynamicQueueStack<Integer> dynamicQueueStack = new DynamicQueueStack<Integer>();
        for (int i = 0; i < 13; i++) {
            dynamicQueueStack.push(i);
        }
        System.out.println("Pop: "+dynamicQueueStack.pop());
        System.out.println(dynamicQueueStack.toString());
    }
}
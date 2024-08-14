public class Main {
    public static void main(String[] args) {

        System.out.println("Static Array Test!");
        StaticArrayStack<Integer> staticArrayStack = new StaticArrayStack<Integer>(5);
        for (int i = 0; i < staticArrayStack.size; i++) {
                staticArrayStack.push(i);
        }
        staticArrayStack.pop();
        System.out.println(staticArrayStack.toString());

        System.out.println("Dynamic Array Test!");
        DynamicArrayStack<Integer> dynamicArrayStack = new DynamicArrayStack<Integer>();
        for (int i = 0; i < 13; i++) {
            dynamicArrayStack.push(i);
        }
        dynamicArrayStack.pop();
        System.out.println(dynamicArrayStack.toString());
    }
}
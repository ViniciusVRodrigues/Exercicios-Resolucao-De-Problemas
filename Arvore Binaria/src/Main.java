public class Main {
    public static void main(String[] args) {
        TreeNode arvoreBinaria = new TreeNode(10);
        arvoreBinaria.add(5);
        arvoreBinaria.add(15);
        arvoreBinaria.add(3);
        arvoreBinaria.add(7);
        arvoreBinaria.add(12);
        arvoreBinaria.add(17);
        arvoreBinaria.add(1);
        arvoreBinaria.add(4);
        arvoreBinaria.add(6);
        arvoreBinaria.add(8);
        arvoreBinaria.add(11);
        arvoreBinaria.add(13);
        arvoreBinaria.print();
        System.out.println(arvoreBinaria.contains(10)); // true
        System.out.println(arvoreBinaria.contains(14)); // false
        arvoreBinaria.remove(10);
        System.out.println(arvoreBinaria.contains(10)); // false
        arvoreBinaria.print();
    }
}
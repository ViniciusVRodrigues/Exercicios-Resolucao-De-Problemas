public class Main {
    public static void main(String[] args) {
        //Testando a Lista Estatica
        ListaEstatica lista = new ListaEstatica(5);
        System.out.println(lista.isEmpty()? "A lista está vazia" : "A lista não está vazia");
        System.out.println(lista.isFull()? "A lista está cheia" : "A lista não está cheia");
        //add
        lista.add(1);
        lista.add(2);
        lista.add(3);
        //add na posição
        lista.add(4,1);
        lista.add(5,3);
        lista.add(6);
        System.out.println(lista.isEmpty()? "A lista está vazia" : "A lista não está vazia");
        System.out.println(lista.isFull()? "A lista está cheia" : "A lista não está cheia");
        System.out.println(lista.toString());
        //remove
        System.out.println("Removendo o elemento na posição 2: " + lista.remove(2));
        System.out.println("Removendo o elemento na posição 0: " + lista.remove(0));
        System.out.println(lista.toString());
        //find
        System.out.println("O elemento 3 está na posição: " + lista.find(3));
        //getData
        System.out.println("O elemento na posição 1 é: " + lista.getData(1));
        //setData
        lista.setData(10,1);
        System.out.println("O elemento na posição 1 é: " + lista.getData(1));
        //clear
        lista.clear();
        System.out.println(lista.isEmpty()? "A lista está vazia" : "A lista não está vazia");
    }
}
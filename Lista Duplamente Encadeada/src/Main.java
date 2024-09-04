public class Main {
    public static void main(String[] args) {
        Centopeia<Integer> lDEncadeada = new Centopeia<Integer>();
        //Testando as funcionalidades da lista encadeada
        lDEncadeada.addPata(0);
        lDEncadeada.addPata(1);
        lDEncadeada.addPata(2);
        lDEncadeada.addPata(3);

        lDEncadeada.verValores();

        lDEncadeada.addPata(4, 2);
        lDEncadeada.addPata(5, 0);

        System.out.println("Tamanho atual da lista: "+lDEncadeada.pegarTamanho());

        System.out.println("O valor 3 se encontra no indice: "+lDEncadeada.encontrar(3));

        lDEncadeada.modificar(4, 10);

        lDEncadeada.verValores();

        System.out.println("Pos 3 - "+lDEncadeada.pegar(3));

        lDEncadeada.remove(3);
        lDEncadeada.remove(0);

        lDEncadeada.verValores();
    }
}
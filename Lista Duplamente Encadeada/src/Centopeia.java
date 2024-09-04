public class Centopeia<T> {
    private Pata<T> base;
    private Pata<T> topo;
    private int tamanho=0;

    void addPata(T valor){
        if(isEmpty()){
            base = new Pata<T>(valor);
            topo = base;
            tamanho++;
            return;
        }
        Pata<T> novaPata = new Pata<T>(valor);
        topo.proximo = novaPata;
        topo = novaPata;
        tamanho++;
    }

    void addPata(T valor,int pos){
        Pata<T> pataAtual = pegarPata(pos);
        if(pataAtual==null){
            System.out.println("Impossível adicionar pata nessa posição!");
            return;
        }
        Pata<T> novaPata = new Pata<T>(valor);

        if(pataAtual.anterior!=null){
            pataAtual.anterior.proximo = novaPata;
            novaPata.anterior = pataAtual.anterior;
        }
        novaPata.proximo = pataAtual;
        pataAtual.anterior = novaPata;
        if(pataAtual==base)
            base = novaPata;
        tamanho++;
    }

    T pegar(int pos){
        Pata<T> pata = pegarPata(pos);
        if(pata==null)
            return null;
        return pata.dado;
    }

    void modificar(int pos, T valor){
        Pata<T> pata = pegarPata(pos);
        if(pata==null)
            return;
        pata.dado = valor;
    }

    int encontrar(T valor){
        Pata<T> pataAtual = base;
        for (int i = 0; i < tamanho; i++) {
            if(valor==pataAtual.dado)
                return i;
            pataAtual = pataAtual.proximo;
        }
        System.out.println("Esse valor não foi encontrado!");
        return -1;
    }

    void verValores(){
        Pata<T> pataAtual = base;
        for (int i = 0; i < tamanho; i++) {
            System.out.println(i+" - "+pataAtual.dado);
            pataAtual = pataAtual.proximo;
        }
    }

    int pegarTamanho(){
        return tamanho;
    }

    boolean isEmpty(){
        return tamanho==0;
    }

    private Pata<T> pegarPata(int pos){
        if(pos>tamanho||pos<0){
            System.out.println("Posição não existe na lista!");
            return null;
        }
        Pata<T> pataAtual = base;
        for (int i = 0; i < tamanho; i++) {
            if(pos==i)
                return pataAtual;
            pataAtual = pataAtual.proximo;
        }
        System.out.println("Essa posição não foi encontrada!");
        return null;
    }

    T remove (int pos){
        Pata<T> pata = pegarPata(pos);
        if(pata==null)
            return null;
        if(pata.proximo!=null)
            pata.proximo.anterior = pata.anterior;
        if(pata.anterior!=null)
            pata.anterior.proximo = pata.proximo;
        tamanho--;
        return pata.dado;
    }
}

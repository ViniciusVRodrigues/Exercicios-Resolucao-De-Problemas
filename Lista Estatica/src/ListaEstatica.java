import java.util.Arrays;

public class ListaEstatica {
    private int[] data;
    private int lenght;
    private int size;

    ListaEstatica(int size) {
        this.size = size;
        this.data = new int[size];
        this.lenght = 0;
    }

    public void add(int value) {
        if (this.lenght < this.size) {
            this.data[this.lenght] = value;
            this.lenght++;
        } else {
            System.out.println("Lista cheia");
        }
    }

    public void add(int value,int pos) {
        if (this.lenght < this.size) {
            for (int i = this.lenght; i > pos; i--) {
                this.data[i] = this.data[i - 1];
            }
            this.data[pos] = value;
            this.lenght++;
        } else {
            System.out.println("Lista cheia");
        }
    }

    public int remove(int pos) {
        if (pos >= 0 && pos < this.lenght) {
            int value = this.data[pos];
            for (int i = pos; i < this.size; i++) {
                if(i >= this.lenght-1){
                    this.data[i] = 0;
                }else{
                    this.data[i] = this.data[i + 1];
                }
            }
            this.lenght--;
            return value;
        } else {
            System.out.println("Posição inválida");
            return -1;
        }
    }

    public boolean isEmpty() {
        return this.lenght == 0;
    }

    public boolean isFull() {
        return this.lenght == this.size;
    }

    public void setData(int data, int pos) {
        this.data[pos] = data;
    }

    public int getData(int pos) {
        return this.data[pos];
    }

    public int getLenght() {
        return this.lenght;
    }

    public int find(int value) {
        for (int i = 0; i < this.lenght; i++) {
            if (this.data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        for (int i = 0; i < this.size; i++) {
            this.data[i] = 0;
        }
        this.lenght = 0;
        System.out.println("Lista limpa");
    }

    public String toString() {
        return Arrays.toString(this.data);
    }
}

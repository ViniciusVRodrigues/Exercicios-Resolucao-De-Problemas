public class CircularQueue<T> extends ArrayStack<T>{

    private int base;

    CircularQueue(int size){
        this.size = size;
        this.data = (T[]) new Object[size];
        base = 0;
    }

    public void push(T data){
        if(!isEmpty())
            if(isFull())
                return;
        top = move(top);
        this.data[top] = data;
    }

    public T remove(){
        if(isEmpty())
            return null;
        T data = this.data[base];
        this.data[base] = null;
        base = move(base);
        return data;
    }

    @Override
    public boolean isFull(){
        int newTop = top;
        newTop++;
        if(newTop==size)
            newTop=0;
        return newTop == base;
    }

    @Override
    public boolean isEmpty() {
        boolean empty = true;
        for (int i = 0; i < size; i++) {
            if(data[i]!=null)
                empty = false;
        }
        return empty;
    }

    private int move(int var){
        var++;
        if(var==size)
            var=0;
        return var;
    }

    @Override
    public void clear() {
        super.clear();
        top=-1;
        base=0;
    }
}

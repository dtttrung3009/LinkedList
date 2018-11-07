package Cautrucdulieu;
public class MyList<E> {
    private int size=0;
    static final int DEFAULT_CAPACITY=10;
    Object[] elements = new Object[DEFAULT_CAPACITY];
    public MyList() {
    }
    public MyList(int capacity) {
            this.elements =new Object[capacity];
    }
    public boolean add(E e){
        this.elements[size++] =e;
        return true;
    }
    public void add(int index, E element){
        for (int i =size;i>index;i--){
           elements[i]=elements[i-1];
        }
        size++;
        elements[index] = element;
    }
    public E remove(int index){
        if (index<0&&index>=size){
            System.out.println("vi tri ngoai mang");
        }
        else {
            elements[size-1] = null;
            size--;
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
        }
        return (E)(elements[index]);
    }
    public int getSize(){
        return size;
    }
    public Object clone(){
        MyList<E> myListClone = new MyList<>(size);
        for (int i = 0; i <size ; i++) {
            myListClone.elements[i]=this.elements[i];
        }
        return  myListClone;
    }
    public boolean contains(E e){
            if (e == null) {
                for (int i = 0; i < size; i++)
                    if (elements[i]==null)
                        return true;
            } else {
                for (int i = 0; i < size; i++)
                    if (e.equals(elements[i]))
                        /*
                        equals nó so sánh địa chỉ tham chiêú
                         */
                        return true;
            }
            return false;
    }
    public int indexOf(E e){

            if (e == null) {
                for (int i = 0; i < size; i++)
                    if (elements[i]==null){
                    return i;
                    }
            } else {
                for (int i = 0; i < size; i++)
                    if (e.equals(elements[i])){
                    return i;
                    }
            }
            return -1;
    }
    public void ensureCapacity(int minCapacity){
       if(size>DEFAULT_CAPACITY){
           Object[] elements = new Object[minCapacity];
       }
    }
    public E get(int index){
                return (E)elements[index];
    }
    public void clear(){

     elements[size] = null;
     size=0;
    }

}

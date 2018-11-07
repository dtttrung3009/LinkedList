package Cautrucdulieu;

public class MyLinkedList<E> {
    private Node head = null;
    private Node tail = null;
    private int count = 1;

    public MyLinkedList() {
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
        tail = head;
    }

    public void add(int index, E element) {
        Node temp = head;
        Node temp1;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        temp1 = temp.next;
        temp.next = new Node(element);
        temp.next.next = temp1;
        count++;
    }

    public void addLast(E e) {
        tail.next = new Node(e);
        tail = tail.next;
        count++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        count++;
    }

    public void Show() {
        Node temp = head;
        while (temp != null) {
        System.out.println(temp.data);
        temp = temp.next;
    }
}

    public Object remove(int index) {
        if (index < 0 && index >= count) {
            System.out.println("vi tri ngoai mang:");
            return null;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node temp1 = temp.next;
            temp.next = temp1.next;
            count--;
            return temp1.data;
        }
    }

    public boolean remove(Object e) {
        int i = 0;
        Node temp = head;
        if (e == null) {
            while (i < count) {
                if (temp.data == null) {
                    remove(i);
                    return true;
                }
                i++;
                temp = temp.next;
            }
        } else {
            while (i < count) {
                if (e.equals(temp.data)) {
                    remove(i);
                    return true;
                }
                temp = temp.next;
                i++;
            }
        }
        return false;
    }

    public int getSize() {
        return this.count;
    }

    public Object clone() {
        MyLinkedList<E> clone = new MyLinkedList<>();
        clone.head = null;
        for (Node temp = head; temp != null; temp = temp.next) {
            clone.addFirst((E) temp.data);
        }
        return clone;
    }

    public boolean contains(E e) {
        int i = 0;
        Node temp = head;
        // boolean check = true;
        if (e == null) {
            while (i < count) {
                if (temp.data == null) {
                    return true;
                }
                i++;
                temp = temp.next;
            }
        } else {
            while (i < count) {
                if (e.equals(temp.data)) {
                    return true;
                }
                temp = temp.next;
                i++;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        int i = 0;
        Node temp = head;
        // boolean check = true;
        if (e == null) {
            while (i < count) {
                if (temp.data == null) {
                    return i;
                }
                i++;
                temp = temp.next;
            }
        } else {
            while (i < count) {
                if (e.equals(temp.data)) {
                    return i;
                }
                temp = temp.next;
                i++;
            }
        }
        return -1;
    }
    public boolean add(E e){
        addFirst(e);
        return true;
    }
    public E get(int index){
        Node temp=head;
        for (int i=0;i<index;i++){
            temp=temp.next;
        }
        return (E)temp.data;
    }
    public E getFirst(){
        return (E)this.head.data;
    }
    public E getLast(){
        return (E)this.tail.data;
    }
    public void clear(){
        Node temp = head;
        for (int i=0;i<this.count;i++){
            temp.next=null;
        }
        head=null;
        tail=null;
        this.count=0;
    }
}

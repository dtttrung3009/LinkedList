package Cautrucdulieu;

public class MyLinkedListTest {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"asdv");
        MyLinkedList<Customer> myLinkedList = new MyLinkedList<>(customer);
        Customer customer1 = new Customer(18,"Sangml");
        Customer customer2 =new Customer(1,"nam");
        Customer customer3 = new Customer(20,"trung");
        Customer customer4 = new Customer(5,"trg");
        myLinkedList.addFirst(customer1);
        myLinkedList.addFirst(customer2);
        myLinkedList.addLast(customer3);
        myLinkedList.add(2,customer4);
        myLinkedList.Show();
        System.out.println("*************************************");
        //myLinkedList.remove(2);
        myLinkedList.remove(customer2);
        myLinkedList.Show();
        System.out.println("size="+myLinkedList.getSize());
        MyLinkedList<Customer> myLinkedList1 = new MyLinkedList<>();
        myLinkedList1=(MyLinkedList<Customer>)myLinkedList.clone();
        System.out.println("***************************");
        System.out.println("clone");
        myLinkedList1.Show();
        System.out.println("co custome contans?:"+myLinkedList.contains(customer2));
        System.out.println("co custome indeof?:"+myLinkedList.indexOf(customer3));
        System.out.println("custome ow vi tri index la:"+myLinkedList.get(2));
        System.out.println("custome ow vi tri first la:"+myLinkedList.getFirst());
        System.out.println("custome ow vi tri lást la:"+myLinkedList.getLast());
        myLinkedList.clear();
        System.out.println("mang sau khi xoa la:");
        myLinkedList.Show();
    }
}

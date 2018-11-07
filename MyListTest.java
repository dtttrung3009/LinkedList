package Cautrucdulieu;

import java.util.LinkedList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Customer> list = new MyList<>();
        Customer customer = new Customer(18,"Sangml");
        Customer customer1 =new Customer(1,"nam");
        Customer customer2 = new Customer(4,"trung");
        Customer customer4 = new Customer(5,"trg");
        list.add(customer);
        list.add(customer1);
       list.add(customer2);
       Customer customer3 = customer;
      for (int i=0;i<list.getSize();i++){
          System.out.println(list.elements[i]);
      }
      MyList<Customer> list1= (MyList<Customer>) list.clone();
        for (int i=0;i<list.getSize();i++){
            System.out.println(list1.elements[i]);
        }
        System.out.println("****************************************");
        list.remove(2);
        for (int i=0;i<list.getSize();i++){
            System.out.println(list.elements[i]);
        }
        System.out.println( list.contains(customer3));
        System.out.println(list.indexOf(customer1));
        System.out.println("laay get");
        System.out.println(list.get(2));
        System.out.println("truoc khi clear");
        for (int i=0;i<list.getSize();i++){
            System.out.println(list1.elements[i]);
        }
        list.clear();
        System.out.println("sau khi clear");
        for (int i=0;i<list.getSize();i++){
            System.out.println("[]"+list1.elements[i]);
        }
        
   }

}

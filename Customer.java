package Cautrucdulieu;

public class Customer {
    private int age=0;
    private String name=null;
    private int money=0;
    private int hours=0;
    private int minutes=0;
    private int date=0;
    public Customer(int age, String name, int money, int hours, int minutes,int date) {
        this.age = age;
        this.name = name;
        this.money = money;
        this.hours = hours;
        this.minutes = minutes;
        this.date =date;
    }
    public  Customer(int age,String name){
        this.age = age;
        this.name = name;
    }
    public Customer() {
        this.age = 0;
        this.name =null;
        this.money = 0;
        this.hours = 0;
        this.minutes = 0;
        this.date =0;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMoney() {
        return money;
    }
    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getDate() {
        return date;
    }
    public void showOut() {
        System.out.println( "Customer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}');
    }
    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


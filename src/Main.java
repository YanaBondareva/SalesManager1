public class Main {
    public static void main(String[] args) {

int [] sales = {100,300,500,450};
    SalesManager manager  = new SalesManager(sales);
    System.out.println ("Max" + manager.max());
    }
}
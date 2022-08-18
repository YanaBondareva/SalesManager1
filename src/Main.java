public class Main {
    public static void main(String[] args) {

int [] sales = {100,300,500,450,250,690,850,320,10,235};
    SalesManager manager  = new SalesManager(sales);
    System.out.println ("Max" + manager.max());
    System.out.println("Min" + manager.min());
    System.out.println("Обрезанное среднее" + manager.mid());
    }
}
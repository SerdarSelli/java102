import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        ArrayList<Integer> fullNumberList = new ArrayList<>();
        int firstNumber = 1; int lastNumber = 10000;

        for (int i = firstNumber;i<=lastNumber;i++){
        fullNumberList.add(i);
        }

        Seperator num = new Seperator();

        Thread t1 = new Thread(num);
        Thread t2 = new Thread(num);
        Thread t3 = new Thread(num);
        Thread t4 = new Thread(num);
        t1.start();
        t1.join();
        t2.start();
       t2.join();
        t3.start();
       t3.join();
        t4.start();
        t4.join();
        System.out.println("even "+Seperator.evenNumbers.size());
        System.out.println("odd "+Seperator.evenNumbers.size());

    }
}
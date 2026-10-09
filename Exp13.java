/*Create two threads; one prints number from 1 to 50, another prints even numbers.
Demonstrate sleep(), join(), and synchronization.*/

class NumberPrinter{
    synchronized void printNumber(){
        try{
            for(int i = 1; i <= 50; i++) {
                System.out.println("Number: " + i);
                Thread.sleep(100);
            }
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    synchronized void printEvenNumber(){
        try{
            for(int i = 2; i <= 50; i += 2){
                System.out.println("Even Number: " + i);
                Thread.sleep(100);
            }        
        }catch(Exception e) {
            System.out.println(e);
        }   
    }
}

class Thread1 extends Thread{
    NumberPrinter np;
    Thread1(NumberPrinter np){
        this.np = np;
    }
    public void run(){
        np.printNumber();
    }
}

class Thread2 extends Thread{
    NumberPrinter np;
    Thread2(NumberPrinter np){
        this.np = np;
    }
    public void run(){
        np.printEvenNumber();
    }
}
public class Exp13{
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        Thread1 t1 = new Thread1(np);
        Thread2 t2 = new Thread2(np);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Two threads have completed execution.");
    }
}

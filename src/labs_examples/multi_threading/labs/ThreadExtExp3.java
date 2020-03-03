package labs_examples.multi_threading.labs;

public class ThreadExtExp3 extends Thread {

    ThreadExtExp3(String name){

        super(name);
        start();

    }
    @Override
    public void run(){

        System.out.println("Code from Example 3");

    }
}

package labs_examples.multi_threading.labs;

public class ThreadExtExp1 extends Thread{

    ThreadExtExp1(String name){

        super(name);
        start();

    }
    @Override
    public void run(){

        System.out.println("Code from Example 1");
    }

}

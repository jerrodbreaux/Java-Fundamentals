package labs_examples.multi_threading.labs;

public class Run1 implements Runnable{

    Thread thread;

    Run1(String name){

        thread = new Thread(this, name);
        thread.start();

    }

    @Override
    public void run(){

        System.out.println("Run1");

    }
}

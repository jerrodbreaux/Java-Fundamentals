package labs_examples.multi_threading.labs;

public class ThreadExtExp2 extends Thread {

    ThreadExtExp2(String name){

        super(name);
        start();

    }

        @Override
        public void run(){

            System.out.println("Code from Example 2");
        }
}

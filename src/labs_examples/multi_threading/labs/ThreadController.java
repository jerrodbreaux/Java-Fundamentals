package labs_examples.multi_threading.labs;

public class ThreadController {

    public static void main(String[] args) {

        ThreadExtExp1 obj1 = new ThreadExtExp1("Thread1");
        ThreadExtExp2 obj2 = new ThreadExtExp2("Thread2");
        ThreadExtExp3 obj3 = new ThreadExtExp3("Thread3");

        Run1 run = new Run1("FirstRun");

        Run2 run2 = new Run2();
        Thread thrd = new Thread(run2);
        thrd.start();

        Run3 run3 = new Run3();
        Thread thrd3 = new Thread(run3);
        thrd3.start();

    }

}

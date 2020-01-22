package ch.petikoch.examples.five_min_kotlin_for_java_devs;

public class Main {

    public static void main(String[] args) {
        final Runnable runnable = RunnableFactory.createHelloWorldRunnable();
        runnable.run();
    }

}

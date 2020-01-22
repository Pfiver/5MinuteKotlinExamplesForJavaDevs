package ch.petikoch.examples.five_min_kotlin_for_java_devs;

public class RunnableFactory {

    public static Runnable createHelloWorldRunnable() {
        return () -> System.out.println(Constants.HELLO_WORLD);
    }

}

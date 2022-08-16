package com.learn.jdk.future;

import java.util.concurrent.*;

/**
 * @Author yuezp
 * @Date 2021/5/14 下午5:24
 * @Version v1.0
 */
public class JavaFuture {

    public static void main(String[] args) throws Throwable, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> f = executor.submit(new Callable<String>() {

            @Override
            public String call() throws Exception {
                System.out.println("task started!");
                longTimeMethod();
                System.out.println("task finished!");
                return "hello";
            }
        });

        //此处get()方法阻塞main线程
        boolean done = f.isDone();
        System.out.println(done);
        System.out.println(f.get());
        System.out.println("main thread is blocked");
        boolean done1 = f.isDone();
        System.out.println(done1);
    }

    public static void longTimeMethod(){
        try {
            Thread.sleep(10000);
            System.out.println("执行方法");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

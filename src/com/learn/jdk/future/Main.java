package com.learn.jdk.future;

/**
 * @Author yuezp
 * @Date 2021/5/20 下午3:06
 * @Version v1.0
 */
public class Main {
    public static void main(String[] args) {
        Data data = new Data();

        new Thread(()->{for(int i=1;i<=10;i++) {data.increment();}}).start();
        new Thread(()->{for(int i=1;i<=10;i++) {data.increment();}}).start();
        new Thread(()->{for(int i=1;i<=10;i++) {data.decrement();}}).start();
        new Thread(()->{for(int i=1;i<=10;i++) {data.decrement();}}).start();
    }

}

class Data{

    private int number = 0;

    public synchronized void increment(){
        while(number != 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number++;
        System.out.println(Thread.currentThread().getName()+"->"+number);

        this.notifyAll();
    }

    public synchronized void decrement(){
        while (number == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number--;
        System.out.println(Thread.currentThread().getName()+"->"+number);

        this.notifyAll();
    }

}

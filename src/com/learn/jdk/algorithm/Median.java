package com.learn.jdk.algorithm;

import javafx.scene.layout.Priority;

import java.util.PriorityQueue;

/**
 * @Author yuezp
 * @Date 2021/9/28 下午4:55
 * @Version v1.0
 */
public class Median {

    public double median(int[] arr){
        int heapSize = arr.length/2 + 1;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < heapSize; i++) {
            priorityQueue.add(arr[i]);
        }
        for (int i = heapSize; i < arr.length; i++) {
            if (priorityQueue.peek() < arr[i]){
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }
        }
        if (arr.length % 2 == 1){
            return priorityQueue.peek();
        }else {
            return (priorityQueue.poll() + priorityQueue.peek()) / 2.0;

        }
    }

}

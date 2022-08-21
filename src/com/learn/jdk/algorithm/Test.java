package com.learn.jdk.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author yuezp
 * @Date 2021/10/1 下午10:11
 * @Version v1.0
 */
public class Test {
    public static void main(String[] args) {

        //break在标签中的作用
        label:
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {
                if (2 == j) {
                    break label;
                }
                System.out.print(i + "----->" + j+"    ");
            }
            System.out.println();
        }
        System.out.println(42 == 42.0);
        Integer a = 123;
        Integer b = new Integer(123);
        Integer c = Integer.valueOf(123);
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));


        String [] s= new String[]{
                "dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"
        };
        List<String> list = Arrays.asList(s);
        Collections.reverse(list);
//没有指定类型的话会报错
        s=list.toArray(new String[0]);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
//        false
//        true
//        true
//        true


        //输出0----->0    0----->1

        //continue在标签中的应用
//        label:
//        for (int i = 0; i < 6; i++) {
//
//            for (int j = 0; j < 6; j++) {
//                if (2 == j) {
//                    continue label;
//                }
//                System.out.print(i + "----->" + j+"    ");
//            }
//            System.out.println("外循环");
//        }

        //输出0----->0    0----->1    1----->0    1----->1    2----->0    2----->1    3----->0    3----->1    4----->0    4----->1    5----->0    5----->1

//
//        for (int i = 0; i < 6; i++) {
//            label:
//            for (int j = 0; j < 6; j++) {
//                if (2 == j) {
//                    continue label;
//                }
//                System.out.print(i + "----->" + j+"    ");
//            }
//            System.out.println("外循环");
//        }
        //输出 0----->0    0----->1    0----->3    0----->4    0----->5    外循环
        //1----->0    1----->1    1----->3    1----->4    1----->5    外循环
        //2----->0    2----->1    2----->3    2----->4    2----->5    外循环
        //3----->0    3----->1    3----->3    3----->4    3----->5    外循环
        //4----->0    4----->1    4----->3    4----->4    4----->5    外循环
        //5----->0    5----->1    5----->3    5----->4    5----->5    外循环


//        for (int i = 0; i < 6; i++) {
//
//            for (int j = 0; j < 6; j++) {
//                if (2 == j) {
//                    continue;
//                }
//                System.out.print(i + "----->" + j+"    ");
//            }
//            System.out.println("外循环");
//        }

        //输出
        //0----->0    0----->1    0----->3    0----->4    0----->5    外循环
        //1----->0    1----->1    1----->3    1----->4    1----->5    外循环
        //2----->0    2----->1    2----->3    2----->4    2----->5    外循环
        //3----->0    3----->1    3----->3    3----->4    3----->5    外循环
        //4----->0    4----->1    4----->3    4----->4    4----->5    外循环
        //5----->0    5----->1    5----->3    5----->4    5----->5    外循环


        //在循环语句前设置一个标记，然后使用带有该标记的break语句跳出该循环

//        public static void main(String args[]) {
//                     ALL: for (int i = 0; i < 100; i++) {
//                             for (int j = 1; j < i; j++) {
//                                     if (i == 10) {
//                                             break ALL;
//                                         }
//                                 }
//                         }
//                 }
        //当i=10的时候，跳出全部循环

        //2.设置一个boolean值的标识位，在for循环中通过判断是否继续循环达到目的

//        public static void main(String args[]) {
//            int arr[][] = { { 1, 2, 2 }, { 2, 2, 5 }, { 4, 4 } };
//            boolean found = false;
//                     for (int i = 0; i < arr.length && !found; i++) {
//                             for (int j = 0; j < arr[i].length; j++) {
//                                     System.out.println("i=" + i + ",j=" + j);
//                                     if (arr[i][j] == 5) {
//                                             found = true;
//                                             break;
//                                         }
//                                 }
//                         }
//                 }
        System.out.println("11111111");
        System.out.println("22222222222");
    }
}

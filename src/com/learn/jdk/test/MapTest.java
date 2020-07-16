package com.learn.jdk.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yuezp
 * @Date 2020/7/16 4:58 下午
 * @Version v1.0
 */
public class MapTest {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("qqq", "qqq");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}

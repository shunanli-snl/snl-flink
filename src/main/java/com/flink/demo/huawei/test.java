package com.flink.demo.huawei;

import org.apache.kafka.common.protocol.types.Field;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @description:
 * @author: lisn
 * @date: 2021/10/2 9:26
 * @version: V1.0
 */
public class test {
    public static void main(String[] args) {
        // a1-a2,a5-a6,a2-a3
        // a5,a2
        Scanner in = new Scanner(System.in);
        String[] a = in.nextLine().split(",");
        Map<String,String> map1 = new HashMap<String,String>();
        for (int i = 0; i < a.length; i++) {
            String[] s = a[i].split("-");
            map1.put(s[0],s[1]);
        }
        while(in.hasNextLine()){
            String[] b = in.nextLine().split(",");
            StringBuffer sh = new StringBuffer();
            for (String s : b) {
                sh.append(map1.get(s)).append(",");
            }
            System.out.println(sh.deleteCharAt(sh.length()-1).toString());
        }


/*        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String[] str = in.nextLine().split("@");
            String[] a = str[0].split(",");
            String[] b = str[1].split(",");
            Map<String,Integer> mapA = new HashMap<String,Integer>();
            for (int i = 0; i < a.length; i++) {
                String[] s = a[i].split(":");
                mapA.put(String.valueOf(s[0]), Integer.valueOf(s[1]));
            }
            Map<String,Integer> mapB = new HashMap<String,Integer>();
            for (int i = 0; i < b.length; i++) {
                String[] s = b[i].split(":");
                mapB.put(String.valueOf(s[0]), Integer.valueOf(s[1]));
            }
            mapB.forEach((x,y)->{
                int tmp = (int) mapA.get(x);
                mapA.put(x,tmp-y);
            });
            StringBuffer sh = new StringBuffer();
            mapA.forEach((s,y)->{
                sh.append(s).append("=").append(y).append(",");
            });
            System.out.println(sh.deleteCharAt(sh.length()-1).toString());
        }*/

//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()){
//            int a = in.nextInt();
//            System.out.println(a+"="+a);
//            int tmp = 1;
//            for (int i = 1; i < a; i--) {
//
//            }
//        }
    }

}

package com.flink.demo.huawei;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * @description:
 * @author: lisn
 * @date: 2021/9/26 17:10
 * @version: V1.0
 * import java.util.*;
 *
 * // 注意类名必须为 Main, 不要有任何 package xxx 信息
 * public class Main {
 *     public static void main(String[] args) {
 *         Scanner in = new Scanner(System.in);
 *         String a = in.next();
 *         int c = a.length();
 *         String b = null;
 *         while (in.hasNext()) {
 *             b = in.next();
 *             // System.out.println(a.length());
 *         }
 *         a.replaceAll(b, "");
 *         // a.replaceAll(b.toUpperCase(), "");
 *         System.out.println(a.length());
 *
 *     }
 * }
 */
public class StringHJ {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);


//        // 进制转换
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNext()) { // 注意 while 处理多个 case
//            String a = in.next();
//            int b = Integer.decode(a);
//            System.out.println(b);
//        }

/*        // HJ7 取近似值
        double d = 3.4;
        System.out.println(Math.round(d));*/

/*        // HJ31 单词倒排
        Scanner sc = new Scanner(System.in);
        String lines = sc.nextLine();
        String[] strings =  lines.split(" ");
        StringBuffer sh = new StringBuffer();
        for (int i = (strings.length-1); i >= 0 ; i--){
            sh.append(strings[i]).append(" ");
        }
        System.out.println(sh.toString());*/


/*
        // HJ11 数字颠倒
        int a = 10109;
        System.out.println(new StringBuffer().append(a).reverse().toString());
*/

/*        // HJ4 字符串分隔
        Scanner sc = new Scanner(System.in);
        String next = sc.next()+"00000000";
        System.out.println(next.substring(0,8));*/

/*        // HJ3 明明的随机数
        int tmp = 0;
        TreeSet<Integer> sets = new TreeSet<Integer>();
        // Set<Integer> sets = new HashSet<Integer>();
        while (tmp < 5){
            System.out.println("===== 请输入参数：");
            Scanner sc = new Scanner(System.in);
            String next = sc.next();
            for (int i = 0; i < Integer.valueOf(next); i++ ){
                sets.add((int) (Math.floor(Math.random()*100)));
            }
            TreeSet t = (TreeSet) sets.descendingSet();
            t.forEach(x->{
                System.out.println(x+"\n");
            });
            tmp++;
        }*/


/*        // HJ2 计算字符串字符重复的个数
        String tmp = "hello huawei";
        int length = tmp.length();
        int h = tmp.replaceAll(" ", "").length();
        System.out.println(length - h);*/

        // HJ1 计算最后一个字符测长度，支持中英文。
        String tmp = "hello huawei";
        // String tmp = "你好 华为鸿蒙系统";
        // System.out.println(tmp.split(" ")[tmp.split(" ").length-1]);
//        if (StringUtils.isNotBlank(tmp)) {
//            List<String> asList = Arrays.asList(tmp.split(" "));
//            for (int i = (asList.size()-1); i > 0; i--) {
//                System.out.println(asList.get(i).length());
//                break;
//            }
//        }
    }
}

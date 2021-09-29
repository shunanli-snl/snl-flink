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

/*        // HJ31 单词倒排
        Scanner sc = new Scanner(System.in);
        String lines = sc.nextLine();
        String[] strings =  lines.split(" ");
        StringBuffer sh = new StringBuffer();
        for (int i = (strings.length-1); i >= 0 ; i--){
            sh.append(strings[i]).append(" ");
        }
        System.out.println(sh.toString());*/

        // HJ18

/*        // HJ17 坐标移动
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> map = new HashMap<>();
        while (sc.hasNext()){
            String s = sc.nextLine();
            int x = 0,y = 0;
            String[] sArray = s.split(";");
            String res = "[ADWS]\\d{1}\\d?";
            for (int i = 0; i < sArray.length; i++) {
                if (sArray[i].matches(res)){
                    map.put(sArray[i].charAt(0),map.getOrDefault(sArray[i].charAt(0),0) + Integer.valueOf(sArray[i].substring(1)));
                }
            }
            x = x - map.get('A') + map.get('D');
            y = y - map.get('S') + map.get('W');
            System.out.println(x + "," + y);
            map.clear();
        }
        sc.close();*/

        // HJ15 求int型正整数在内存中存储时1的个数
/*        import java.util.*;

        public class Main{
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();
                System.out.println(countOne(i));
            }
            public static int countOne(int a){
                return a == 0 ? 0 : a % 2 + countOne(a / 2);
            }
        }*/


/*        // HJ13 句子逆序
        import java.util.Scanner;
        public class Main {
            public static void main ( String[] args ) {
                Scanner in = new Scanner( System.in );
                String s = in.nextLine();
                String newString = reverse( s );
                System.out.println( newString );
                in.close();
            }
            public static String reverse(String sentence) {
                String s[] = sentence.split(" ");
                String newString = "";
                for( int i = s.length-1 ; i >= 0 ; i-- ) {
                    if( i > 0 ) {
                        newString += s[i] + " ";
                    }
                    else {
                        newString += s[i];
                    }
                }
                return newString;
            }
        }*/

/*        // HJ12 字符串反转
        import java.util.Scanner;
        public class Main{
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
                    String s = sc.next();
                    StringBuffer sb = new StringBuffer(s);
                    System.out.println(sb.reverse());
                }
            }
        }*/

/*        // HJ11 数字颠倒
        import java.util.*;
        public class Main {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                while (in.hasNextLine()) {
                    String a = in.nextLine();
                    System.out.println(new StringBuffer().append(a).reverse().toString());
                }
            }
        }*/

/*        // HJ10 字符个数统计
        import java.util.*;
        public class Main {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                while (in.hasNextLine()) {
                    String a = in.nextLine();
                    System.out.println(a.length());
                }
            }
        }*/

/*        // HJ9 提取不重复整数
        import java.util.Scanner;
        public class Main {
            public static void main (String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                String s = String.valueOf(n);
                String s1 = "";
                for(int i = s.length()-1;i>=0;i--) {
                    if(!s1.contains(String.valueOf(s.charAt(i)))) {
                        s1 = s1 + String.valueOf(s.charAt(i));
                    }
                }
                System.out.println(s1);
                in.close();
            }
        }*/

/*        // HJ8 合并表记录
        import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                while (sc.hasNext()) {
                    int num = sc.nextInt();
                    int[] a = new int[10000];
                    // 定义一个大数组
                    for (int j = 0; j < num; j++) {
                        // num个循环，每个循环输入一组
                        int i = sc.nextInt();
                        int b = sc.nextInt();
                        a[i] += b; // 以i为key，b为value，不断累加 }

                    }
                    for (int i = 0; i < num; i++) {
                        if (a[i] != 0) {
                            System.out.println(i + " " + a[i]);// 输出所有非零值；
                        }
                    }
                }
            }
        }*/

/*        // HJ7 取近似值
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        System.out.println(Math.round(a));*/

/*        // HJ6 质数因子
        import java.util.*;
        public class Main {
            public static void main(String[] args) {
                Scanner str = new Scanner(System.in); //获取输入，创建对象
                long num = str.nextLong();   //
                String result = getResult(num);
                System.out.println(result);
            }
            public static String getResult(long num){
                int pum = 2;
                String result = "";     // 这里用String来作为结果存放
                while(num != 1){
                    while(num%pum == 0){
                        num = num/pum;
                        result = result + pum + " ";
                    }
                    pum++;
                }
                return result;
            }
        }*/

/*        // HJ5 进制转换
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String a = in.nextLine();
            System.out.println(Integer.decode(a));
        }*/

/*        // HJ4 字符串分隔
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String a = in.nextLine();
            if (a.length()<9){
                System.out.println((a+"00000000").substring(0,8));
            } else if (a.length()<19){
                System.out.println(a.substring(0,8));
                String tmp = a.substring(8,a.length()) + "00000000";
                System.out.println(tmp.substring(0,8));
            }
        }*/


/*        // HJ3 明明的随机数 python2
        while True:
            try:
                n=int(raw_input())
                res=[]
                for i in range(n):
                    res.append(int(raw_input()))
                for i in sorted(set(res)):
                    print i
            except:
                break*/

/*
        // HJ2 计算字符串字符重复的个数
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = null;
        if (in.hasNextLine()) {
            b = in.nextLine();
        }
        int c = a.length();
        String tmp1= a.replaceAll(b.toLowerCase(),"");
        String tmp2 = tmp1.replaceAll(b.toUpperCase(),"");
        System.out.println(c-tmp2.length());
        */

/*
        // HJ1 计算最后一个字符测长度，支持中英文。
        Scanner in = new Scanner(System.in);
        if (in.hasNextLine()) {
            String a = in.nextLine();
            String[] b = a.split(" ");
            System.out.println(b[b.length-1].length());
        }
        */
    }
}

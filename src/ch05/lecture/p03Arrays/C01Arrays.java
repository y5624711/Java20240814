package ch05.lecture.p03Arrays;

import java.util.Arrays;

public class C01Arrays {
    public static void main(String[] args) {
        int[] a = {5,6,7};
        System.out.println(Arrays.toString(a));
        int[][] b= {{0,0},{0,0}};
        System.out.println(Arrays.deepToString(b));
        int[][][] c = {{},{},{}};
        System.out.println(Arrays.deepToString(c));


        int[] d ={100,200};
        int[] e =Arrays.copyOf(d, d.length);
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
        e[0] = 300;
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));


        int[][] f = {{5,1}, {4,0}};
        int[][] g =Arrays.copyOf(f,f.length);
        System.out.println(Arrays.deepToString(f));
        System.out.println(Arrays.deepToString(g));
        g[0][0]=55;
        System.out.println(Arrays.deepToString(f));
        System.out.println(Arrays.deepToString(g));

        //equals
        int[] h = {3,4,5};
        int[] i = {3,4,5};
//        System.out.println(h == i);
        System.out.println(Arrays.equals(h, i));

        int[][] j = {{3, 4}, {5, 6, 7}};
        int[][] k = {{3, 4}, {5, 6, 7}};
//        System.out.println(Arrays.equals(j,k));
        System.out.println(Arrays.deepEquals(j,k));


        //fill = 특정값으로 배율을 채우고 싶을때
        int[] l =new int[3];
        System.out.println(Arrays.toString(l));
        Arrays.fill(l,99);
        System.out.println(Arrays.toString(l));

        //sort = 정렬
        int[] m ={9, 4, 1, 10, 20};
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));
    }

}

package chap_09;

import java.lang.reflect.Array;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스 에서 지원하는건 객체
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0,2.0,3.0,4.0,5.0};
        String[] sArray = {"A","B","C","D","E"};

        printIntArray(iArray);
        printdArray(dArray);
        printsArray(sArray);

        System.out.println("====================");
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // T :Type K: key V : value E: element <>
    private static <T> void printAnyArray(T[] array) {
        for (T t: array ) {
            System.out.print(t+" ");
        }
        System.out.println();
    }

    private static void printsArray(String[] sArray) {
        for (String i: sArray ) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void printdArray(Double[] dArray) {
        for (double i: dArray) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i: iArray ) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

}



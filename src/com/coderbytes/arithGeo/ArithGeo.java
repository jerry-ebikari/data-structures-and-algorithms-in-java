package com.coderbytes.arithGeo;

public class ArithGeo {
    public static String arithGeo(double[] arr) {
        boolean notArithmetic = false;
        boolean notGeometric = false;
        double commonDifference = arr[1] - arr[0];
        double commonDivisor = arr[1] / arr[0];
        int arrLength = arr.length;
        for (int i = 1; i < arrLength - 1; i++) {
            // check arithmetic
            if (notArithmetic == false) {
                if ((commonDifference != arr[i + 1] - arr[i])) {
                    if (notGeometric) return "-1";
                    notArithmetic = true;
                }
            }

            // check geometric
            if (notGeometric == false) {
                if (commonDivisor != arr[i + 1] / arr[i]) {
                    if (notArithmetic) return "-1";
                    notGeometric = true;
                }
            }
        }
        return notArithmetic ? "Geometric" : "Arithmetic";
    }

    public static void main(String[] args) {
        double[] arr1 = {5, 10, 15};
        double[] arr2 = {2, 6, 18, 54};
        double[] arr3 = {2, 4, 16, 24};
        System.out.println(arithGeo(arr1));
        System.out.println(arithGeo(arr2));
        System.out.println(arithGeo(arr3));
    }
}

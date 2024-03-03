import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("===Array 1===");
        System.out.print("Masukkan panjang elemen array 1: ");
        int as1 = arrSize1();
        System.out.print("Masukkan elemen array 1: ");
        int[] arr1 = array1(as1);
        System.out.print("Array 1 = [");
        cetakArray(as1, arr1);
        System.out.println();
        int total = 0;
        sumArray(as1, arr1, total);
        System.out.print("Reverse Array 2: [");
        reverseArray(as1, arr1);

        System.out.println("===Array 2===");
        System.out.print("Masukkan panjang elemen array 2: ");
        int as2 = arrSize2();
        System.out.print("Masukkan elemen array 2: ");
        int[] arr2 = array2(as2);
        System.out.print("Array 2 = [");
        cetakArray(as2, arr2);
        System.out.println();
        sumArray(as2, arr2, total);
        System.out.print("Reverse Array 2: [");
        reverseArray(as2, arr2);

        System.out.println("===Penjumlahan Array 2D===");
        System.out.print("[[");
        cetakArray(as1, arr1);
        System.out.print(", [");
        cetakArray(as2, arr2);
        System.out.print("]");
        System.out.println();

        System.out.println("Hasil Penjumlahan dari Array 2D adalah: ");
        int[] arr3 = sumOfTwoArrays(arr1, arr2);
        System.out.print("[");
        cetakArray(as1, arr3);

    }

    public static int arrSize1() {
        Scanner scan = new Scanner(System.in);

        int arrSize;
        arrSize = scan.nextInt();

        return arrSize;
    }
    public static int arrSize2() {
        Scanner scan = new Scanner(System.in);

        int arrSize;
        arrSize = scan.nextInt();

        return arrSize;
    }

    public static int[] array1(int arrSize) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            if (scan.hasNextInt()) {
                arr[i] = scan.nextInt();
            }
        }

        return arr;
    }

    public static int[] array2(int arrSize) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            if (scan.hasNextInt()) {
                arr[i] = scan.nextInt();
            }
        }

        return arr;
    }

    public static void cetakArray(int arrSize, int[] arr) {
        for (int i = 0; i < arrSize; i++) {
            if (i == arrSize - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
    }

    public static void sumArray(int arrSize, int[] arr, int total) {

        for (int i = 0; i < arrSize; i++) {
            total += arr[i];
        }
        System.out.println("Jumlah dari setiap elemennya adalah: " + total);
    }

    public static void reverseArray(int arrSize, int[] arr) {
        for (int i = arrSize - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
        System.out.println();
    }

    public static int[] sumOfTwoArrays(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i] + arr2[i];
        }
        return arr;
    }
}

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Array {
    public static void main(String[] args) {
        System.out.println("===Array 1D===");
        System.out.print("Masukkan panjang elemen array: ");
        int as = arrSize();
        System.out.print("Masukkan elemen array: ");
        int[] arr = array(as);
        System.out.print("Array = [");
        printArray(as, arr);
        System.out.println();
        int total = 0;
        sumArray(as, arr, total);
        System.out.print("Reverse Array: [");
        reverseArray(as, arr);

        System.out.println("===Array 2D===");
        System.out.print("Masukkan jumlah baris: ");
        int rows = arr2dSizeRows();
        System.out.print("Masukkan jumlah kolom: ");
        int columns = arr2dSizeColumn();
        int[][] arr2d = array2d(rows, columns);
        print2dArray(arr2d, rows, columns);
        int[]totalArr2d = sumArray2d(arr2d);

        System.out.print("Penjumlahan kolom Array : [");
        printArray(arr2d.length, totalArr2d);



    }

    public static int arrSize() {
        Scanner scan = new Scanner(System.in);

        int arrSize;
        arrSize = scan.nextInt();

        return arrSize;
    }

    public static int[] array(int arrSize) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            if (scan.hasNextInt()) {
                arr[i] = scan.nextInt();
            }
        }

        return arr;
    }

    public static void printArray(int arrSize, int[] arr) {
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

    public static int arr2dSizeRows(){
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        return rows;
    }

    public static int arr2dSizeColumn(){
        Scanner scan = new Scanner(System.in);

        int columns = scan.nextInt();
        return columns;
    }

    public static int[][] array2d (int rows, int columns){
        Scanner scan = new Scanner(System.in);
        int[][] multidimensionalArray= new int[rows][columns];

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < columns; y++) {
                if (scan.hasNextInt()) {
                    multidimensionalArray[x][y] = scan.nextInt();
                }
            }
        }
        return multidimensionalArray;
    }

    public static void print2dArray(int[][] arr2d, int rows, int columns){
        for (int x = 0; x < rows; x++) {
            System.out.print("[");
            for (int y = 0; y < columns; y++) {
                if (y == columns - 1) {
                    System.out.print(arr2d[x][y]);
                } else {
                    System.out.print(arr2d[x][y] + ",");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static int[] sumArray2d(int[][] arr2d){
        int[]totalArr = new int[arr2d.length];

        for(int i = 0; i<arr2d.length; i++) {
            int total = 0;
            for (int a : arr2d[i]) {
                total += a;
            }
            totalArr[i] = total;
        }
        return totalArr;
    }
}


import java.io.*;
import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Create file \".txt\"");
        System.out.println("2. Read file \".txt\"");
        int i = scan.nextInt();
        System.out.println();
        switch (i){
            case 1:
                System.out.println("Membuat \"filebaru2.txt\"");
                makeFile();
                break;
            case 2:
                System.out.println("Membaca \"file.txt\"");
                readFile();
                break;
            default:
                System.out.println();
        }
    }

    public static void makeFile(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Isi text: ");
        String i = scan.nextLine();
        try{
            BufferedWriter text = new BufferedWriter(new FileWriter("C:\\prodemy\\inputOutput\\filebaru.txt"));
            text.write(i);
            text.close();
            System.out.println("Berhasil membuat \"filebaru.txt\"");
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void readFile(){
        BufferedReader read = null;
        try{
            read = new BufferedReader(new FileReader("C:\\prodemy\\inputOutput\\file.txt"));
            String currentLine;
            while ((currentLine = read.readLine()) !=null){
                System.out.println(currentLine);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

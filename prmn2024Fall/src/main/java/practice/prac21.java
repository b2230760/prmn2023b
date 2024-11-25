package practice;
import java.util.Scanner;

public class prac21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("名前を入力：");
        String name = scan.nextLine();
        System.out.println("学籍番号を入力：");
        int num = scan.nextInt();

        System.out.println("氏名："+name+",学籍番号："+num);
    }
}

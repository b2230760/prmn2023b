package practice;
import java.util.Scanner;

public class prac11 {
    public static void main(String[] args) {
        String number ="B2001000";

        Scanner scan = new Scanner(System.in);
        System.out.println("学籍番号を入力してください：");
        String gakuseki = scan.next();

        Gakuseki gak =new Gakuseki();
        gak.hanbetsu(number,gakuseki);
    }

}

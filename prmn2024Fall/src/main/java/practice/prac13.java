package practice;
import java.util.Scanner;

public class prac13 {
    public static void main(String[] args) {
        String[][] array;
        array =new String[5][2];
        array[0][0] = "b20";
        array[0][1] = "123";
        array[1][0] = "b21";
        array[1][1] = "234";
        array[2][0] = "b22";
        array[2][1] = "345";
        array[3][0] = "b23";
        array[3][1] = "456";
        array[4][0] = "b24";
        array[4][1] = "567";

        Scanner scan = new Scanner(System.in);
        System.out.println("学籍番号を入力：");
        String gakuseki=scan.nextLine();
        Login login = new Login();
        int i=login.enter(gakuseki,array);

        System.out.println("パスワードを入力：");
        String pass=scan.nextLine();
        login.password(pass,array,i);

    }
}

package practice;
import java.util.Scanner;

public class prac12 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int x=0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("数字"+(i+1)+"つ目:");
            num[i] = scan.nextInt();
        }
        Keisan keisan = new Keisan();
        int sum=keisan.total(num);
        System.out.println("合計値："+sum);
        System.out.println(keisan.hanbetsu(sum));
    }
}

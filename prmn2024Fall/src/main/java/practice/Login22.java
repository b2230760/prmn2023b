package practice;

public class Login22 {
    String name;
    int num;

    Login22(String name, int num) {
        this.name = name;
        this.num = num;
    }

    void message(String name_n,int num_n){
        if(name.equals(name_n)){
            if(num == num_n){
                System.out.println("ログイン成功 ");
            }
            else{
                System.out.println("ログイン失敗");
            }
        }
        else{
            System.out.println("ログイン失敗");
        }
    }
}
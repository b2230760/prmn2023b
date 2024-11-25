package practice;


public class Login {
    int enter(String gakuseki,String[][] array){
        for(int i=0;i<5;i++) {
            if (gakuseki.equals(array[i][0])) {
                return i;

            }
        }
        System.out.println("error!!");
        System.exit(0);
        return 0;
    }

    void password(String pass,String[][] array,int i){
        if(pass.equals(array[i][1])){
            System.out.println("ログイン完了");
        }
        else{
            System.out.println("不正なアクセス");
        }
    }

}

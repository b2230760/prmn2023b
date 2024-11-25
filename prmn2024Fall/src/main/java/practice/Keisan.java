package practice;

public class Keisan {
     int total(int[] num) {
         int sum = 0;
         for (int i = 0; i < num.length; i++) {
             sum += num[i];
         }
         return sum;
     }
     String hanbetsu(int sum){
         if(sum<=49){
             return "small";
         }
         else if(50<=sum&&sum<=99){
             return "big";
         }
         else if(100<=sum){
             return "great!!";
         }
         else{
             return "error";
         }
     }

}

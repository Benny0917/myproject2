import java.util.Random;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        //輸入數字
        Scanner s = new Scanner(System.in);
        //設定最大值與最小值
        int minNum = 0;
        int maxNum = 100;
        //設定一個0~100的隨機數字
        Random r= new Random();
        int answerNum = r.nextInt(100) + 1;
        System.out.println(answerNum);
        //使用while迴圈重複猜一個數字介於0~100，直到猜對
        while(true){
            System.out.println("請猜一個數字(介於"+minNum+"到"+maxNum+")");
            int guessNum = s.nextInt();
            if (guessNum<minNum||guessNum>maxNum){
                continue;
            }
            if(guessNum == answerNum){
                System.out.println("你猜到了！答案是"+answerNum);
                break;
            }else  if (guessNum < answerNum){
                minNum = guessNum;
            }else if (guessNum > answerNum){
                maxNum = guessNum;
            }
        }
    }
}

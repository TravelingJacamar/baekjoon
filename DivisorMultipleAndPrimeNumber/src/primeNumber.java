import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1= input.nextInt();
        int num2 = input.nextInt();
        //m과 n 은 10000 이하의 자연수 이기 때문
        int min =10000;
        int sum =0;


            for (int i = num1; i <= num2; i++) {
                boolean tf = true;
                if(i !=1){
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        tf = false;
                        break;
                    }

                }
                if (tf) {
                    sum += i;
                    if (i < min) {
                        min = i;
                    }
                }
                }
            }


        if(sum != 0){
            System.out.println(sum+"\n"+min);
        }else{
            System.out.print("-1");
        }
    }
}

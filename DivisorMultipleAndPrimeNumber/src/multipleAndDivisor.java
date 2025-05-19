import java.util.Scanner;

public class multipleAndDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            //종료조건
            if(num1==0&&num2==0){
                break;
            }

            if(num2>num1&&num2%num1==0){
                System.out.println("factor");
            }else if(num1>num2&&num1%num2==0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }
        }
    }
}

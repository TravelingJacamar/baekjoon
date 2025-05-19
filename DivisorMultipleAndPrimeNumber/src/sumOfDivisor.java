import java.util.Scanner;

public class sumOfDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //완전수 인지 먼저 찾자. tf가 true 이면 완전수
        while(true) {
            boolean tf = false;
            int num = input.nextInt();
            int sum = 0;
            //종료 조건
            if (num == -1) {
                break;
            }
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                tf = true;
            }
            //출력
            if (tf) {
                System.out.print(num + " " + "= ");
                for (int i = 1; i < num; i++) {
                    if (i < num / 2 && num % i == 0) {
                        System.out.print(i + " + ");
                    } else if (i == num / 2) {
                        System.out.print(i);
                    }
                }
                System.out.println();
            } else {
                System.out.println(num + " is NOT perfect.");
            }
        }


    }
}

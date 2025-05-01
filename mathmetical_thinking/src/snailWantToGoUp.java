import java.util.Scanner;

public class snailWantToGoUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //낮에 올라가는 미터 A 밤에 미끄러지는 미터 B 나무막대 총높이 V
        int A = input.nextInt();
        int B = input.nextInt();
        int V = input.nextInt();

        // 올림 하는 법은 생각해내지 못해서 찾아보았다. 기억해두자.
        //그전 나의 답 (V-A)/(A-B)+1
        // 수식으로 해결하는 가장 간단한 답 int days = (V-A+(A-B)-1)/(A-B)+1;
        // 밑에 답은 내가 생각한 올림 방법
        int days=(V-A)/(A-B)+1;
        if((V-A)%(A-B)!=0){
            days++;
        }


        System.out.println(days);

    }
}

import java.util.Scanner;

public class snailWantToGoUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //낮에 올라가는 미터 A 밤에 미끄러지는 미터 B 나무막대 총높이 V
        int A = input.nextInt();
        int B = input.nextInt();
        int V = input.nextInt();


        int days = (V-A+(A-B)-1)/(A-B)+1;

        System.out.println(days);

    }
}

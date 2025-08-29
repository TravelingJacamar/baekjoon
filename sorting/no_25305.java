import java.util.Scanner;

public class no_25305 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int person = input.nextInt();
        int prize = input.nextInt();

        int[] score = new int[person];

        for (int i = 0; i < person; i++) {
            score[i] = input.nextInt();
        }

        for (int i = 0; i < person; i++) {
            for (int j = 0; j < person; j++) {
                if (score[i] > score[j]) {
                    int tmp = score[i];
                    score[i] = score[j];
                    score[j] = tmp;
                }
            }
        }

        System.out.println(score[prize-1]);
    }
}

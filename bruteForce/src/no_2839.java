import java.util.Scanner;
public class no_2839 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int bag5 = N / 5;
        N -= bag5 * 5;
        int bag3 = N / 3;
        N -= bag3 * 3;

        if (N == 0){
            System.out.println(bag5+bag3);
        }else{
            System.out.println("-1");
        }


    }
}

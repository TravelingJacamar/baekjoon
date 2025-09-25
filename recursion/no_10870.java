import java.util.Scanner;

public class no_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fibonnachi(n);
        System.out.println(result);
    }
    public static int fibonnachi(int n){
        if(n==0||n==1){
            return n;
        }
        return fibonnachi(n-1)+fibonnachi(n-2);

    }
}

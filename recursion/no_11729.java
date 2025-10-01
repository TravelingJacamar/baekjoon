import java.util.Scanner;

public class no_11729 {
    static int cnt =0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        moveTower(N,1,3,2);
        System.out.println(cnt);
        System.out.println(sb);
    }
    public static void moveTower(int N,int from,int to,int aux){

        if(N == 1){
            sb.append(from).append(" ").append(to).append("\n");
            cnt++;
            return;
        }else{
            moveTower(N-1,from,aux,to);
            //제일큰 원판 이동
            cnt++;
            sb.append(from).append(" ").append(to).append("\n");
            moveTower(N-1,aux,to,from);
        }

    }
}

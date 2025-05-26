import java.util.Scanner;

public class repaintChessBoard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //N * M 판 이 있다. 흰 검이니 boolean으로 이차원배열 만들자. 흰 true 검 false

        int N = input.nextInt();
        int M = input.nextInt();
        boolean[][] board = new boolean[N][M];
        //판 입력받기
        for(int i = 0;i<N;i++){
            //맨처음에 \n을 받아서 에러가 남
            //처음 한번만 \n 받을 변수 하나 생성
            if(i ==0) {
                String trash = input.nextLine();
            }
            String tmp = input.nextLine();
            char[] tmpCh = tmp.toCharArray();
            for(int j =0;j<M;j++){
                if (tmpCh[j] == 'W') {
                    board[i][j]=true;
                }

            }
        }

        //이제 8*8이 나오는 모든 경우에 대해 색칠하는 cnt 를 세고 가장 작은 cnt를 구하면 된다.
        // 최대 cnt는 다 다른 64이다.
        int minCnt = 64;





    }
}

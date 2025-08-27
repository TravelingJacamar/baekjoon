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
        // 입력 확인
        /*for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(board[i][j]){
                    System.out.print("W");
                }else{
                    System.out.print("B");
                }
            }
            System.out.println();
        }*/

        //이제 8*8이 나오는 모든 경우에 대해 색칠하는 cnt 를 세고 가장 작은 cnt를 구하면 된다.
        // 최대 cnt는 다 다른 64이다.
        int cnt =0;
        int minCnt = 64;
        for(int i =0;i<N;i++){
            for(int j=0;j<M;j++){
                if(i+7<N&&j+7<M){
                cnt=paintBoardCount(board,i,j);
                    if(cnt<minCnt){
                        minCnt = cnt;
                    }
                }

            }
        }




        System.out.println(cnt);





    }
    // 각 시작점에 대해 8*8 분량만큼들 순회하며 규칙에 맞게 칠하는 횟수를 세는 메소드
    public static int paintBoardCount(boolean[][] board,int i ,int j){
        int cnt = 0;
        //복사본 생성
        boolean[][] copy= new boolean[8][8];
        for(int k = 0;k<8;k++){
            for(int l = 0;l<8;l++){
                copy[k][l]=board[k+i][l+j];
            }
        }

        //세로 1열을 먼저 정렬 시킴
        for(int k = 1;k<8;k++){
            if(copy[k-1][0]){
                if(copy[k][0]){
                copy[k][0] = false;
                cnt++;
                }
            }else{
                if(!copy[k][0]){
                copy[k][0] = true;
                cnt++;
                }
            }
        }

        for(int k = 0;k<8;k++){
            for(int l = 1;l<8;l++){
                if(copy[k][l-1]){
                    if(copy[k][l]){
                        copy[k][l] = false;
                        cnt++;
                    }
                }else{
                    if(!copy[k][l]){
                        copy[k][l] = true;
                        cnt++;
                    }
                }
            }
        }


        return cnt;

    }
}

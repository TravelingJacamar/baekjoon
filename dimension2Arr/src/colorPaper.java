import java.util.Scanner;

public class colorPaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //색종이 판
        boolean [][] Field = new boolean[100][100];
        //붙일 종이의 갯수
        int  n = input.nextInt();
        //기본 넓이
        int width = 0;
        //붙일 부분 입력받기
        int[] garo = new int[n];
        int[] sero = new int[n];

        for(int i =0;i<n;i++){
            garo[i] = input.nextInt();
            sero[i] = input.nextInt();
        }

        for(int i =0;i<n;i++){
            for(int j = garo[i];j < garo[i] + 10;j++){
                for(int k = sero[i]; k < sero[i] + 10;k++){
                    Field[j][k]=true;
                }
            }
        }

        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(Field[i][j]){
                    width++;
                }
            }
        }



        System.out.println(width);
    }

}

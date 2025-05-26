import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //프로그래밍에서 분해합이란 N + N의 각자리수
        //이때 N =M +M의 각자리수 라면 M 은 N 의 생성자
        // 단순하게 생각해보자..
        // 생성자가 더 클 수 는 없다 상식적으로 그렇다면 N 보다 작은 수에 대해 전부 다해야한다..?
        int N = input.nextInt();
        int cnt=0;
        int answer=0;
        //자릿수 확인 cnt == 자릿수
        for(int i =1;i<N;i=i*10){
            if(N/i!=0){
                cnt++;
            }else{
                break;
            }
        }
        //각자리 숫자의 합부터 구하기

        for(int i =1; i<N;i++){
            int sum =0;
            int tmp = i;
            for(int j =0; j<cnt;j++){
                sum += tmp%10;
                tmp = tmp/10;
                if(tmp==0){
                    break;
                }
            }
            if(N==sum+i){
                answer=i;
                break;
            }
        }

        System.out.println(answer);






    }
}

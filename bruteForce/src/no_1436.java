import java.util.Scanner;
public class no_1436 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 이건 브루트포스 문제다. 즉  반복문을 돌리는 것이다 즉 숫자를 올리면서 6이 최소 3개 이상 있는
        // 수를 카운트 하여 카운트가 N 과 같아졌을때 반복을 끝내고 해당 숫자를 출력한다.
        int N = input.nextInt();
        int count = 0;
        int result = 0;

        for(int i = 666; i>0;i++){
            int tmp = i;
            int cnt = 0;
            while(tmp > 0){
                int n = tmp % 10;
                tmp = tmp / 10;
                if(n == 6){
                    cnt++;
                    if (cnt>=3){
                        count++;
                        break;
                    }
                }else{
                    cnt = 0;
                }
            }
            if(count == N){
                result = i;
                break;
            }
        }
        System.out.println(result);

    }
}

import java.util.Scanner;

public class beehive {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //규칙 찾기
        //인접한 칸의 갯수는 가운데를 기준으로 6개씩 증가함 1개 6개 12개 18개
        //즉 1 은 가운데 7까지는 2번째 19까지는 3번째.
        //지나가는 방의 갯수는 도착하는 것까지 포함. 1번방까지의 최소개수 방은 1.

        int num = input.nextInt();

        int result = 0;
        int i =1;
        int j =1;
        while(true){

            if(num<=i){
                result = j;
                break;
            }else{
                i = i+6*j;
                j++;
            }

        }

        System.out.println(result);
    }
}

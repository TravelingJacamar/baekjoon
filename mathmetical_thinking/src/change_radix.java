import java.util.Scanner;

public class change_radix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //진법 변환인데 9이상은 알파벳 표기 즉 입력은 String 으로 받아야함.
        String in = input.next(); //공백을 기준으로 입력받음.
        int num = input.nextInt();
        int sum=0;

        //이제 String 을 문자하나하나도 쪼개야하는데..인덱스로 쓰려면 toCharArray
        char[] inToChar = in.toCharArray();

        //이제 계산을 해보자 아스키코드 쓰면 좋을 듯. 대문자 a=65

        for(int i=0;i<in.length();i++){
            int a = inToChar[i];

            if(a >=48 && a <= 57){
                a = a-48;
            }else if(a>=65&&a<=90){
                a = a-55;
            }
            //곱할 값 즉 자릿값
            int n = 1;
            for(int j=in.length()-i;j>1;j--){
                n *= num;
            }
            sum += a*n;
        }

        System.out.println(sum);



    }
}

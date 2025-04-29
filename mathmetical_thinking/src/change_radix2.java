import java.util.Scanner;

public class change_radix2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //이 전 문제 역순 느낌인듯. 10진 수 입력을 n진법 출력;

        int num = input.nextInt();
        int radix = input.nextInt();
        String result = new String("");
        // 계속해서 진수로 나누고 나머지 적기. 몫이 안나올때까지.
        do{
            //혹시 한번에 끝날수도 있으니.
            if(num/radix == 0){
                if(num>=10){
                    result += (char)(num+55);
                }else{
                    result += (char)(num+48);
                }
                break;
            }
            int a = num%radix;
            if(a>=10){
                result += (char)(a+55);
            }else{
                result += (char)(a+48);
            }
            num = num/radix;
        } while(num != 0);

        //이제 문자열을 뒤집으면 됨. 그냥 toCharArray로 거꾸로 출력하는게 편할듯
        char[] arr = result.toCharArray();

        for(int i=result.length()-1;i>=0;i--){
            System.out.print(arr[i]);
        }






    }
}

import java.util.Scanner;

public class findFraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int n1 = 0,n2 = 0;
        int sum = 0;
        int floor = 1;
        int offset = 0;

        for(int i = 0;i>=0;i++){
            sum += i;
            if(sum >= num){
                offset=sum - num;
                floor = i;
                break;
            }
        }
        int amount = floor + 1;

        if(amount%2==0){
            n1 = 1;
            n2 = amount-1;
            for(int i=0;i<offset;i++){
                n1++;
                n2--;
            }
        }else{
            n1 = amount-1;
            n2 = 1;
            for(int i=0;i<offset;i++){
                n1--;
                n2++;
            }
        }

        System.out.println(n1+"/"+n2);
    }
}

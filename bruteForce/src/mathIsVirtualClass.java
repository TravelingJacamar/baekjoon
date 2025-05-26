import java.util.Scanner;

public class mathIsVirtualClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //x 와 y의 범위는 -999 에서 999 까지. 1000* 1000 은 백만 int로도 충분히 가능
        int x=0,y=0;
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();


        for(int i=-999;i<=999;i++){
            for(int j=-999;j<=999;j++){
                if(a*i+b*j==c&&d*i+e*j==f){
                    x=i;
                    y=j;
                }
            }
        }





        System.out.println(x+" "+y);


    }

}

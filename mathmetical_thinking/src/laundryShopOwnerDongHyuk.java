import java.util.Scanner;

public class laundryShopOwnerDongHyuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //쿼터 25 다임 10 니켈 5 페니 1
        int q,d,n,p;

        //반복 횟수
        int num = input.nextInt();
        int[] arr = new int[num];

        //계산할 값들 입력 받기.
        for(int i =0;i<num;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<num;i++){
            int price = arr[i];
            q = price/25;
            price %= 25;
            d = price/10;
            price %= 10;
            n = price/5;
            price %= 5;
            p = price;
            System.out.println(q+" "+d+" "+n+" "+p);
        }


    }
}

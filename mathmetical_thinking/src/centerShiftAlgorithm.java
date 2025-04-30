import java.util.Scanner;

public class centerShiftAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //규칙 찾기
        //처음 점의 갯수는 정사각형의 수는 1 점의 수는 4
        //기존 점-1 만큼 점이 추가되며 각 변마다 증가하는 점의 갯수가 같다.
        //즉 점의 갯수는 한 변의 점의 갯수의 제곱.


        int num = input.nextInt();

        int pointAtOneSide = 2;
        int result;


            for(int i=0;i<num;i++){
                pointAtOneSide += pointAtOneSide-1;

            }
        result = pointAtOneSide*pointAtOneSide;

        System.out.println(result);
    }
}

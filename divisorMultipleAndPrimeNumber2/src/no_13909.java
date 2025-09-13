import java.io.*;

public class no_13909 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //흐음 배열을 만들어서 바꾸고 세는게 맞을까.. 그럼 시간복잡도가 가능한가
        //이렇게하면 메모리초과가 뜸.
        //그래서 찾은 규칙성. 결과적으로 열려있는 창문의 갯수는 어떤수의 제곱이어야함.
        //N이하의 제곱수 갯수는 루트 N의 정수부분 과 동일함. 즉 이것은 알고리즘보다는 수학적 문제.
        int N = Integer.parseInt(br.readLine());
        int result = (int) Math.sqrt(N);

        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();


    }
}

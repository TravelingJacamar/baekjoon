import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class no_7785 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력 줄수
        int N = Integer.parseInt(br.readLine());
        //회사에 출근했으나 퇴근은 못한 사람들 집합 동명이인 없음
        Set<String> company = new HashSet<>();

        for(int i =0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String eOrL = st.nextToken();
            //equals 는 구현할 수 있기에 내장함수 사용
            //더 짧은 문자열 기중으로 반복문을 돌리고 charAt 메소드로 같은 위치 문자 비교하면 됨.
            if(eOrL.equals("enter")){
                company.add(name);
            }else{
                company.remove(name);
            }
        }
        List<String> cList = new ArrayList<>(company);
        cList.sort(Comparator.reverseOrder());


        for(String n : cList){
            bw.write(n+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }


}

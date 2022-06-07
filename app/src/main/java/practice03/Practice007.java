package practice03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Practice007 {

  //  문제
  //  두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
  //  입력
  //  첫째 줄에 테스트 케이스의 개수 T가 주어진다.
  //  각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
  //  출력
  //  각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {

      int t = Integer.parseInt(br.readLine());


      for (int i = 1; i <= t; i++) {
        String[] arr = new String[2];
        arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        bw.write("Case #" + i + ": " + (a + b) + "\n");

      }


    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

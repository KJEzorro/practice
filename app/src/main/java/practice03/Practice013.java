package practice03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Practice013 {

  //  문제
  //  두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
  //  입력
  //  입력은 여러 개의 테스트 케이스로 이루어져 있다.
  //  각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
  //  입력의 마지막에는 0 두 개가 들어온다.
  //  출력
  //  각 테스트 케이스마다 A+B를 출력한다.

  public static void main(String[] args) {

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {

      String str = br.readLine();
      int a = Integer.parseInt(str.split(" ")[0]);
      int b = Integer.parseInt(str.split(" ")[1]);

      while (a != 0 && b != 0) {
        bw.write(a + b + "\n");

        str = br.readLine();
        a = Integer.parseInt(str.split(" ")[0]);
        b = Integer.parseInt(str.split(" ")[1]);
      }
      bw.flush();


    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}

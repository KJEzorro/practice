package practice03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Practice002 {

  //  문제
  //  두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
  //  입력
  //  첫째 줄에 테스트 케이스의 개수 T가 주어진다.
  //  각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
  //  출력
  //  각 테스트 케이스마다 A+B를 출력한다.

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      list.add(a+b);

    }

    Iterator<Integer> it = list.iterator(); 
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}

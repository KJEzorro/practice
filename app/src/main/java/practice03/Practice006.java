package practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Practice006 {
  //  문제
  //  자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
  //  입력
  //  첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
  //  출력
  //  첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    List<Integer> list = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      list.add(i);
    }

    Collections.reverse(list);

    Iterator<Integer> it = list.iterator(); 
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}

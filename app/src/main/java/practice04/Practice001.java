package practice04;

import java.util.Scanner;

public class Practice001 {

  //  문제
  //  N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
  //  입력
  //  첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
  //  둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
  //  모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
  //  출력
  //  첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다

  public static void main(String[] args) {

    int minNum;
    int maxNum;
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];


    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    minNum = arr[0];
    maxNum = arr[0];

    for (int j = 0; j < arr.length; j++) {

      if (maxNum < arr[j]) {
        maxNum = arr[j];
      }

      if (minNum > arr[j]) {
        minNum = arr[j];
      }
    }


    System.out.printf("%d %d",minNum, maxNum);
  }
}

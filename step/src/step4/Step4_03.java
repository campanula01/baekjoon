package step4;

/*문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.*/
import java.io.*;
import java.util.*;

public class Step4_03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int array[] = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());

		}
		int min = array[0], max = array[0];
		for (int j = 0; j < array.length; j++) {
			if (array[j] < min) {
				min = array[j];
			}
			if (array[j] > max) {
				max = array[j];
			}
		}
		System.out.println(min + " " + max);
	}
}

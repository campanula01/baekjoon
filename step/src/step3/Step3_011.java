package step3;

/*문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

입력의 마지막에는 0 두 개가 들어온다.

출력
각 테스트 케이스마다 A+B를 출력한다.*/
import java.util.*;
import java.io.*;

public class Step3_011 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (a == 0 && b == 0) {
				break;
			} else {
				bw.write(a + b + "\n");
			}
		}
		bw.flush();
	}
}

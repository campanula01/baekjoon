package step3;

/*문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.*/
import java.util.Scanner;

public class Step3_008 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int c[] = new int[T];
		int a[] = new int[T];
		int b[] = new int[T];
		for (int i = 0; i < T; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = a[i] + b[i];
		}

		for (int x = 1; x <= T; x++) {
			System.out.println("Case #" + x + ": " + a[x - 1] + " + " + b[x - 1] + " = " + (a[x - 1] + b[x - 1]));
		}
	}
}

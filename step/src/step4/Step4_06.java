package step4;

import java.util.*;
import java.io.*;

public class Step4_06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int array[] = new int[N];
		for (int x = 0; x < array.length; x++) {
			array[x] = x + 1;

		}

		for (int y = 0; y < M; y++) {
			int i, j;
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st1.nextToken());
			j = Integer.parseInt(st1.nextToken());

			int temp;
			temp = array[i - 1];
			array[i - 1] = array[j - 1];
			array[j - 1] = temp;
		}

		for (int x1 = 0; x1 < array.length; x1++) {
			System.out.print(array[x1] + " ");
		}
	}

}

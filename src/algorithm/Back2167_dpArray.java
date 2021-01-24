package algorithm;

import java.util.Scanner;

public class Back2167_dpArray {
	/*
	 dp로 풀기
	 1. 0,0부터 그 값까지의 합을 더한값을 배열에 넣는다.
	 2. 원하는 부분을 구역별로 잘라서 중복되는 부분을 빼준다
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int num [][] = new int[N+1][M+1];
		for (int i = 1; i <= N; i ++) {
			for (int j = 1; j <= M; j ++) {
				//앞에서 부터 i,j까지 합을 배열에 넣어준다.
				num[i][j] = num[i - 1][j] + num[i][j - 1] - num[i - 1][j - 1] + sc.nextInt();

			}
		}
		int k = sc.nextInt();
		int [] result = new int[k];
		for (int i = 0; i < k; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			
			//상자모양을 그려보면서 중복된 부분을 제거 해준다.
			result[k] = num[x1][y1] + num[x - 1][y - 1] - num[x - 1][y1] - num[x1][y - 1];

		}
		for (int i : result) {
			System.out.println(i);
		}
		sc.close();
	}

}

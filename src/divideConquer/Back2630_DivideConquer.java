package divideConquer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/2630 - 색종이 만들기 (분할정복)

public class Back2630_DivideConquer {

	static int[][] arr;
	static int n, w = 0, b = 0;

	static boolean isAble(int row, int col, int size) {
		int temp = arr[row][col];
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (temp != arr[i][j])
					return false;
			}
		}
		return true;
	}

	static void cut(int row, int col, int size) {
		if (size == 1 | isAble(row, col, size)) {
			if (arr[row][col] == 1) {
				b++;
			} else {
				w++;
			}
		} else {
			size = size / 2;
			cut(row, col, size);
			cut(row + size, col, size);
			cut(row, col + size, size);
			cut(row + size, col + size, size);
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n + 1][n + 1];
		for (int i = 1; i < n + 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j < n + 1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		cut(1, 1, n);
		System.out.println(w);
		System.out.println(b);
	}

}

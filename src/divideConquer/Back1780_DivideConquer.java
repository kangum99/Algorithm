package divideConquer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1780 - 종이의 개수 - 분할정복

public class Back1780_DivideConquer {
	static int n, zero = 0, one = 0, minus = 0;
	static int[][] arr;
	
	static boolean isAble (int r, int c, int s) {
		int temp = arr[r][c];
		for(int i = r; i < s+r; i++) {
			for(int j = c; j < s+c; j++) {
				if(temp != arr[i][j])
					return false;
			}
		}
		return true;
	}
	
	static void cut (int r, int c, int s) {
		if(s == 1 | isAble(r, c, s)) {
			if(arr[r][c] == 0) zero++;
			else if(arr[r][c] == 1) one++;
			else minus++;
		}else {
			s = s/3;
			for(int i = 0 ; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					cut(r+s*i, c+s*j, s);
				}
			}
			
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1][n+1];
		for(int i = 1; i < n+1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j < n+1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		cut(1, 1, n);
		System.out.println(minus);
		System.out.println(zero);
		System.out.println(one);
	}

}

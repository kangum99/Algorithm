package divideConquer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/1992 - 쿼드트리(분할정복)

public class Back1992_DivideConquer {

	static int n;
	static int[][] arr;
	static StringBuilder sb;
	
	static boolean isAble(int r, int c, int size) {
		int temp = arr[r][c];
		for(int i = r; i < size+r; i++) {
			for (int j = c; j < size+c; j++) {
				if(temp != arr[i][j])
					return false;
			}
		}
		return true;
	}
	
	static void pressure(int r, int c, int size) {
		if (size == 1 | isAble(r, c, size)) {
			sb.append(Integer.toString(arr[r][c]));
		} else {
			size = size/2;
			sb.append("(");
			pressure(r, c, size);
			pressure(r, c+size, size);
			pressure(r+size, c, size);
			pressure(r+size, c+size, size);
			sb.append(")");
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1][n+1];
		sb = new StringBuilder();
		for (int i = 1; i < n+1; i++) {
			String s = br.readLine();
			for(int j = 1; j < n+1; j++) {
				arr[i][j] = Character.getNumericValue(s.charAt(j-1));
			}
		}
		
		pressure(1, 1, n);
		System.out.println(sb);
		br.close();
	}

}

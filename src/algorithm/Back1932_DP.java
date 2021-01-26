package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1932 정수 삼각형 - DP

public class Back1932_DP {
	
	private static int n;
	private static int[][] arr;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		//i에 레벨, j는 위치
		for (int i = 0; i < n; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j <= i; j ++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if (i >= 1) {
					//레벨의 첫번째 위치면 그냥 위에 레벨 첫번째 것 더하기
					if (j == 0) arr[i][j] += arr[i-1][j];
				
					//아닌경우는 max를 구해서 더하기
					else arr[i][j] += Math.max(arr[i-1][j-1], arr[i-1][j]);
				}
			}
		}
		br.close();
		
		int max = -1;
		//마지막 레벨에서 최댓값 구하기
		for (int i = 0; i < n; i++) {
			if(max < arr[n-1][i]) max = arr[n-1][i];
		}
		System.out.println(max);
	}	
}

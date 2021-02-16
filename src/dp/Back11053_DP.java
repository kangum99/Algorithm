package dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/11053 가장 긴 증가하는 부분 수열 -DP


public class Back11053_DP {
	
	private static int N, max = 0;
	private static int[] arr;
	private static int[] dp;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		dp = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0 ; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = 1;
		}
		
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) {
				//dp배열에는 길이가 들어간다. 부분수열 마다 들어가는 길이 중 가장 큰거를 넣어야 되므로 기준이 되는 j에 1을 더함 
				if(arr[j] < arr[i] && dp[i] <= dp[j]) dp[i] = dp[j] + 1; 
			}
		}
		
		for (int i : dp) {
			max = Math.max(max, i);
		}
		br.close();
		
		System.out.println(max);
	}

}

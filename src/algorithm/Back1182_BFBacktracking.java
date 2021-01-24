package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백트래킹 - https://www.acmicpc.net/problem/1182

public class Back1182_BFBacktracking {
	static int n, s, cnt=0;
	static int[] N;
	
	private static void dfs(int Nlength, int value) {
		//깊이의 끝까지(배열 끝까지) 갔을 때 값이 s랑 같음 ++
		if(Nlength == n) {
			if(value == s) cnt++;
			return;
		}
		// 그 위치의 원소를 더하는 경우
		dfs(Nlength + 1, value + N[Nlength]);
		//그 위치의 원소를 더하지 않는 경우
		dfs(Nlength + 1, value);
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		
		N = new int[n];
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i ++) {
			N[i] = Integer.parseInt(st1.nextToken());
		}
		br.close();
		dfs(0, 0);
		//s = 0이면 공집합 빼주기
		System.out.print(s == 0? --cnt : cnt);
	}

}

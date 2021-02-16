package dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1149 RGB (DP)

public class Back1149_DP {
	
	static int N, result;
	static int[][] cl;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		cl = new int[N][3];
		
		for (int i = 0; i < N; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				if (i == 0) cl[i][j] = Integer.parseInt(st.nextToken());
				else {
					if (j == 0) 
						cl[i][j] = Math.min(cl[i-1][j+1], cl[i-1][j+2]) + Integer.parseInt(st.nextToken()); 
					else if (j == 1) 
						cl[i][j] = Math.min(cl[i-1][j-1], cl[i-1][j+1]) + Integer.parseInt(st.nextToken()); 
					else 
						cl[i][j] = Math.min(cl[i-1][j-2], cl[i-1][j-1]) + Integer.parseInt(st.nextToken());
				}
			}
			if (i == N-1) {
				result = (cl[i][0] > cl[i][1] ? Math.min(cl[i][1], cl[i][2]) : Math.min(cl[i][0], cl[i][2]) );
				System.out.println(result);
			}
		}
		br.close();
	}

}

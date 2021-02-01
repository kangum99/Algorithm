package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1003 -피보나치(DP알고리즘)

public class Back1003_DP {

	private static int test;
	private static int[] f0 = new int[41];
	private static int[] f1 = new int[41];

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		test = Integer.parseInt(br.readLine());
		f0[0] = 1;
		f0[1] = 0;
		f1[0] = 0;
		f1[1] = 1;
		
		for (int i = 0; i < test; i++) {
			int N = Integer.parseInt(br.readLine());
			for (int j = 2; j < N+1; j++) {
				f0[j] = f0[j - 1] + f0[j - 2];
				f1[j] = f1[j - 1] + f1[j - 2];
			}
			System.out.println(f0[N] + " " + f1[N]);
		}
		br.close();
	}

}

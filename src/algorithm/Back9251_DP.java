package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/9251 LCS(DP)

public class Back9251_DP {
	
	private static String str1, str2;
	private static int[] dp1, dp2;
	private static int dp1Sum, dp2Sum;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str1 = br.readLine();
		str2 = br.readLine();
		//[0=A 인 숫자]= 그 알파벳이 몇개인지
		dp1 = new int[26];
		dp2 = new int[26];
		
		for (int i = 0; i < str1.length(); i++) {
			if (dp1[str1.charAt(i)-'A'] != 0) {
				dp1[str1.charAt(i)-'A']++;
				continue;
				}
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					dp2[str2.charAt(j)-'A']++;
				}
				// 같은 것이 있으면 처음에만 dp1에도 ++
				if (dp2[str2.charAt(j)-'A'] == 1) dp1[str1.charAt(i)-'A']++;
			}
		}
		
		for(int i:dp1) System.out.print(i);
		System.out.println();
		for(int i:dp2) System.out.print(i);
		for (int i = 0; i < 26; i ++) {
			dp1Sum += dp1[i];
			dp2Sum += dp2[i];
		}
		
		System.out.println(Math.min(dp1Sum, dp2Sum));
	}

}

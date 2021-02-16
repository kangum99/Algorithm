package BF;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//완전 탐색- https://www.acmicpc.net/problem/1969

public class Back1969_BF {
	private static char LinkChar(int a, int t, int g, int c, int max) {
		if(max == a) return 'A';
		else if (max == c) return 'C';
		else if (max == g) return 'G';
		else return 'T';
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[] s = new String[n];
		for (int i = 0; i < n; i ++) {
			s[i] = br.readLine();
		}
		int max = 0, hashing = 0;
		for (int i = 0; i < m; i++) {
			int a = 0, c = 0, g = 0, t = 0;
			for (int j = 0; j < n; j++) {
				//ACGT에 나온 갯수 만큼 넣기
				if(s[j].charAt(i) == 'A') a++;
				else if(s[j].charAt(i) == 'C') c++;
				else if(s[j].charAt(i) == 'G') g++;
				else if(s[j].charAt(i) == 'T') t++;
			}
			max = Math.max(a>=c?a:c, g>=t?g:t);
			//가장 큰걸 빼면 나머지 다른것들의 갯수만 나옴-> 최소
			hashing += (n-max);
			System.out.print(LinkChar(a, t, g, c, max));
		}
		System.out.println("\n"+hashing);
		br.close();
	}

}

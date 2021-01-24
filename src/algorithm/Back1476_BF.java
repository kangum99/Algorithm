package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1476_BF {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int e = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		//s의 몫
		int s_q = -1;
		br.close();
		while(true) {
			s_q++;
			//s 범위가 가장 크기 때문에 s기준
			//s의 나머지정리 공식 a = 구해야 하는 년도
			int a = (28*s_q)+s;
			if( (a-m)%19 != 0 ) continue;
			else {
				if ( (a-e)%15 != 0 ) continue;
				else {
					System.out.println(a);
					break;
				}
			}
		}
	}

}

package swMaestro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//피씨방

public class Onetwo {
	static int p, n, h;
	static int[] arr;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		p = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		int temp = h;
		arr = new int[p+1];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(y > h)
				continue;
			else {
				if(temp == 0)
					break;
				if(temp >= y) {
					arr[x] += y;
					temp -= y;
				}else {
					arr[x] += y-temp;
					temp = 0;
				}	
			}
		}
		for(int i = 1; i < p+1; i++) {
			System.out.println(i+" "+arr[i]*1000);
		}
	}

}

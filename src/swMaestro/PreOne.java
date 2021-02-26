package swMaestro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//)))(((

public class PreOne {
	
	static String s;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();
		int cnt = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(')
				cnt++;
			else 
				cnt--;
		}
		if(cnt == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}

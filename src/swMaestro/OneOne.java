package swMaestro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//연계스킬

public class OneOne {
	static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	static int n;
	static boolean[] tf;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		for(int i = 0; i < 60; i++){
			list.add(new ArrayList<Integer>());
		}
		tf = new boolean[61];
		for(int i = 0; i < 60; i++) {
			String[] st = br.readLine().split(" ");
			int a = st[0].charAt(0)-'A';
			int b = st[1].charAt(0)-'A';
			list.get(a).add(b);
			list.get(b).add(a);
		}
		System.out.println(0);
			
	}

}

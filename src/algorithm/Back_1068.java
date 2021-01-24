package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
// 몇번 문제인지 보고 다시풀기
public class Back_1068 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		int result = 0;
		int last = 0;
		for (int i = 0; i < a; i++) {
			list.add(i, Integer.parseInt(st.nextToken()));
		}
		int del_num = Integer.parseInt(br.readLine());
		br.close();

	}

}

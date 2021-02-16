package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

//https://www.acmicpc.net/problem/1427 - 소트인사이드 - 정렬

public class Back1427_sort {
	
	static String str;
	static Integer[] arr;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		str = br.readLine();
		arr = new Integer[str.length()];
		for (int i = 0; i < str.length(); i ++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
		}
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i : arr) {
			sb.append(i);
		}
		System.out.println(sb);
		br.close();
	}

}

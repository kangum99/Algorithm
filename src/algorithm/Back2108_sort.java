package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;
//https://www.acmicpc.net/problem/2108 통계학 - 정렬 - 다시 하기

public class Back2108_sort {
	
	static int n, scope, sum = 0;
	static int[] arr;
	static double avg, mid;
	static TreeMap<Integer, Integer> most;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		most = new TreeMap<Integer, Integer>();
		int cnt = 1;
		for (int i = 0 ; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			sum += arr[i];
			
		}
		System.out.println(most);
		
//		산술 평균
		avg = sum / n; 
		
		Arrays.sort(arr);
		
//		범위
		scope = arr[n-1] - arr[0];
		
//		최빈값
		
		
//		중앙값
		if(n % 2 == 0) {
			mid = (arr[n/2] + arr[n/2+1])/2;
		} else {
			mid = arr[n/2];
		}
		
		System.out.println(Math.round(avg));
		System.out.println(mid);
		System.out.println(most);
		System.out.println(scope);
	}

}

package binarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1920 수찾기-이진탐색

public class Back1920_binarySearch {
	static int N, M;
	static int[] arr;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int n = Integer.parseInt(st.nextToken());
			System.out.println(BinarySearch(n));
		}
		
		br.close();
	}
	
	static int BinarySearch (int n) {
		int left = 0;
		int right = N-1;
		while(left <= right) {
			int mid = (left+right)/2;
			if(arr[mid] == n) 
				return 1;
			if(arr[mid] < n)
				left = mid+1;
			else
				right = mid-1;
		}
		return 0;
	}

}

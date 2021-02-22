package binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10816 - 숫자카드2 -이진탐색
//https://hyunjiishailey.tistory.com/144
//133780KB, 1760ms -> 메모리는 적지만 시간은 느림
//메모이제이션 이용 시 보통 200000KB조금 넘고, 1000ms조금 넘는다

public class Back10816_BinarySearch {
	static int[] arr;
	static int N, M;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int num, low, up;
		for(int i = 0; i < M; i++) {
			num = Integer.parseInt(st.nextToken());
			low = lower(num);
			up = upper(num);
			bw.write((up-low)+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	static int lower(int n) {
		int left = 0, right = N-1, mid;
		while(left < right) {
			mid = (left + right)/2;
			if(arr[mid] >= n)
				right = mid;
			else
				left = mid+1;
		}
		return right;
	}
	
	static int upper(int n) {
		int left = 0, right = N-1, mid;
		while(left < right) {
			mid = (left + right)/2;
			if(arr[mid] > n)
				right = mid;
			else
				left = mid+1;	
		}
//		right값이 배열 크기를 넘어갈 때 
		if( arr[right] == n ) 
			right++;
		return right;
	}

}

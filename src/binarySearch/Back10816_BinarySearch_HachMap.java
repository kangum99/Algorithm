package binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10816 - 숫자카드2 -이진탐색

public class Back10816_BinarySearch_HachMap {
	static int N, M;
	static int[] arr;
//	정렬되어 만들어진 map
	static HashMap<Integer, Integer> map;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 		N = Integer.parseInt(br.readLine());
		map = new HashMap<>(500000);
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
//		출력값을 저장할 sb
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
//			키값이 num인 것이 없으면 put하라
			map.putIfAbsent(num, 0);
			map.replace(num, map.get(num)+1);
		}
		
		M = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int n = Integer.parseInt(st2.nextToken());
			if(!map.containsKey(n))
				bw.write("0 ");
			else
				bw.write(map.get(n)+" ");
		}
		bw.close();
		br.close();
	}
}

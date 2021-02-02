package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/2178 BFS(미로탐색)

public class Back2178_BFS {
	
	static int[][] arr;
//	node는 노드(본래 숫자)
	static int N, M, tot, cnt=2, node=1;
	static boolean[] check;
	static ArrayList<String> str;
	
	static void bfs(int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		check[1] = true;
		while(!q.isEmpty()) {
			int num = q.poll();
			for(int i = 1; i < tot; i++) {
				if(arr[num][i] == 1 && check[i]==false) {
					q.add(i);
					check[i] = true;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
	}

}

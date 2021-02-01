package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back1260_BfsDfs_arr {
	
	private static int N, M, V;
	private static int[][] arr;
	private static boolean[] tf;
	private static StringBuilder sb = new StringBuilder();
	
	private static void check() {
//		아직 안갔다(false)는 초기화 
		for (int i = 0; i < N+1; i++) tf[i] = false;
	}
	
	private static void dfs(int v) {
		sb.append(v + " ");
		tf[v] = true;
		
		for (int i = 1; i < N+1; i ++) {
//			시작 노드가 아니고, 간적 없는 노드이고, 그 노드에 간선이 존재 할 때
			if(i != v && tf[i] == false && arr[v][i] == 1) {
				dfs(i);
			}
		}
	}
	
	private static void bfs(int v) {
		check();
		tf[v] = true;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(v);
		
		while (!q.isEmpty()) {
			int num = q.poll();
			sb.append(num+ " ");
			for (int i = 1; i < N+1; i++) {
//				시작 노드가 아니고, 간적 없는 노드이고, 그 노드에 간선이 존재 할 때
				if (i != num && tf[i] == false && arr[num][i] == 1) {
					q.add(i);
					tf[i] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1][N+1];
		tf = new boolean[N+1];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
//			양방향이기 때문에
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		dfs(V);
		sb.append("\n");
		bfs(V);
		
		System.out.println(sb);
		
	}

}

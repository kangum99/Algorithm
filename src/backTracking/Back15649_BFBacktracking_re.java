package backTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//백트래킹 - https://www.acmicpc.net/problem/15649
public class Back15649_BFBacktracking_re {
	static int N, M, cnt = 0;
	static int[] arr;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	private static void dfs(int i, int M) {
		list.add(i);
		if (M == 1) {
			for(Integer i1 : list) { //for문을 통한 전체출력
			    System.out.print(i1+" ");
			}
			list.remove(list.size()-1);
			System.out.print("\n");
		}else {
			M--;
			for (int i1 = 1; i1 < N+1; i1 ++) {
				if (i1 == i) continue;
				else {
					
					dfs(i1, M);
				}
			}
		}
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		for (int i = 1; i < N+1; i ++) {
			dfs(i, M);
			list.clear();
		}
		
	}

}

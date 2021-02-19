package divideConquer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/6549 히스토그램에서 가장 큰 직사각형 
//- 분할정복, 스택, 세그먼트 트리

public class Back6549_DivideConquer {
	static int tc;
	static int[] arr;

	private static long bigSize(int left, int right){
		if(left == right) return arr[left];

		int mid = (left + right) / 2;
		// 두 구간으로 나누어 계산, 양쪽 중에 큰 넓이를 반환 (구간이 1이면 높이== 넓이)
		long ret = Math.max(bigSize(left, mid), bigSize(mid+1, right));

		// 두 부분에 모두 걸치는 사각형을 구한다.
		int start = mid;
		int end = mid+1;
		// mid 기준 양쪽으로 너비 2만큼 겹치는 직사각형 먼저 고려
		long height = (long)Math.min(arr[start], arr[end]);
		ret = (long)Math.max(ret, height*2);
		
		//범위를 벗어나기 전까지 확장
		while(left < start || end < right){
			// 모든 범위를 넘지 않았다면
			if(left < start && end < right){
				// 높이가 높은 쪽으로 확장
				if(arr[start -1] < arr[end+1])
					height = (long)Math.min(height, arr[++end]);
				else
					height = (long)Math.min(height, arr[--start]);
			}
			else if(left < start){
				// 오른쪽 범위를 넘은 경우 왼쪽으로만 확장
				height = (long)Math.min(height, arr[--start]);
			}
			else if(end < right){
				// 왼쪽 범위를 넘은 경우 오른쪽으로만 확장
				height = (long)Math.min(height, arr[++end]);
			}
			ret = Math.max(ret, height*(end-start+1));
		}
		return ret;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			tc = Integer.parseInt(st.nextToken());
			if (tc == 0)
				break;
			arr = new int[tc];
			for (int i = 0; i < tc; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			System.out.println(bigSize(0, tc-1));

		}
	}

}

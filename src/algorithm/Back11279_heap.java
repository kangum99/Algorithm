package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Back11279_heap {
	private static class MaxHeap {

		int heap[];
		int size;

		public MaxHeap(int size) {
			heap = new int[size];
		}
		
		//최댓값이 루트에 가도록 한다.
		public void insert(int x) {
			//힙은 1부터 시작한다
			heap[++size] = x; 
			//바로 위 부모부터 비교 (이진트리이기 때문에 /2)
			//밑에서 부터 올라간다
			for (int i = size; i > 1; i /= 2) {
				//새로 들어온 x(heap[i]-> 자식) 와 부모 heap[i/2]비교
				if (heap[i / 2] < heap[i]) { 
					swap(i / 2, i);
				} else {
					break;
				}
			}
		}
		//루트값(최댓값)을 빼고 맨밑 노드를 루트로 올린 후 heap한다.
		public int delete() { 
			// 빈 배열일 때는 0출력					
			if (size == 0) {
				return 0;
			}
			//루트값을 출력값에 넣어준다
			int root = heap[1];
			//마지막 값을 루트에 넣는다
			heap[1] = heap[size]; 
			size--; 
			//루트에서 부터 내려간다.
			//i*2 -> 이진트리라서
			for (int i = 1; i * 2 <= size;) {
				//부모가 대빵일 때 안바꿈
				if (heap[i] > heap[i * 2] && heap[i] > heap[i * 2 + 1]) {
					break;
				//왼이 가장 클때 왼이랑 부모랑 바꾸기
				} else if (heap[i * 2] > heap[i * 2 + 1]) { 
					swap(i, i * 2); 
					//왼쪽으로 내려간다
					i = i * 2;
				//오른이가 가장 클때 오른이랑 부모랑 바꾸기
				} else {
					swap(i, i * 2 + 1);
					//오른쪽으로 내려간다
					i = i * 2 + 1;
				}
			}
			return root;
		}
		// 바꾸는 함수
		public void swap(int a, int b) {
			int temp = heap[a];
			heap[a] = heap[b];
			heap[b] = temp;
		}

	}



	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		MaxHeap h = new MaxHeap(100001);

		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());

			if (x == 0) {
				System.out.println(h.delete());

			} else { // 자연수일 때는 insert 메서드에 x 더해준다
				h.insert(x);
			}

		}
	}

}

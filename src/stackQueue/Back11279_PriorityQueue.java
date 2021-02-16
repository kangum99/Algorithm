package stackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.PriorityQueue;

class Heap {
	ArrayList<Integer> list;
	int size;

	// 생성자
	public Heap() {
		list = new ArrayList<>();
		size = 0;
	}

	public void pull(int a) {
		if (size == 0)
			System.out.println("0");
		else {
			// 젤 마지막 값(최대값)을 지우고 프린트
			System.out.println(list.remove(size - 1));
			size--;
		}
	}

	// 값을 넣고 전에 있던 값보다 크면 배열 마지막에 배치
	public void add(int a) {
		int left = 0;
        int right = list.size() - 1;
        // a값이 들어갈 자리를 찾는 중 
        while(left <= right){
            int mid = (left + right)/2;

            if(list.get(mid) >= a){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        list.add(left, a);
		size++;
	}
}

public class Back11279_PriorityQueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Heap heap = new Heap();
		for (int i = 0; i < num; i++) {
			int a = Integer.parseInt(br.readLine());
			if (a == 0)
				heap.pull(a);
			else
				heap.add(a);
		}
		br.close();
	}
	
//	public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        //최대힙
 //       PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
//        for (int i = 0; i < N; i++) {
//            int n = Integer.parseInt(br.readLine());
//            if (n == 0) {
//                if (queue.isEmpty()) {
//                    System.out.println(0);
//                } else {
//                    System.out.println(queue.poll());
//                }
//            } else {
//                queue.offer(n);
//            }
//        }
//    }
}

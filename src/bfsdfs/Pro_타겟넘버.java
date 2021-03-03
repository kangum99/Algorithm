package bfsdfs;

public class Pro_타겟넘버 {
    static int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
    
    static int dfs(int[] numbers, int target, int index, int num) {
    	if(index == numbers.length)
    		return num == target ? 1 : 0;
    	else
    		return dfs(numbers, target, index + 1, num + numbers[index])
    				+ dfs(numbers, target, index + 1, num - numbers[index]);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		System.out.println(solution(numbers, target));
	}

}

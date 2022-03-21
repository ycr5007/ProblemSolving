package programmers.question.lv1.q02;

/*
	문제 설명
		주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, 
		nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
		
	제한사항
		nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
		nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.

	
	입출력 예
			nums				result
			[1,2,3,4]			1
			[1,2,7,6,4]			4
			
	입출력 예 설명
		입출력 예 #1
			[1,2,4]를 이용해서 7을 만들 수 있습니다.
	
		입출력 예 #2
			[1,2,4]를 이용해서 7을 만들 수 있습니다.
			[1,4,6]을 이용해서 11을 만들 수 있습니다.
			[2,4,7]을 이용해서 13을 만들 수 있습니다.
			[4,6,7]을 이용해서 17을 만들 수 있습니다.
*/

public class Way1 {
	
	public static int solution(int[] nums) {
		int answer = 0;
		int temp = 0;
		for(int x = 0; x < nums.length - 2; x++) {
			for(int y = x + 1; y < nums.length - 1; y++) {
				for(int z = y + 1; z < nums.length; z++) {
					temp = nums[x] + nums[y] + nums[z];
					boolean flag = true;
					for(int c = 2; c < temp; c++) {
						if((temp % c) == 0) {
							flag = false;
						}
					}
					if(flag) {
						answer++;
					}
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 7, 6, 4};
		System.out.println(solution(arr));
	}
	
	/*
		정확성  테스트
			테스트 1 〉	통과 (1.83ms, 70.9MB)
			테스트 2 〉	통과 (2.52ms, 77.2MB)
			테스트 3 〉	통과 (0.64ms, 75.9MB)
			테스트 4 〉	통과 (0.44ms, 72.6MB)
			테스트 5 〉	통과 (2.66ms, 75.9MB)
			테스트 6 〉	통과 (14.49ms, 75.5MB)
			테스트 7 〉	통과 (1.15ms, 75.3MB)
			테스트 8 〉	통과 (24.28ms, 78.7MB)
			테스트 9 〉	통과 (4.37ms, 84.5MB)
			테스트 10 〉	통과 (24.36ms, 77.3MB)
			테스트 11 〉	통과 (0.12ms, 73.3MB)
			테스트 12 〉	통과 (0.06ms, 76.2MB)
			테스트 13 〉	통과 (0.13ms, 73.4MB)
			테스트 14 〉	통과 (0.07ms, 75.1MB)
			테스트 15 〉	통과 (0.08ms, 77.3MB)
			테스트 16 〉	통과 (88.18ms, 74.3MB)
			테스트 17 〉	통과 (89.59ms, 74MB)
			테스트 18 〉	통과 (2.44ms, 73.4MB)
			테스트 19 〉	통과 (0.08ms, 71.5MB)
			테스트 20 〉	통과 (103.58ms, 83MB)
			테스트 21 〉	통과 (78.97ms, 90.4MB)
			테스트 22 〉	통과 (21.73ms, 76.1MB)
			테스트 23 〉	통과 (0.01ms, 79.4MB)
			테스트 24 〉	통과 (76.38ms, 81.8MB)
			테스트 25 〉	통과 (74.64ms, 84.5MB)
			테스트 26 〉	통과 (0.01ms, 75.1MB)
		
		채점 결과
			정확성: 100.0
			합계: 100.0 / 100.0
	
	*/
}

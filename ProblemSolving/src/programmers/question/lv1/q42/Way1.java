package programmers.question.lv1.q42;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
	폰켓몬
	
	문제 설명
		당신은 폰켓몬을 잡기 위한 오랜 여행 끝에, 홍 박사님의 연구실에 도착했습니다. 홍 박사님은 당신에게 자신의 연구실에 있는 총 N 마리의 폰켓몬 중에서 N/2마리를 가져가도 좋다고 했습니다.
		홍 박사님 연구실의 폰켓몬은 종류에 따라 번호를 붙여 구분합니다. 따라서 같은 종류의 폰켓몬은 같은 번호를 가지고 있습니다. 예를 들어 연구실에 총 4마리의 폰켓몬이 있고, 
		각 폰켓몬의 종류 번호가 [3번, 1번, 2번, 3번]이라면 이는 3번 폰켓몬 두 마리, 1번 폰켓몬 한 마리, 2번 폰켓몬 한 마리가 있음을 나타냅니다. 
		이때, 4마리의 폰켓몬 중 2마리를 고르는 방법은 다음과 같이 6가지가 있습니다.
		
			첫 번째(3번), 두 번째(1번) 폰켓몬을 선택
			첫 번째(3번), 세 번째(2번) 폰켓몬을 선택
			첫 번째(3번), 네 번째(3번) 폰켓몬을 선택
			두 번째(1번), 세 번째(2번) 폰켓몬을 선택
			두 번째(1번), 네 번째(3번) 폰켓몬을 선택
			세 번째(2번), 네 번째(3번) 폰켓몬을 선택
		이때, 첫 번째(3번) 폰켓몬과 네 번째(3번) 폰켓몬을 선택하는 방법은 한 종류(3번 폰켓몬 두 마리)의 폰켓몬만 가질 수 있지만, 다른 방법들은 모두 두 종류의 폰켓몬을 가질 수 있습니다. 
		따라서 위 예시에서 가질 수 있는 폰켓몬 종류 수의 최댓값은 2가 됩니다.
		당신은 최대한 다양한 종류의 폰켓몬을 가지길 원하기 때문에, 최대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택하려 합니다. 
		N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때, N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아, 
		그때의 폰켓몬 종류 번호의 개수를 return 하도록 solution 함수를 완성해주세요.
		
	제한사항
		nums는 폰켓몬의 종류 번호가 담긴 1차원 배열입니다.
		nums의 길이(N)는 1 이상 10,000 이하의 자연수이며, 항상 짝수로 주어집니다.
		폰켓몬의 종류 번호는 1 이상 200,000 이하의 자연수로 나타냅니다.
		가장 많은 종류의 폰켓몬을 선택하는 방법이 여러 가지인 경우에도, 선택할 수 있는 폰켓몬 종류 개수의 최댓값 하나만 return 하면 됩니다.
		
	입출력 예
		nums			result
		[3,1,2,3]		2
		[3,3,3,2,2,4]	3
		[3,3,3,2,2,2]	2
	
	입출력 예 설명
		입출력 예 #1
			문제의 예시와 같습니다.
		
		입출력 예 #2
			6마리의 폰켓몬이 있으므로, 3마리의 폰켓몬을 골라야 합니다.
			가장 많은 종류의 폰켓몬을 고르기 위해서는 3번 폰켓몬 한 마리, 2번 폰켓몬 한 마리, 4번 폰켓몬 한 마리를 고르면 되며, 따라서 3을 return 합니다.
		
		입출력 예 #3
			6마리의 폰켓몬이 있으므로, 3마리의 폰켓몬을 골라야 합니다.
			가장 많은 종류의 폰켓몬을 고르기 위해서는 3번 폰켓몬 한 마리와 2번 폰켓몬 두 마리를 고르거나, 혹은 3번 폰켓몬 두 마리와 2번 폰켓몬 한 마리를 고르면 됩니다. 
			따라서 최대 고를 수 있는 폰켓몬 종류의 수는 2입니다.
*/

public class Way1 {
	public static int solution(int[] nums) {
		int num = nums.length / 2;
		Integer arr[] = Arrays.stream(nums).boxed().toArray(Integer[]::new); 
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
		if(set.size() < num) {
			return set.size();
		}else {
			return num;
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {3,1,2,3};
		int[] arr2 = {3,3,3,2,2,4};
		int[] arr3 = {3,3,3,2,2,2};
		
		System.out.println(solution(arr1));
		System.out.println(solution(arr2));
		System.out.println(solution(arr3));
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (2.00ms, 72.9MB)
		테스트 2 〉	통과 (2.67ms, 69.7MB)
		테스트 3 〉	통과 (2.79ms, 78.1MB)
		테스트 4 〉	통과 (2.43ms, 72.9MB)
		테스트 5 〉	통과 (2.01ms, 81.2MB)
		테스트 6 〉	통과 (2.06ms, 77.5MB)
		테스트 7 〉	통과 (2.05ms, 79.1MB)
		테스트 8 〉	통과 (2.21ms, 69.9MB)
		테스트 9 〉	통과 (3.17ms, 78.4MB)
		테스트 10 〉	통과 (4.60ms, 75.2MB)
		테스트 11 〉	통과 (2.47ms, 77.6MB)
		테스트 12 〉	통과 (2.84ms, 80.9MB)
		테스트 13 〉	통과 (3.25ms, 77.8MB)
		테스트 14 〉	통과 (12.35ms, 92.3MB)
		테스트 15 〉	통과 (3.13ms, 78.1MB)
		테스트 16 〉	통과 (6.83ms, 81.8MB)
		테스트 17 〉	통과 (6.90ms, 76.8MB)
		테스트 18 〉	통과 (5.31ms, 86.9MB)
		테스트 19 〉	통과 (5.47ms, 77.8MB)
		테스트 20 〉	통과 (5.48ms, 79.5MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/

package programmers.question.lv2.q03;

import java.util.Arrays;

/*
문제 설명
	0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
	예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
	0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
제한 사항
	numbers의 길이는 1 이상 100,000 이하입니다.
	numbers의 원소는 0 이상 1,000 이하입니다.
	정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
*/


/*
	① String str = Arrays.toString(arr); > [1, 2, 3, 4]
	
	② String str = Arrays.toString(arr).replaceAll("[^0-9 ]",""); > 1 2 3 4
	
	③ String str = Arrays.toString(arr).replaceAll("[^0-9]",""); > 1234
*/
public class Way2 {
	
	public static String solution(int[] numbers) {
		String answer = "";
		
		String str = Arrays.toString(numbers).replaceAll("[^0-9 ]","");
		String[] newStr = str.split("\\s+");
		
		// split test
		for(int i = 0; i < newStr.length; i++) {
			System.out.println(newStr[i].charAt(0));
		}
		
		
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr1 = {6, 10, 2};			// return : "6210"
		int[] arr2 = {3, 30, 34, 5, 9};		// return : "9534330"
		int[] arr3 = {0, 0, 0, 0};			// return : "0000"
		String result1 = solution(arr1);
		System.out.println("result1 : " + result1);
		String result2 = solution(arr2);
		System.out.println("result2 : " + result2);
		String result3 = solution(arr3);
		System.out.println("result3 : " + result3);
	}
}

package practice;
//문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.


public class Prac07 {
	public static void main(String[] args) {
		   // 입력 배열 생성
        String[] arr = {"Hello", ", ", "world", "!"};

        // Solution 클래스의 인스턴스 생성
        Solution solution = new Solution();

        // Solution 클래스의 solution 메서드 호출하여 결과 출력
        String result = solution.solution(arr);
        System.out.println(result);
    }
}
	
	class Solution {
	    public String solution(String[] arr) {
	        String answer = "";
	        
	        for(int i = 0; i < arr.length; i++) {
	            answer += arr[i];
	        }
	        
	        return answer;
	    
	    }
	}
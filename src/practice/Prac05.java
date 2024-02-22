package practice;

import java.util.Scanner;

//문자열 my_string, overwrite_string과 정수 s가 주어집니다. 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
//문자열 overwrite_string으로 바꾼 문자열을 return 하는 함수를 작성해 주세요.
public class Prac05 {

	 public static String modifyString(String my_string, String overwrite_string, int s) {
	        String result = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
	        return result;
	    }

	    public static void main(String[] args) {
	        String my_string = "Hello World";
	        String overwrite_string = "Java";
	        int s = 6;

	        String modifiedString = modifyString(my_string, overwrite_string, s);
	        System.out.println(modifiedString);
	    }

}

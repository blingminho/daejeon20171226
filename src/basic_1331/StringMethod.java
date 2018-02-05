package basic_1331;
/**
 * String클래스 메서드
 * @author SangJun
 *
 */
public class StringMethod {
	public static void main(String[] args) {
		// char chatAt(int index) : 지정된 index방에 있는 문자를 리턴한다
		String s = "Hello";
		char c = s.charAt(2);
		System.out.println(c);
		
		// oracle에서도 사용되는 것들
		// 1. String concat(문자열 또는 문자형) : 문자열 뒤에 문자열 또는 문자형을 덧붙인다
		String s2 = s.concat(" Oracle");
		System.out.println(s2);
		
		// 2. boolean contains(문자열) : 지정된 문자열을 포함하고 있는지 확인한다
		System.out.println(s2.contains("llo"));
		
		// 확장자 처리에 유용한것
		// 1.  boolean endsWith(문자열) : 지정된 문자여로 끝나는지 판단
		System.out.println(s2.endsWith(".pdf"));
		
		// 그외
		// 1. int lastIndexOf() : 지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서 위치를 반환해준다
		// 							못찾으면 -1을 반환한다
		System.out.println(s2.lastIndexOf("o"));
		
		// 2. String replace() : 문자열중 새로운 문자로 전부다 변환
		String s3 = s2.replace("Oracle", "Java");
		System.out.println(s3);
		
		// 3. String[] split() : 문자열을 지정된 분리자로 나누어 문자열 배열에 담는다.
		String s4 = "100,200,300,400";
		String[] arrs4 = s4.split("0,");
		for (int i = 0; i < arrs4.length; i++) {
			System.out.println(arrs4[i]);
		}
		
		// 4. String subString() : 주어진 문자열을 시작부터 끝 위치(미포함) 범위에 포함된 문자열을 얻는다
		String s6 = "java_jungsuk3_연습문제_20160227.pdf";
		String s5 = s4.substring(3, 7);
		String s7 = s6.substring(0, s6.lastIndexOf("."));
		System.out.println(s5);
		System.out.println(s7);
		
		// 5. String trim() : 문자열 양끝의 공백을 제거한다
		String s8 = "      afsf   1242";
		String s9 = s8.trim();
		System.out.println(s9);
		String s10 = s9.replace(" ", "");
		System.out.println(s10);
		
		
		
		
		
		
	}
}

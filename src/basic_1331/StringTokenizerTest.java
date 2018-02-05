package basic_1331;

import java.util.StringTokenizer;
/**
 * StringTokenizer 연습
 * @author SangJun
 *
 */
public class StringTokenizerTest {
	public static void main(String[] args) {
		
		String source = "100,200,300,400,500";
		
		StringTokenizer st = new StringTokenizer(source, ",");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		System.out.println("=========data split==========");
		String data = "100,200,300,400";
		String[] result = data.split("0,");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		System.out.println("=========data token==========");
		// 빈문자열은 토큰으로 취급하지 않는다
		// 0도 구분자로 취급하고 ,도 구분자로 취급한다 => 여러개의 구분자를 사용가능하다
		
		StringTokenizer st2 = new StringTokenizer(data, "0,");
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}
	}
}

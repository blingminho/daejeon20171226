package basic_1401;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 정규식 이론
 * @author SangJun
 *
 */
public class RegEx01 {
	public static void main(String[] args) {
		/*
		 * 정규식이란?
		 * 	- 텍스트 데이터중에서 원하는 조건과 일치하는 일치하는 문자열을 찾아 내기 위해 사용하는 것
		 * 	- 정규식의 구성
		 * 		: Pattern이라는 클래스를 이용하여 정규식을 정의한다
		 * 		: Matcher클래스를 이용하여 정의된 Pattern과 비교한다
		 */
		
		// 패턴등록
		Pattern p = Pattern.compile("[a-z]*");// 영어 소문자가 하나도 없을수도 무한정 있을수도 있다
		
		// 패턴과 일치하는지 판단
		Matcher m = p.matcher("asdsadfsadf");
		System.out.println(m.matches());
		
		/*
		 * ^ 문자열의 시작
		 * $ 문자열의 종료
		 * . 임의의 한 문자, 단 \는 사용할 수 없다
		 * * 문자가 없을수도 무한정 있을수도 있다
		 * + 문자가 하나이상
		 * ? 앞문자가 없거나 하나
		 * [] 문자의 집합이나 범위를 나타내며 두 문자 사이는 - 기호로 범위를 나타낸다
		 * 		[^] []내에서 ^선행하여 존재하면 not을 의미한다
		 * {} 횟수 또는 반복범위를 나타낸다
		 * () 소괄호 안의 문자를 하나의 문자로 인식
		 * 	| 패턴안에서 or연산을 수행할 때 사용
		 * \s 공백문자
		 * \S 공백을 제외한 모든문자
		 * \w 알파벳이나 숫자
		 * \W 알파벳이나 숫자를 제외한 모든문자
		 * \d 숫자
		 * \D 숫자를 제외한 모든문자
		 * \ 정규표현식에서 확장문자(\\ -> '\', \. -> '.')
		 * (?i) 앞부분에 (?!)라는 옵션을 넣어주면 대소문자를 구분하지 않는다
		 * 
		 * ^[a-z]
		 * [A-Za-z] 영문자
		 * [0-9]{2} : 2번반복
		 * [0-9]{2,} : 2번이상
		 * [0-9]{2,5} : 2번에서 5번 반복가능
		 * [ㄱ-ㅎ 가-힣]* : 한글만 무제한반복가능
		 */
		
		// 정규식 연습
		String regEx1 = "[a-z]{2,3}";
		System.out.println(Pattern.matches(regEx1, "dfs"));// true
		System.out.println(Pattern.matches(regEx1, "dfss"));// false
		
		// 1. 영문자가 3회 반복 그다음에 숫자가 한개이상 존재여부를 판단하세요
		String regEx2 = "[A-Za-z]{3}[0-9]+";
		System.out.println(Pattern.matches(regEx2, "ABc123"));
		
		// 2. 핸드폰번호 LV1
		// 숫자3개-숫자4개-숫자4개
		String regEx3 = "[0-9]{3}-[0-9]{4}-[0-9]{4}";
		System.out.println(Pattern.matches(regEx3, "132-1234-1234"));
		
		// 3. 핸드폰번호 LV2
		/*
		 * 010-1~9숫자3개-숫자4개
		 * 011
		 * 016
		 * 017
		 * 018
		 * 019
		 */
		String regEx4 = "01[06789]-[1-9][0-9]{3}-[0-9]{4}";
		System.out.println(Pattern.matches(regEx4, "010-9234-1234"));
		
		// 4. 주민등록번호 LV3
		/*
		 * 숫자2개 0 1~9 0 1~9 - 1~4숫자6자리
		 * 		   1 0~2 1 0~9
		 * 				 2 0~9
		 * 				 3 0~1
		 */			
		String regEx5 = "\\d{2}(0\\d|1[0-2])(0[1-9]|[1-2]\\d|3[0-1])-[1-4]\\d{6}";
		System.out.println(Pattern.matches(regEx5, "931116-1423231"));
		
		
		// 5. 이메일 정규식 Final
		/*
		 * 시작은 영문자 이어야 한다
		 * 특수기호는 -_\. 4가지만 가능하다 여러개 일수도있고 없을수도 있다
		 * @이후는 영문자 또는 숫자가 1~5개 올수 있다
		 * '.'이 와야한다
		 * 영문자가 2개에서 3개 올수있다
		 * .kr 없을수도 있고 하나 있을수도 있다 
		 */
		
		String regEx6 = "^[a-zA-Z](\\w|[-_\\.])*@\\w{1,5}[.][a-zA-Z]{2,3}(.kr){0,1}";
		System.out.println(Pattern.matches(regEx6, "Tkdjun_-.\67@naver.com"));
		
		
		String text = "야이 개나리 십장생아... 이런 조카신발같은 경우를 봤나..";
		// String text = "야이 개** 십**아... 이런 조**같은 경우를 봤나..";
		System.out.println(filterText(text));
		
		
	}
		

	public static String filterText(String text){
		Pattern p = Pattern.compile("개나리|십장생|조카신발|병인신", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(text);
		
		StringBuffer sb = new StringBuffer();
		
		while(m.find()){
			m.appendReplacement(sb, maskWork(m.group()));
		}
		m.appendTail(sb);
		
		return sb.toString();
	}


	private static String maskWork(String group) {
		StringBuffer sb = new StringBuffer();
		char[] ch = group.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(i==0){
				sb.append(ch[i]);
			}else{
				sb.append("*");
			}
		}
		
		return sb.toString();
	}
}

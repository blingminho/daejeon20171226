package algolism;
/**
 * 프로그래머스 레벨3 - 시저암호
 * @author SangJun
 *
 */
/*
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
A를 3만큼 밀면 D가 되고 z를 1만큼 밀면 a가 됩니다. 공백은 수정하지 않습니다.
보낼 문자열 s와 얼마나 밀지 알려주는 n을 입력받아 암호문을 만드는 caesar 함수를 완성해 보세요.
“a B z”,4를 입력받았다면 “e F d”를 리턴합니다.
*/
class Caesar {
	String caesar(String s, int n) {
		String result = "";
		// 함수를 완성하세요.
		char[] c = s.toCharArray();
		int key = 0;
		int cNum = n;
		for(int i=0; i < c.length ; i++) {
			cNum += c[i];
			if(c[i]!=32) {
				key = ('A' <= c[i] && c[i] <= 'Z') ? 1 : 2;
				if(key == 1) {// 대문자
					while(cNum / 90 > 0 && cNum % 90 != 0)
						cNum = 64 + cNum % 90;
					c[i] = (char)cNum;
				}
				else {// 소문자
					while(cNum / 122 > 0 && cNum % 122 != 0)
						cNum = 96 + cNum % 122;
					c[i] = (char)cNum;
				}
			}
			result += c[i];
			cNum = n;
		}
		return result;
	}
	public static void main(String[] args) {
		Caesar c = new Caesar();
		//System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("iyaafqTDPJMv lf ShEfDgRvhpcOfNlxpqWPjkzbOMCCDAZT b", 35));
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("q", 35));
	}
}

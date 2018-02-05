package basic_1331;
/**
 * StringBuffer 연습1
 * @author SangJun
 *
 */
public class StringBufferTest01 {
	public static void main(String[] args) {
		/*
		 * String s = "a";
		 * s += "a";
		 * s += "a";
		 * s += "a";
		 * s += "a";
		 * 
		 * String s = "a";
		 * s = new StringBuffer(s).append("a").toString()
		 * 
		 * 
		 * 
		 */
		
		/*
		String s = "a";
		
		long start = System.currentTimeMillis();
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt.totalMemory());
		
		for(int i = 0; i < 300000; i++){
			s += "a";
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println(rt.totalMemory());
		*/
		
		
		StringBuilder sb = new StringBuilder("a");
		StringBuffer sb2 = new StringBuffer("a");
		long start = System.currentTimeMillis();
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt.totalMemory());
		
		for (int i = 0; i < 30000000; i++) {
			sb.append("a");
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println(rt.totalMemory());
		
	}
}

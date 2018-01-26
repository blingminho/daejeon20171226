package basic_1326;

import java.util.Vector;

/**
 * 매개변수의 다형성 연습
 * @author SangJun
 *
 */
public class ProductTest {
	public static void main(String[] args) {
		
		Tv t = new Tv("SmartTv", 300);
		Computer c = new Computer("i7", 150);
		NoteBook nb = new NoteBook("gram", 200);
		
		
		Buyer b = new Buyer("정은채", 10000);
		b.buy(t);// override한 toString()이 호출된다
		b.buy(c);
		
		System.out.println(b.item);
		System.out.println(b.money);
		System.out.println(b.bonusPoint);
		
		System.out.println("==================================================");
		Vector<Buyer> vBuyer = new Vector<>();
		vBuyer.add(new Buyer("김상준1",100000));
		vBuyer.add(new Buyer("김상준2",200000));
		vBuyer.add(new Buyer("김상준3",300000));
		vBuyer.add(new Buyer("김상준4",400000));
		
		
		Buyer b1 = vBuyer.get(0);
		b1.buy(c);
		b1.buy(t);
		
		
		
		
		for(int i = 0; i < vBuyer.size(); i++){
			Buyer tmp = vBuyer.get(i);
			tmp.refund(c);
		}
		
		for(int i = 0; i < vBuyer.size(); i++){
			Buyer tmp = vBuyer.get(i);
			System.out.println("------------");
			tmp.summary();
		}
		
		
	}
}

class Product{
	private String name;
	int price;
	int bonusPoint;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
		bonusPoint = price/10;
	}
}

class NoteBook extends Product{
	public NoteBook(String name, int price){
		super(name, price);
	}

	@Override
	public String toString() {
		return "NoteBook";
	}	
}

class Tv extends Product{
	public Tv(String name, int price){
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "Tv";
	}	
}

class Computer extends Product{
	public Computer(String name, int price){
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}	
}

class Buyer{
	
	String name;
	int money;
	int bonusPoint;
	//Vector item = new Vector();// object로 받음(제네릭이 없으므로!)
	Vector<Product> item = new Vector<>();// Product로 받음(제네릭이 없으므로!)
	
	
	
	public Buyer(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("대출받으시겠습니까??");
			return;
		}else{
			money -= p.price;
			bonusPoint += p.bonusPoint;
			item.add(p);
			
			System.out.println(p + "를 구입하셨습니다");
		}
	}
	
	// 1. refund()
	void refund(Product p){
		if(!item.contains(p)){
			System.out.println("구매한 것이 없어 환불할 수 없습니다.");
			return;
		}else{
			bonusPoint -= p.bonusPoint;
			money += p.price;
			item.remove(p);
			System.out.println(p + "가 환불되었습니다");			
		}
		
	}
	
	// 2. summary()
	void summary(){
		System.out.println("구매목록");
		int sum = 0;
		for(int i = 0; i < item.size(); i++){
			System.out.println(item.get(i) + "	" + item.get(i).price);
			sum += item.get(i).price;
		}
		System.out.println("구매 총 금액 : " + sum);
		System.out.println("남은 돈 : " + (money - sum));
		System.out.println("보너스포인트 : " + bonusPoint);
		System.out.println(name + "고객님 감사합니다");
	}
	// 구매 목록
	// i7		금액
	// SmartTv	금액
	// 구매 총금액 금액
	// 남은돈
	// 보너스포인트
	// xxx고객님 감사합니다
	
	// 고객을 여러명 관리(저장 및 관리)
}





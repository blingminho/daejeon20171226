package basic_1402;

import java.util.Queue;
/**
 * Collection Framework<br>
 * List<br>
 * Iterator, ListIterator<br>
 * HashSet<br>
 * HashMap<br>
 * @author SangJun
 *
 */
public class CollectionBasic {
	public static void main(String[] args) {
		/*
		 * 1. Collection Framework
		 * 		1) 의미
		 * 		- collection은 다수의 데이터(데이터 그룹)를, Framework은 표준화된 프로그래밍 방식을 의미한다
		 * 		2) 핵심 interface
		 * 		- List
		 * 			: 순서가 있다
		 * 			: 데이터의 중복을 허용한다
		 * 			: 대기자 명단
		 * 			: ArrayList, Stack, Vector, LinkedList등...
		 * 		- Set
		 * 			: 순서가 없다
		 * 			: 데이터의 중복을 비허용한다
		 * 			: 집합
		 * 			: HashSet, TreeSet
		 * 		- Map
		 * 			: 키와 값으로 이루어져 있다
		 * 			: 순서가 없다
		 * 			: 키의 경우는 중복을 허용하지 않는다. 값의 경우는 중복을 허용한다
		 * 			: 우편번호, 지역번호
		 * 			: HashTable, HashMap, TreeMap, Properties
		 * 
		 * 	2. List
		 * 		- Vector와 ArrayList
		 * 		: Vector 동기화를 보장한다
		 * 		: Object배열을 이용해서 데이터를 순차적으로 저장한다
		 * 		: 배열이 커져서 기존 배열크기로 안될때 새로운 배열을 만들어 배열을 복사하게 된다
		 * 		
		 * 		- LinkedList
		 * 		: 배열의 단점을 보완하기 위해 만들어짐
		 * 		: 자신과 연결된 다음 요소에 대한 주소값과 데이터로 구성되어 있다
		 * 		
		 * 		- DoubleLinkedList
		 * 		: 머리와 꼬리가 존재
		 * 		: 이전요소와 다음요소의 주소값과 데이터로 구성되어 잇다
		 * 	
		 * 		- Stack과 Queue
		 * 		: Stack(LIFO)
		 * 			저장 : push()
		 * 			추출 : pop()
		 * 			가장 위의 객체를 반환 : peek()
		 * 			주어진 객체를 찾기 : search()
		 * 		: Queue(FIFO)
		 * 			저장 : offer()
		 * 			추출 : poll()
		 * 
		 * 	3. Iterator, ListIterator
		 * 		- Iterater
		 * 		: 컬렉션에 저장된 요소를 읽어오는 방법
		 * 	
		 * 	4. HashSet
		 * 		- Set인터페이스를 구현한 가장 대표적인 컬렉션
		 * 		- add메서드난 addAll메서드를 사용하는데 이미 저장된 요소가 있다면
		 * 			중복등록에 실패하게 된다
		 * 		- HashSet은 내부적으로 HashMap을 이용해 만들어 졌다
		 * 
		 *  5. HashMap
		 *  	- HashTable의 최신버전이 HashMap임으로 HashMap을 사용하자
		 *  	- Map의 특징인 키(Key)와 값(Value)을 묶어 하나의 데이터로 저장한다
		 *  	- Map<Object,Object>타입 이지만 일반적으로 key의 경우 String으로 통일해서 사용한다
		 *  	- key의 경우 유일해야 한다
		 * 
		 */
	}
}

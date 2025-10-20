package com.eottabom.effectivejava.chapter01.item01._03;

public class GreetingFactory {

	// 인터페이스 타입을 선언할 수 있다.
	// 인터페이스의 구현체로 리턴 타입을 바꿀 수가 있다.
	// 또는 인터페이스가 클래스를 선언해 놓고, 해당 클래스의 하위 클래스를 리턴할 수도 있다.
	// 이렇게 되면 유연함이 생기고, 고정적이지가 않다는 것이다.
	// 그러면서 네번째 장점인, 매개변수에 따라서 각기 다른 인스턴스를 리턴할 수 있다는 것이다.
	public static GreetingService of(String lang) {
		if (lang.equals("ko")) {
			return new KoreanGreetingService();
		}
		else {
			return new EnglishGreetingService();
		}
	}

}

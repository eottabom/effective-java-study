package com.eottabom.effectivejava.chapter01.item01._03;

public interface GreetingService {

	String greeting();

	// Java 8 이전에는 위와 같은 static 한 메서드를 인터페이스에 선언할 수 가 없었다.
	// 인터페이스 안에서는 접근지정자를 아무것도 지정하지 않으면 public 으로 간주한다. (그래서 생략가능)
	// 클래스에서는 아무것도 붙이지 않으면 package private level 로 간주함.
	static GreetingService of(String lang) {
		if (lang.equals("ko")) {
			return new KoreanGreetingService();
		}
		else {
			return new EnglishGreetingService();
		}
	}
	// 따라서, public static 메서드를 가진 Factory 클래스들을 따로 만들지 않아도 된다는 것이다.
	// Remove GreetingFactory class

	// 다섯번째 장점. 정적팩토리 메서드가 있는 시점에 굳이 구현체가 없어도 된다.
	// 이런 말을 하면서 서비스 제공자 프레임워크 이런말이 있는데...

	// 간단하게 설명하면, 구현체가 없고 인터페인스만 있다고 생각하면,
}

package com.eottabom.effectivejava.chapter01.item01._05;

public interface GreetingService {

	// 다섯번째 장점. 정적팩토리 메서드가 있는 시점에 굳이 구현체가 없어도 된다.
	// 이런 말을 하면서 서비스 제공자 프레임워크 이런말이 있는데...

	// 간단하게 설명하면, 구현체가 없고 인터페인스만 있다.
	String greeting();

}

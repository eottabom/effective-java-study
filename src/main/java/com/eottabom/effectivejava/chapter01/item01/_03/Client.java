package com.eottabom.effectivejava.chapter01.item01._03;

public class Client {

	public static void main(String[] args) {
		// GreetingFactory 를 거쳐서 어떤 인스턴스를 가져오던 타입이 인터페이스 타입이 된다.
		// 클라이언트 코드로부터 인터페이스 기반의 프레임워크를 사용하도록 강제할 수 있다는 것이다.
		// 구체적인 타입을 숨길 수도 있다.
		GreetingService ko = GreetingFactory.of("ko");

		GreetingService.of("eng"); // 이런식으로 바로 쓸 수 있다.
	}

}

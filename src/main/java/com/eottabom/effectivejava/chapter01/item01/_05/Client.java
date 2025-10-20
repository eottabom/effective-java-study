package com.eottabom.effectivejava.chapter01.item01._05;

import java.util.Optional;
import java.util.ServiceLoader;

public class Client {

	public static void main(String[] args) {
		// 자바에서 기본적으로 제공해주는 ServiceLoader 라는 정적 팩토리 메서드가 있는데,
		// GreetingService 를 가져올 수 있고,
		// 여기서 ServiceLoader 는 Iterable 을 구현하고 있고, 여러개의 서비스가 있을 수 있어서, Iterable 타입으로 가져온다.
		// GreetingService 의 구현체를 다 가져온다.
		// 이렇게하면 외부에서 정의한 라이브러리의 GreetingService 의존성을 가지고 있지 않다.
		// 이 코드는 어떤 구현체가 올지 모르지만, 나는 인터페이스 기반으로 코딩을 한 것이다.
		// 이것은 굉장한 유연성을 준다.
		ServiceLoader<GreetingService> loader = ServiceLoader.load(GreetingService.class);

		// 없을 수도 있어서 Optional 로~
		Optional<GreetingService> greetingService = loader.findFirst();
		greetingService.ifPresent((g) -> {
			System.out.println(g.greeting());
		});

	}

}

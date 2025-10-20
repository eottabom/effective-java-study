package com.eottabom.effectivejava.chapter01.item01._02;

public class Main {

	public static void main(String[] args) {
		UserPreferences userPreferences1 = UserPreferences.getInstance();
		UserPreferences userPreferences2 = UserPreferences.getInstance();

		System.out.println(userPreferences1);
		System.out.println(userPreferences2);

		// 생성자를 private 으로 만들면 외부에서는 인스턴스를 만들 수 없다.
//		UserPreferences userPreferences = new UserPreferences();

		// Boolean 같은 경우는 valueOf 가 있는데, 미리 만들어 둔 것 중에서 매개변수를 가지고 판단한다.
		// 정적 팩토리 메서드를 사용하면 매개변수에 따라 각기 다른 인스턴스를 return 하는 기능도 만들 수 있게 된다.
		Boolean.valueOf(false);

		// 책에서 언급.
		// flyweight 패턴은 우리가 자주 사용하는 인스턴스들을 미리 생성하고, 캐시에 넣어놓고 거기서 꺼내다 쓰는 형식의 디자인 패턴이다.
		// 이런식으로 인스턴스를 통제하는 방법이므로, 언급이 된 것.
	}

}

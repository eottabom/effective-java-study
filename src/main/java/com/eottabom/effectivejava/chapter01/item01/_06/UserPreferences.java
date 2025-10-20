package com.eottabom.effectivejava.chapter01.item01._06;

import com.eottabom.effectivejava.chapter01.item01._02.FontSize;
import com.eottabom.effectivejava.chapter01.item01._02.Language;

/**
 * 이 클래스의 인스턴스는 #getInstance()를 통해 사용한다. 전역 사용자 환경설정 (다크모드, 알림, 언어, 글꼴 크기 등)
 *
 * @see #getInstance()
 */
public class UserPreferences {

	private boolean darkMode; // 다크모드 사용 여부

	private boolean pushEnabled; // 푸시 알림 사용 여부

	private Language language; // 사용 언어

	private FontSize fontSize; // 글꼴 크기

	// STEP 2) 미리 인스턴스를 만들어 둔다.
	private static final UserPreferences INSTANCE = new UserPreferences();

	// STEP 1) 우선 생성자를 private 으로 만들어준다.
	// private 을 한다는 것은 이 객체 내부에서 컨트롤을 하겠다는 것.
	private UserPreferences() {
		// 기본값
		this.darkMode = false;
		this.pushEnabled = true;
		this.language = Language.KOREAN;
		this.fontSize = FontSize.MEDIUM;
	}

	// STEP 3) 정적 팩토리 메서드를 제공한다.
	// 이렇게 하면 해시코드가 동일하게 나온다.
	// 생성자로는 결코 하지 못하는 일을 정적 팩토리 메서드로는 통제를 할 수 있다는 것
	public static UserPreferences getInstance() {
		return INSTANCE;
	}

	public boolean isDarkMode() {
		return darkMode;
	}

	public void setDarkMode(boolean darkMode) {
		this.darkMode = darkMode;
	}

	public boolean isPushEnabled() {
		return pushEnabled;
	}

	public void setPushEnabled(boolean pushEnabled) {
		this.pushEnabled = pushEnabled;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public FontSize getFontSize() {
		return fontSize;
	}

	public void setFontSize(FontSize fontSize) {
		this.fontSize = fontSize;
	}

	public static void main(String[] args) {
		// toString 을 오버라이딩하지 않으면 해시코드가 다른걸 확인 할 수 있는데,
		// 매번 다른 인스턴스가 생성된 것을 알 수 있다.
		System.out.println(new UserPreferences());
		System.out.println(new UserPreferences());
		System.out.println(new UserPreferences());
		// 경우에 딸서는 어떤 인스턴스를 매번 만들지, 특정한 경우메만 만들지 통제할 수가 있다.
		// 생성자가 있으면 통제가 불가능하다.
	}

}

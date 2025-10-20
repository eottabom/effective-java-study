package com.eottabom.effectivejava.chapter01.item01._06;

import java.util.prefs.Preferences;

import com.eottabom.effectivejava.chapter01.item01._02.UserPreferences;

// 이렇게 상속을 못한다는 것이다.
//public class AdminPreferences extends Preferences {

public class AdminPreferences {

	// 대신 우회할 수 있는 방법이 있는데,
	// delegation 해서 가지고 있고, 값을 변경하게 할 수는 있다.
	UserPreferences userPreferences;

}

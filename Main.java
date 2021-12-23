package com.gmail.kutepov89.sergey;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

		final Class<?> cls = Reflection.class;

		Method[] methods = cls.getMethods();

		for (Method method : methods) {
			if (method.isAnnotationPresent(Test.class)) {
				// System.out.println(method.getName()); // test
				// System.out.println(myAn.a()); // 2
				// System.out.println(myAn.b()); // 5
				Test myAn = method.getAnnotation(Test.class);
				Reflection rf = new Reflection();
				rf.test(myAn.a(), myAn.b());
			}
		}

	}

}

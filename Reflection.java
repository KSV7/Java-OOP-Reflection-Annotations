package com.gmail.kutepov89.sergey;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface Test {
	int a();

	int b();
}

public class Reflection {

	@Test(a = 2, b = 5)
	public void test(int a, int b) {
	}

}
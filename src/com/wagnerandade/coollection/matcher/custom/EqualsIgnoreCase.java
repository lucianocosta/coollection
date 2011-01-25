package com.wagnerandade.coollection.matcher.custom;

import com.wagnerandade.coollection.matcher.Matcher;

public class EqualsIgnoreCase implements Matcher {

	private final Object value;

	public EqualsIgnoreCase(Object value) {
		this.value = value;
	}

	@Override
	public boolean match(Object anotherValue) {
		return ((String) value).equalsIgnoreCase((String) anotherValue);
	}

}

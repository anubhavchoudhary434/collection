package com.luv4krsna.collection;

import java.util.HashMap;
import java.util.Map;

public class PersonMapImpl {

	public static void main(String[] args) {
		Map<String, PersonHashCode> map = new HashMap<>();

		map.put("Adam", new PersonHashCode("Kevin", 23));

	}

}

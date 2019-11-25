package com.edureka.ms.training.mstraining.lombok.demo;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

	@Test
	public void testLombok() {
		Person person = new Person();
		person.setName("Amr");
		person.setAge(33);
		
		Assert.assertEquals((Integer) 33, person.getAge());
	}

	@Test
	public void testToString() {
		Person person = new Person();
		person.setName("Amr");
		person.setAddress("Egypt");
		person.setAge(33);
		System.out.println(person.toString());
	}
	
	@Test
	public void testBuilder() {
		Person person = Person.builder().name("Ali").address("Egypt").age(63).build();
		System.out.println(person.toString());
	}
}

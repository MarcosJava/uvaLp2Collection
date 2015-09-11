package br.com.mrcsfelipe.collections.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.mrcsfelipe.collections.model.Person;

public class ListTest {
	
	
	private List<Person> persons = new ArrayList<>();
	
	@Before
	public void addElementos(){
		
		
		Person p1 = new Person("Joao");
		Person p2 = new Person("Maria");
		Person p3 = new Person("Zé");
		Person p4 = new Person("José");
		Person p5 = new Person("Antonio");
		
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		
	}
	
	@Test
	public void ordernacao(){
		
		List<Person> expected = 
				Arrays.asList(new Person("Antonio"),
							  new Person("Joao"),
							  new Person("José"),
							  new Person("Maria"),
							  new Person("Zé"));
		
		Collections.sort(persons, Person.StuNameComparator);
		
		for (Person person : persons) {
			System.out.println(person.getName());
		}
		
		assertEquals(expected, persons);
		
	}

}

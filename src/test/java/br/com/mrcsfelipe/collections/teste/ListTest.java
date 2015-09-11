package br.com.mrcsfelipe.collections.teste;

import java.util.ArrayList;
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
		Person p3 = new Person("Z�");
		Person p4 = new Person("Jos�");
		Person p5 = new Person("Antonio");
		
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		
	}
	
	@Test
	public void ordernacao(){
		Collections.sort(persons);
	}

}

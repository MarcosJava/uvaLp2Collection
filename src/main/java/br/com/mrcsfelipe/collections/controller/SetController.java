package br.com.mrcsfelipe.collections.controller;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import br.com.mrcsfelipe.collections.model.Person;

@ManagedBean
@ViewScoped
public class SetController {
	

	private Set<String> palavras = new HashSet<>();
	
	@Named
	@Produces
	private Person person;
	
	@PostConstruct
	public void init(){
		person = new Person();
	}
	
	public void registro(){
		
		System.out.println("O nome  é : " + this.person.getName());
		this.palavras.add(person.getName());
		
		person = new Person();
	}

	public Set<String> getPalavras() {
		return palavras;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
}

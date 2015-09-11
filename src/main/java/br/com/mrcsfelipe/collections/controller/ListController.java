package br.com.mrcsfelipe.collections.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import br.com.mrcsfelipe.collections.model.Person;

@ManagedBean
@ViewScoped
public class ListController {
	
	private List<String> palavras = new ArrayList<>();
	
	
	@Named
	@Produces
	private Person person;
	
	@PostConstruct
	public void init(){
		person = new Person();
	}
	
	public void registro(){
		this.palavras.add(this.person.getName());
	}
	
	
	public void ordernarLista(){
		Collections.sort(palavras);
	}
	
	
	public List<String> getPalavras() {
		return palavras;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	

}

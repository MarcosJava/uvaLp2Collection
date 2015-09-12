package br.com.mrcsfelipe.collections.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import br.com.mrcsfelipe.collections.model.Person;

@ManagedBean
@ViewScoped
public class MapController {

	private Map<String, String> mapList = new HashMap<>();
	
	@Named
	private Person person;
	
	
	public void gerente(){
		this.mapList.put("gerente", this.person.getName());
	}
	
	public void coordenador(){
		this.mapList.put("coordenador", this.person.getName());
	}

	public Map<String, String> getMapList() {
		return mapList;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
	
	
	
	
}

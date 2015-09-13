package br.com.mrcsfelipe.collections.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import br.com.mrcsfelipe.collections.model.Person;

@ManagedBean
@ViewScoped
public class MapController {

	private Map<String, String> mapList = new HashMap<>();
	private List<Entry<String, String>> entries;

	
	@Named
	private Person person;
	
	@PostConstruct
	public void init(){
		this.person = new Person();
	}
	
	public void postResponse(){
		entries = new ArrayList<>(mapList.entrySet());
		this.person = new Person();
	}
	
	public void gerente(){
		this.mapList.put("gerente", this.person.getName());
		postResponse();
		
	}
	
	public void coordenador(){
		this.mapList.put("coordenador", this.person.getName());
		postResponse();
	}
	

	public List<Entry<String, String>> getEntries() {
		return entries;
	}

	public Map<String, String> getMapList() {
		return mapList;
	}

	public String getGerentes(){
		return this.mapList.get("gerente");
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
	
	
	
	
}

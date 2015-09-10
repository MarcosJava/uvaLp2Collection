package br.com.mrcsfelipe.collections.controller;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Model
public class SetController {
	

	private Set<String> palavras;
	private String palavra;
	
	@Inject
	private FacesContext facesContext;
	
	
	
	@PostConstruct
	public void init(){
		palavras = new HashSet<>();
	}
	
	
	public void registro() throws Exception{
		this.palavras.add(this.palavra);
	}


	public String getPalavra() {
		return palavra;
	}


	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}


	public Set<String> getPalavras() {
		return palavras;
	}
	
	
	
}

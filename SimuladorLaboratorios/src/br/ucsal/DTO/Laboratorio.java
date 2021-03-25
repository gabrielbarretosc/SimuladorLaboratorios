package br.ucsal.DTO;

import java.util.List;

public class Laboratorio {

	private int id;
	private String nome;
	private List<Acessorio> acessorios;
	private List<Computador> computadores;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Acessorio> getAcessorios() {
		return acessorios;
	}
	public void setAcessorios(List<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}
	public List<Computador> getComputadores() {
		return computadores;
	}
	public void setComputadores(List<Computador> computadores) {
		this.computadores = computadores;
	}
	
	
}

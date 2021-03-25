package br.ucsal.DTO;

public class Computador {
	private int id;
	private String nomeComputador;
	private int voltagemMonitor;
	private int voltagemGabinete;
	private int voltagem;
	private boolean estado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeComputador() {
		return nomeComputador;
	}
	public void setNomeComputador(String nomeComputador) {
		this.nomeComputador = nomeComputador;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public int getVoltagemMonitor() {
		return voltagemMonitor;
	}
	public void setVoltagemMonitor(int voltagemMonitor) {
		this.voltagemMonitor = voltagemMonitor;
	}
	public int getVoltagemGabinete() {
		return voltagemGabinete;
	}
	public void setVoltagemGabinete(int voltagemGabinete) {
		this.voltagemGabinete = voltagemGabinete;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}

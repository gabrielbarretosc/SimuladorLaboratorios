package br.ucsal.BLL;


import java.util.ArrayList;
import java.util.List;

import br.ucsal.DTO.Acessorio;
import br.ucsal.DTO.Computador;
import br.ucsal.DTO.Laboratorio;
import br.ucsal.DTO.ParamComputadores;
import br.ucsal.DTO.ParamLaboratorio;

public class LaboratorioBLL {

	@SuppressWarnings("unused")
	private void Validar(Laboratorio laboratorio) throws Exception {
		
		Exception ex = new Exception();
		
		if(laboratorio.getNome() == null) {
			throw ex;
		}
		
		if(laboratorio.getAcessorios().isEmpty()) {
			throw ex;
		}
	}
	
	@SuppressWarnings("unused")
	private void Persistir(ParamLaboratorio paramLab) {
		int numeroDeLaboratios = paramLab.getNumLabs();
		List<Computador> computadoresList = new ArrayList<>();
		List<Acessorio> acessoriosList = new ArrayList<>();
		
		for (Integer i = 0; i < numeroDeLaboratios; i++) {
				Laboratorio laboratorio = new Laboratorio();
				laboratorio.setNome(i.toString());
				// Quantos computadores no laboratório?
				int numeroDeComputadores = 10;
		for (Integer j = 0; j < numeroDeComputadores; j++) {
				Computador computador = new Computador();
				computador.setNomeComputador("DESKTOP " + j.toString());
				computadoresList.add(computador); 
		}
				laboratorio.setComputadores(computadoresList);
				
				// Existe Projetor??
				//if(flag projetor = true)
				Acessorio acessorio = new Acessorio();
				acessorio.setDescricao("Projetor");
				acessorio.setVoltagem(40);
				acessoriosList.add(acessorio);
				
				Acessorio acessorio2 = new Acessorio();
				
				//if(flag arcondicionado = true)
				// Existe ar condicionado?
				acessorio2.setDescricao("Ar Condicionado");
				acessorio2.setVoltagem(70);
				acessoriosList.add(acessorio2);
				
				laboratorio.setAcessorios(acessoriosList);
				
				// PERSISTIR
	}
}
	
	@SuppressWarnings("unused")
	private void Excluir(Laboratorio laboratorio) {
		
	}
	
	@SuppressWarnings("unused")
	private void Listar() {
		
	}
	
	private void ContaDoDia() {
		//List<Laboratorio> listaDeLaboratorios = Listar();
		//objetoparaDia = new ObjetoParaDia(); 
		// o que tem nesse objeto? NOME DO COMPUTADOR e SUAS VOLTAGEM DIARIA E O DIA
		foreach(Laboratorio lab : listaDeLaboratorios){
			foreach(Computador comp : lab.getComputadores()){
				voltagemDiaGabinete = comp.getVoltagemGabinete() * qtdHrLigada;
				voltagemMonitor = comp.getVoltagemMonitor() * qtdHrLigada;
				voltagemTotal = voltagemGabinete + voltagemMonitor;
			}
		}
		
	}
	
	
}

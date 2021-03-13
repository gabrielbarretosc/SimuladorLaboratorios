package br.ucsal.BLL;

import br.ucsal.DTO.Laboratorio;

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
	private void Persistir(Laboratorio laboratorio) {
		// id diferente de 0 = editar
	}
	
	@SuppressWarnings("unused")
	private void Excluir(Laboratorio laboratorio) {
		
	}
	
	@SuppressWarnings("unused")
	private void Listar() {
		
	}
	
	
	
}

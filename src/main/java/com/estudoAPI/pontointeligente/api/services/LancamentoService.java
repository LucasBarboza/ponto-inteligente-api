package com.estudoAPI.pontointeligente.api.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

import com.estudoAPI.pontointeligente.api.entities.Lancamento;

@Transactional(readOnly = true)
public interface LancamentoService {
	
	/**
	 * Realiza a consulta por funcionário através do ID, o retorno é paginado.
	 * 
	 * @param funcionarioID
	 * @param pageRequest
	 * @return Page<Lancamentos>
	 */
	Page<Lancamento> buscarPorFuncionarioId(Long funcionarioID, PageRequest pageRequest);
	
	/**
	 * 
	 * Realiza a consulta por funcionário através do ID
	 * @param id
	 * @return Optional<Lancamentos>
	 */
	Optional<Lancamento> buscaPorId(Long id);
	
	/**
	 * 
	 * Realiza a persistência de um objeto Lançamento
	 * @param lancamento
	 * @return lancamento
	 */
	Lancamento persistir(Lancamento lancamento);
	
	/**
	 * 
	 * Realiza a remoção de um objeto Lançamento
	 * @param id
	 * @return lancamento
	 */
	void remover(Long id);
	
}

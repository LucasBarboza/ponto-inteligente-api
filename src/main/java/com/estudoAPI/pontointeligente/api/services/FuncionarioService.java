package com.estudoAPI.pontointeligente.api.services;

import java.util.Optional;

import com.estudoAPI.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {
	
	/**
	 * Persiste um funcionário na base de dados
	 * 
	 * @param funcionario
	 * @return funcionario
	 */
	Funcionario persistir(Funcionario funcionario);
	
	/**
	 * Busca um funcionário por CPF
	 * 
	 * @param funcionario
	 * @return funcionario
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	/**
	 * Busca um funcionário por email
	 * 
	 * @param funcionario
	 * @return funcionario
	 */
	Optional<Funcionario> buscarPorEmail(String email);
	
	/**
	 * Busca um funcionário por id
	 * 
	 * @param funcionario
	 * @return funcionario
	 */
	Optional<Funcionario> buscarPorId(Long id);
	
}

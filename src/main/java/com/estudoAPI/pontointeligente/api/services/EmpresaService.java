package com.estudoAPI.pontointeligente.api.services;

import java.util.Optional;

import com.estudoAPI.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	/**
	 * Retorna uma empresa dado um CNPJ
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 * 
	 * */
	Optional<Empresa> buscarPorCnpj(String cnpj);	
	
	/**
	 * Cadastro uma nova empresa dado um CNPJ
	 * 
	 * @param empresa
	 * @return Empresa
	 * 
	 * */
	Empresa persistir(Empresa empresa);	
}

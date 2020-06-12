package com.estudoAPI.pontointeligente.api.services.impl;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.estudoAPI.pontointeligente.api.entities.Lancamento;
import com.estudoAPI.pontointeligente.api.repositories.LancamentoRepository;
import com.estudoAPI.pontointeligente.api.services.LancamentoService;

@Service
public class LancamentoServiceImpl implements LancamentoService{
	
	private static final Logger log = LoggerFactory.getLogger(LancamentoServiceImpl.class);
	
	@Autowired
	LancamentoRepository lancamentoRepository;

	@Override
	public Page<Lancamento> buscarPorFuncionarioId(Long funcionarioID, PageRequest pageRequest) {
		log.info("Buscando lançamento pelo ID paginado{}",funcionarioID);
		return this.lancamentoRepository.findByFuncionarioId(funcionarioID, pageRequest);
	}

	@Override
	public Optional<Lancamento> buscaPorId(Long id) {
		log.info("Buscando lançamento pelo ID {}",id);
		return Optional.ofNullable(this.lancamentoRepository.findById(id).get());
	}

	@Override
	public Lancamento persistir(Lancamento lancamento) {
		log.info("Persistindo lançamento{}",lancamento);
		return this.lancamentoRepository.save(lancamento);
	}

	@Override
	public void remover(Long id) {
		log.info("Removendo lançamento com id {}",id);
		this.lancamentoRepository.deleteById(id);
	}
	
}

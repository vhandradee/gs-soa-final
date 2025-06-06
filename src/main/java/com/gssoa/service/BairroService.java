package com.gssoa.service;

import com.gssoa.dto.BairroDTO;
import com.gssoa.model.Bairro;
import com.gssoa.repository.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BairroService {
    @Autowired
    private BairroRepository repository;

    public List<Bairro> listarTodos() {
        return repository.findAll();
    }

    public Bairro salvar(BairroDTO dto) {
        Bairro b = new Bairro();
        b.setNome(dto.getNome());
        b.setTempoEstimado(dto.getTempoEstimado());
        return repository.save(b);
    }

    public Bairro atualizar(Long id, BairroDTO dto) {
        Bairro b = repository.findById(id).orElseThrow();
        b.setNome(dto.getNome());
        b.setTempoEstimado(dto.getTempoEstimado());
        return repository.save(b);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
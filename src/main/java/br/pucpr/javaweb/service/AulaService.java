package br.pucpr.javaweb.service;

import br.pucpr.javaweb.model.Aula;
import br.pucpr.javaweb.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AulaService {

    @Autowired
    private AulaRepository aulaRepository;

    public Aula salvar(Aula aula){

        if(Objects.nonNull(aula.getId())){
            throw new RuntimeException("Erro");
        }
        return aulaRepository.save(aula);
    }


    public Aula consultarAula(Long id){
        return aulaRepository.findById(id).get();
    }

    public List<Aula> listar(){
        return aulaRepository.findAll();
    }

    public void deletarPorId(Long id){
        aulaRepository.deleteById(id);
    }








}

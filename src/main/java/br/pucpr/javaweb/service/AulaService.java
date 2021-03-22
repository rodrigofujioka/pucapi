package br.pucpr.javaweb.service;

import br.pucpr.javaweb.exceptions.EntityAulaException;
import br.pucpr.javaweb.model.Aula;
import br.pucpr.javaweb.model.dto.AulaDto;
import br.pucpr.javaweb.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AulaService {

    @Autowired
    private AulaRepository aulaRepository;

    public AulaDto salvar(Aula aula){

        if(Objects.nonNull(aula.getId())){
            throw new EntityAulaException("Aula", "Não foi possível salvar aula", null);
        }

        return  new AulaDto(aulaRepository.save(aula));
    }


    public AulaDto consultarAula(Long id){
        AulaDto aulaDto = new AulaDto(
                            aulaRepository.findById(id).orElseThrow(
                                    () -> new EntityAulaException("Aula", "Não existe aula para esse ID", id.toString())));

        return aulaDto;
    }

    public List<Aula> listar(){
        return aulaRepository.findAll();
    }

    public void deletarPorId(Long id){
        aulaRepository.deleteById(id);
    }








}

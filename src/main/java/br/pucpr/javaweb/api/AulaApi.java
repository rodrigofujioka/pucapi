package br.pucpr.javaweb.api;

import br.pucpr.javaweb.model.Aula;
import br.pucpr.javaweb.repository.AulaRepository;
import br.pucpr.javaweb.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api")  //localhost:8080/api/aula
public class AulaApi {

    @Autowired
    private AulaService aulaService ;

    @PostMapping("/aula")
    public ResponseEntity<Aula> salvar(@RequestBody Aula aula){

        return ResponseEntity.ok(aulaService.salvar(aula));

    }


    @GetMapping("/aula/{id}")   //localhost:8080/api/1
    public Aula getAula(@PathVariable("id") Long id, HttpServletRequest request){

        return aulaService.consultarAula(id);
    }

    @DeleteMapping("/aula/{id}")   //localhost:8080/api/1
    public void delete(@PathVariable("id") Long id){
        aulaService.deletarPorId(id);
    }

    @GetMapping("/aula")
    public List<Aula> getAulas(){
        return aulaService.listar();
    }

}

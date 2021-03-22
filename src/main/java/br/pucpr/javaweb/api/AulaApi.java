package br.pucpr.javaweb.api;

import br.pucpr.javaweb.model.Aula;
import br.pucpr.javaweb.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api")  //localhost:8080/api/aula
public class AulaApi {

    @Autowired
    private AulaRepository aulaRepository ;

    @PostMapping("/aula")
    public ResponseEntity<Aula> salvar(@RequestBody Aula aula){
        return ResponseEntity.ok(aulaRepository.save(aula));
    }


    @GetMapping("/aula/{id}")   //localhost:8080/api/1
    public Aula getAula(@PathVariable("id") Long id, HttpServletRequest request){

        return aulaRepository.findById(id).get();
    }

    @DeleteMapping("/aula/{id}")   //localhost:8080/api/1
    public void delete(@PathVariable("id") Long id){
       aulaRepository.deleteById(id);
    }

    @GetMapping("/aula")
    public List<Aula> getAulas(){
        return aulaRepository.findAll();
    }

}

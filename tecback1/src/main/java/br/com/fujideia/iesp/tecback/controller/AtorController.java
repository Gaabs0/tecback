package br.com.fujideia.iesp.tecback.controller;


import br.com.fujideia.iesp.tecback.model.Ator;
import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.repository.AtorRepository;
import br.com.fujideia.iesp.tecback.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class AtorController {


    @Autowired
    private AtorRepository atorRepository;


    @GetMapping
    public List<Ator> listartodos(){return atorRepository.findAll ();}



    @GetMapping("/{id}")
    public ResponseEntity<Ator> buscaporid(@PathVariable Long id) {
        Optional<Ator> ator = atorRepository.findById(id);
        if (ator.isPresent())  {
            return ResponseEntity.ok(ator.get());
        }  else {
            return ResponseEntity.notFound().build();
        }




    }
}




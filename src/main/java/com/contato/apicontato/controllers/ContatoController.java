package com.contato.apicontato.controllers;

import com.contato.apicontato.dtos.ContatoDTO;
import com.contato.apicontato.models.Contato;
import com.contato.apicontato.services.ContatoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping("/contato")
public class ContatoController {

    //@GetMapping("/{id}") = buscar por id;
    //@GetMapping = buscar todos;
    //@PostMapping = salvar um objeto;
    //@PutMapping("/{id}") = atualizar um objeto;
    //@DeleteMapping("/{id}") = deletar um objeto;

    @Autowired
    private ContatoService contatoService;

    @Autowired
    private ModelMapper modelMapper;


    //Criando os métodos no Controller
    @GetMapping("/{id}")
    public ResponseEntity<ContatoDTO> findById(@PathVariable Long id) {
        Contato cont = contatoService.findById(id);
        return ResponseEntity.ok().body(modelMapper.map(cont, ContatoDTO.class));
    }

    @GetMapping
    public ResponseEntity<List<ContatoDTO>> findAll() {
        List<Contato> list = contatoService.findAll();
        return ResponseEntity.ok().body(list.stream().map(itemList ->
                modelMapper.map(itemList, ContatoDTO.class)).collect(Collectors.toList()));

    }

    @PostMapping
    public ResponseEntity<ContatoDTO> save(@RequestBody ContatoDTO contatoDTO) {
        Contato cont = contatoService.save(contatoDTO);
        return ResponseEntity.ok().body(modelMapper.map(cont, ContatoDTO.class));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContatoDTO> upDate(@PathVariable Long id,@RequestBody ContatoDTO contatoDTO) {
        contatoDTO.setId(id);
        Contato cont = contatoService.upDate(contatoDTO);
        return ResponseEntity.ok().body(modelMapper.map(cont, ContatoDTO.class));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        contatoService.delete(id);
        return ResponseEntity.noContent().build();
    }

}

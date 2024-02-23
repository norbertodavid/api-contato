package com.contato.apicontato.services;

import com.contato.apicontato.dtos.ContatoDTO;
import com.contato.apicontato.models.Contato;
import com.contato.apicontato.repositories.ContatoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    @Autowired
    private ModelMapper modelMapper;


    //Criando os Métodos no Service
    public Contato findById(Long id) {
        Optional<Contato> cont = contatoRepository.findById(id);
        return cont.get();
    }

    public List<Contato> findAll() {
        return contatoRepository.findAll();
    }

    public Contato save(ContatoDTO contatoDTO) {
        contatoDTO.setId(null);
        return contatoRepository.save(modelMapper.map(contatoDTO, Contato.class));
    }


    public Contato upDate(ContatoDTO contatoDTO) {
        findById(contatoDTO.getId());
        return contatoRepository.save(modelMapper.map(contatoDTO, Contato.class));
    }


    public void delete(Long id) {
        findById(id);
        Optional<Contato> cont = contatoRepository.findById(id);
        contatoRepository.deleteById(id);
    }
}

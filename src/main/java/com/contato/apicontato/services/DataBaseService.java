package com.contato.apicontato.services;

import com.contato.apicontato.models.Contato;
import com.contato.apicontato.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DataBaseService {

    @Autowired
    private ContatoRepository contatoRepository;
    public void instanciaDataBase() {

        Contato cont1 = new Contato(null, "Norberto David Oliveira Neto", "norbertonex@gmail.com", "81 999356205");
        Contato cont2 = new Contato(null, "Mateus Cirqueira Afonso Oliveira", "mts-cirq@gmail.com", "85 996834793");

        contatoRepository.saveAll(Arrays.asList(cont1, cont2));

    }
}

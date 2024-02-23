package com.contato.apicontato.dtos;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

public class ContatoDTO {

    private Long id;
    @NotBlank(message = "O campo Nome é obrigatório")
    @Length(min = 3, max = 30, message = "Deve conter entre 3 até 30 caracteres")
    private String nome;

    private String email;

    private String telefone;

    public ContatoDTO() {

    }

    public ContatoDTO(Long id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

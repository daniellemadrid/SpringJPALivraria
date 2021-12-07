package com.example.SpringLivros.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
// editora-livro = 1-N bidirecional <->  @OneToMany
// uma editora pode ter vários livros

// livro-autor = N-N unidirecional -> @ManyToMany
// um autor pode ter vários livros e livros podem ter vários autores
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    private String primeiroNome;
    private String ultimoNome;
}

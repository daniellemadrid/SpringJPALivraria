package com.example.SpringLivros.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
public class Livro {
    @ManyToOne()
    private Editora editora;
    @JoinColumn(name = "codigoEditora")

    @ManyToMany //N-N unidirecional
    private Collection<Autor> autores;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    private String titulo;
    private Long ano;

}

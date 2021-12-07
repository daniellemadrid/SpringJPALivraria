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
public class Editora {
    @OneToMany(mappedBy="editora")
    private Collection<Livro> livro;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    private String nome;

}

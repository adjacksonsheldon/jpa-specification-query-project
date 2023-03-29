package com.sheldon.jpaspecificationqueryproject.repository.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cpf;
    private String nome;
    private String email;
    @JsonFormat(pattern="dd/MM/yyyy")
    private LocalDate dataNascimento;
}
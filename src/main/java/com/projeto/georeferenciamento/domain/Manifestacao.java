package com.projeto.georeferenciamento.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "manifestacao")
@Entity(name = "manifestacao")

public class Manifestacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_info;
    private String nome_cent;
    private String tipo;
    private String participante;
    private String setor;
    private String entidade;
    private String contexto;
    private String eixo;
    private String assunto;
    private String observacao;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate data_info;
    
    



}

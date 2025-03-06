package com.projeto.georeferenciamento.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Table(name = "manifestacao")
@Entity(name = "Manifestacao")

public class Manifestacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_info;
    private String nome_cent;
    private String participante;
    private String entidade;
    private String contexto;
    private String assunto;
    private String observacao;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate data_info;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    @Enumerated(EnumType.STRING)
    private Eixo eixo;
    @Enumerated(EnumType.STRING)
    private Setor setor;

    public Long getId_info() {
        return id_info;
    }

    public void setId_info(Long id_info) {
        this.id_info = id_info;
    }
}

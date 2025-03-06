package com.projeto.georeferenciamento.domain;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record DadosCadastroManifestacao(
       String nome_cent,
       String participante,
        String entidade,
        String contexto,
        String assunto,
        String observacao,
        LocalDate data_info,
       Tipo tipo,
       Eixo eixo,
       Setor setor

) {
}

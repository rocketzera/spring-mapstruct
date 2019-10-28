package io.github.rocketzera.springmapstruct.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EasyPojo {

    private String nome;

    private String sobrenome;

    private LocalDate dataAgora;
}

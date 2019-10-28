package io.github.rocketzera.springmapstruct.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EasyPojoDTO {

    private String nome;

    private String sobrenome;

    private LocalDate dataAgora;
}

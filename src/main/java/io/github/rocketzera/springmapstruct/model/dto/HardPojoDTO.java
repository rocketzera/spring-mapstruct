package io.github.rocketzera.springmapstruct.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HardPojoDTO {

    private List<LocalDate> dataAgora;

    private List<EasyPojoDTO> easyPojoDTO;

    private NormalPojoDTO normalPojoDTO;
}

package io.github.rocketzera.springmapstruct.model.dto;

import io.github.rocketzera.springmapstruct.model.type.SomeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NormalPojoDTO {

    private Long id1;

    private Long id2;

    private SomeType someEnum;

}

package io.github.rocketzera.springmapstruct.model.entity;

import io.github.rocketzera.springmapstruct.model.type.SomeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NormalPojo {

    private PkNormalPojo pk;

    private String someProperty;

}

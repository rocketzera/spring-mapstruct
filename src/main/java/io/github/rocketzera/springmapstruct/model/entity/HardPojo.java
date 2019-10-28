package io.github.rocketzera.springmapstruct.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HardPojo {

    private List<String> dataAgora;

    private List<EasyPojo> easyPojo;

    private NormalPojo normalPojo;
}

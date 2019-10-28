package io.github.rocketzera.springmapstruct.mapper;

import io.github.rocketzera.springmapstruct.model.dto.HardPojoDTO;
import io.github.rocketzera.springmapstruct.model.entity.HardPojo;
import org.mapstruct.*;

import java.time.LocalDate;
import java.util.List;

@Mapper(componentModel = "spring", uses = {NormalPojoMapper.class, EasyPojoMapper.class})
public interface HardPojoMapper {

    @Mappings({
            @Mapping(target = "normalPojoDTO", source = "normalPojo"),
            @Mapping(target = "easyPojoDTO", source = "easyPojo")
    })
    HardPojoDTO hardPojoToHardPojoDTO(HardPojo hardPojo);

    @InheritInverseConfiguration
    HardPojo hardPojoDTOToHardPojo(HardPojoDTO hardPojoDTO);

    @IterableMapping(dateFormat = "dd/MM/yyyy")
    List<String> localdateToString(List<LocalDate> dates);

    @InheritInverseConfiguration
    List<LocalDate> stringToLocalDate(List<String> dates);
}

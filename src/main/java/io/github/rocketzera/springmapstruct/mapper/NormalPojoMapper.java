package io.github.rocketzera.springmapstruct.mapper;

import io.github.rocketzera.springmapstruct.model.dto.NormalPojoDTO;
import io.github.rocketzera.springmapstruct.model.entity.NormalPojo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface NormalPojoMapper {

    @Mappings({
            @Mapping(target = "id1", source = "normalPojo.pk.id1"),
            @Mapping(target = "id2", source = "normalPojo.pk.id2"),
            @Mapping(target = "someEnum", source = "normalPojo.someProperty")
    })
    NormalPojoDTO normalPojoToNormalPojoDTO(NormalPojo normalPojo);

    @InheritInverseConfiguration
    NormalPojo normalPojoDTOToNormalPojo(NormalPojoDTO normalPojoDTO);
}

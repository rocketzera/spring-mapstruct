package io.github.rocketzera.springmapstruct.mapper;

import io.github.rocketzera.springmapstruct.model.dto.EasyPojoDTO;
import io.github.rocketzera.springmapstruct.model.entity.EasyPojo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface EasyPojoMapper {

    EasyPojoDTO easyPojoToEasyPojoDTO(EasyPojo easyPojo);

    @InheritInverseConfiguration
    EasyPojo easyPojoDTOToEasyPojo(EasyPojoDTO easyPojoDTO);
}

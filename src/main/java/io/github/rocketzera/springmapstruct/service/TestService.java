package io.github.rocketzera.springmapstruct.service;

import io.github.rocketzera.springmapstruct.mapper.EasyPojoMapper;
import io.github.rocketzera.springmapstruct.mapper.HardPojoMapper;
import io.github.rocketzera.springmapstruct.mapper.NormalPojoMapper;
import io.github.rocketzera.springmapstruct.model.dto.EasyPojoDTO;
import io.github.rocketzera.springmapstruct.model.dto.HardPojoDTO;
import io.github.rocketzera.springmapstruct.model.dto.NormalPojoDTO;
import io.github.rocketzera.springmapstruct.model.entity.EasyPojo;
import io.github.rocketzera.springmapstruct.model.entity.HardPojo;
import io.github.rocketzera.springmapstruct.model.entity.NormalPojo;
import io.github.rocketzera.springmapstruct.model.entity.PkNormalPojo;
import io.github.rocketzera.springmapstruct.model.type.SomeType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class TestService {

    private final EasyPojoMapper easyMapper;

    private final NormalPojoMapper normalMapper;

    private final HardPojoMapper hardPojoMapper;

    public EasyPojoDTO easyToDTO() {
        return easyMapper.easyPojoToEasyPojoDTO(EasyPojo.builder().nome("Danilo").sobrenome("Menes").dataAgora(LocalDate.now()).build());
    }

    public EasyPojo dtoToEasy() {
        return easyMapper.easyPojoDTOToEasyPojo(EasyPojoDTO.builder().nome("Danilo").sobrenome("Menes").dataAgora(LocalDate.now()).build());
    }

    public NormalPojoDTO normalToDTO() {
        return normalMapper.normalPojoToNormalPojoDTO(NormalPojo.builder().pk(new PkNormalPojo(1L, 1L)).someProperty(SomeType.C.name()).build());
    }

    public NormalPojo dtoToNormal() {
        return normalMapper.normalPojoDTOToNormalPojo(NormalPojoDTO.builder().id1(1L).id2(1L).someEnum(SomeType.C).build());
    }

    public HardPojoDTO hardToDTO() {
        return hardPojoMapper.hardPojoToHardPojoDTO(HardPojo.builder().dataAgora(Arrays.asList("30/03/1996", "30/03/1996", "30/03/1996"))
                .easyPojo(Arrays.asList(EasyPojo.builder().dataAgora(LocalDate.now()).nome("Danilo").sobrenome("Memes").build()))
                .normalPojo(NormalPojo.builder().pk(new PkNormalPojo(1L,1L)).someProperty(SomeType.B.name()).build()).build());
    }

    public HardPojo dtoToHard() {
        return hardPojoMapper.hardPojoDTOToHardPojo(HardPojoDTO.builder().dataAgora(Arrays.asList(LocalDate.now()))
                .easyPojoDTO(Arrays.asList(EasyPojoDTO.builder().dataAgora(LocalDate.now()).nome("Danilo").sobrenome("Memes").build()))
                .normalPojoDTO(NormalPojoDTO.builder().id1(1L).id2(1L).someEnum(SomeType.B).build()).build());
    }
}

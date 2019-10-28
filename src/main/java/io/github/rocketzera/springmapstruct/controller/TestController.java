package io.github.rocketzera.springmapstruct.controller;

import io.github.rocketzera.springmapstruct.model.dto.EasyPojoDTO;
import io.github.rocketzera.springmapstruct.model.dto.HardPojoDTO;
import io.github.rocketzera.springmapstruct.model.dto.NormalPojoDTO;
import io.github.rocketzera.springmapstruct.model.entity.EasyPojo;
import io.github.rocketzera.springmapstruct.model.entity.HardPojo;
import io.github.rocketzera.springmapstruct.model.entity.NormalPojo;
import io.github.rocketzera.springmapstruct.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/test")
public class TestController {

    private final TestService testService;

    @GetMapping("easy")
    public EasyPojoDTO testEasy() {
        return testService.easyToDTO();
    }
    @GetMapping("easy/inverse")
    public EasyPojo testEasyInverse() {
        return testService.dtoToEasy();
    }

    @GetMapping("normal")
    public NormalPojoDTO testNormal() {
        return testService.normalToDTO();
    }

    @GetMapping("normal/inverse")
    public NormalPojo testNormalInverse() {
        return testService.dtoToNormal();
    }


    @GetMapping("hard")
    public HardPojoDTO testHard() {
        return testService.hardToDTO();
    }

    @GetMapping("hard/inverse")
    public HardPojo testHardInverse() {
        return testService.dtoToHard();
    }
}

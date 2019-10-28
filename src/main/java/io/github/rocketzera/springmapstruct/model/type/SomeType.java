package io.github.rocketzera.springmapstruct.model.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum SomeType {
    A("a"),
    B("b"),
    C("c");

    @Getter
    private String value;
}

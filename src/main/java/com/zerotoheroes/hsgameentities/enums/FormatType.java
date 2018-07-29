package com.zerotoheroes.hsgameentities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FormatType {
    FT_UNKNOWN(0),
    FT_WILD(1),
    FT_STANDARD(2);

	private int intValue;

}

package com.swagger.poc;

import lombok.Getter;

public enum TagsType {
    TAG_01("Tag about topic one"),
    TAG_02("Tag about topic two");

    @Getter
    private final String tagDescription;
    TagsType(String tagDescription) {
        this.tagDescription = tagDescription;
    }
}

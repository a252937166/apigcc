package com.github.ayz6uem.restdoc.util;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ParsedJavadoc {

    String name;
    String description;
    Map<String,String> params = new HashMap<>();

}
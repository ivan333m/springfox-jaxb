package com.example.demo.rest;

import com.example.demo.domain.MyBox;
import com.example.demo.domain.MyItem1;
import com.example.demo.domain.MyItem2;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws JsonProcessingException {
        String json = objectMapper(new Jackson2ObjectMapperBuilder())
                .writeValueAsString(new MyBox("string",
                        Arrays.asList(new MyItem1("string"), new MyItem2("string"))));
        System.out.println(json);
    }

    public static ObjectMapper objectMapper(Jackson2ObjectMapperBuilder builder) {
        return builder.modules(new JaxbAnnotationModule().setPriority(JaxbAnnotationModule.Priority.PRIMARY))
                .build()
                .enable(SerializationFeature.INDENT_OUTPUT);
    }
}

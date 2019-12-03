package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@XmlType(name = "MyItem2")
public class MyItem2 {
    @XmlElement(name = "name")
    private String description;
}

package com.example.demo.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@XmlType(name = "MyBox")
public class MyBox {

    @XmlElement(name = "BoxName")
    protected String boxName;

    @XmlElements({
            @XmlElement(name = "MyItem1", type = MyItem1.class),
            @XmlElement(name = "MyItem2", type = MyItem2.class),
    })
    protected List<Object> items;
}

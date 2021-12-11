package com.dlb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Students {
    @Id
    @GenericGenerator(name = "s",strategy = "identity")
    @GeneratedValue(generator = "s")
    @Column(name = "s_id")
    private Integer s_id;

    @Column(name = "s_name")
    private String s_name;

    @Column(name = "s_birthday")
    private Date s_birthday;
}

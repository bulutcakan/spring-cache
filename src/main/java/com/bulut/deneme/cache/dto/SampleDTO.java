package com.bulut.deneme.cache.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SampleDTO {

    private long id;
    private String name;
    private String surname;
    private int age;

    @Override
    public String toString() {
        return "SampleDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

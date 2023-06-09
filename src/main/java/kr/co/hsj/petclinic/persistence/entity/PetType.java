package kr.co.hsj.petclinic.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum PetType {

    DOG("강아지"),
    CAT("고양이"),
    BIRD("새"),
    REPTILE("파충류"),
    OTHER("기타");

    final String petType;

    public static PetType of(String petType) {

        return Arrays.stream(PetType.values())
                     .filter(type -> type.petType.equalsIgnoreCase(petType))
                     .findAny().orElseThrow(() -> new RuntimeException("Not Found Pet Type"));
    }

}


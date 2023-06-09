package kr.co.hsj.petclinic.service.model.dto.request;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class OwnerRequestDTO {

    @Getter
    @Builder
    @ToString
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Condition {

        private List<Long> ids;
        private String firstName;
    }

    @Getter
    @Builder
    @ToString
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Create {

        private String address;
        private String city;
        private String firstName;
        private String lastName;
        private String telephone;
    }

    @Getter
    @Builder
    @ToString
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Update {

        private String address;
        private String city;
        private String firstName;
        private String lastName;
        private String telephone;
    }
}

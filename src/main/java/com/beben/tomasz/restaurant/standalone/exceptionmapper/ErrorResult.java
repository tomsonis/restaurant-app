package com.beben.tomasz.restaurant.standalone.exceptionmapper;

import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(staticName = "error")
class ErrorResult {

    private String code;

    private String message;
}

package com.juniza82.book.springboot.web.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class HelloResponseDomain {

    private final String name;
    private final int amount;

}

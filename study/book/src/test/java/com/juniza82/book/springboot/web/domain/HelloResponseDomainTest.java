package com.juniza82.book.springboot.web.domain;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class HelloResponseDomainTest {

    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDomain helloResponseDomain = new HelloResponseDomain(name, amount);

        // then
        assertThat(helloResponseDomain.getName()).isEqualTo(name);
        assertThat(helloResponseDomain.getAmount()).isEqualTo(amount);
    }
}

package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
// JPA의 내장 타입 (다른 곳에 내장될 수 있다. 여기에 Embeddable 쓰거나 내장하는 곳에서 Embedded 쓰거나 하나만 써도 되긴 함)
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;
}

package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
// JPA의 내장 타입 (다른 곳에 내장될 수 있다. 여기에 Embeddable 쓰거나 내장하는 곳에서 Embedded 쓰거나 하나만 써도 되긴 함)
// JPA 스펙상 Entity나 Embeddable 타입은 Setter는 제거하고 기본 생성자를 public 또는 protected로 설정해야 함.
// public은 너무 오픈되어 있으니 protected로 설정하여 사용을 막는 게 더 안전. 값 생성
// JPA가 이런 제약을 두는 이유는 JPA 구현 라이브러리가 객체를 생성할 때 리플렉션 같은 기술을 사용할 수 있도록 지원해야 하기 때문
@Getter
// 값 타입은 변경이 불가능하게 설계해야
public class Address {
    private String city;
    private String street;
    private String zipcode;

    protected Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}

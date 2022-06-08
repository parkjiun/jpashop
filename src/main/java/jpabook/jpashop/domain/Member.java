package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id") // 변수 이름인 id가 아니라 member_id로 컬럼을 생성하기 위해
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")  // order 테이블에 있는 member 필드에 mapping 된 거울일뿐(읽기 전용)
    // 여기 값을 변경한다고 order의 member가 업데이트 되지 않음
    private List<Order> orders = new ArrayList<>();
}

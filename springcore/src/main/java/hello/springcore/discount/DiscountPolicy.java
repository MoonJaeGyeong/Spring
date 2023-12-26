package hello.springcore.discount;

import hello.springcore.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}

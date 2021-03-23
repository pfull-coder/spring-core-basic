package com.spring.core.basic.member;

public class Member {

    // 멤버의 속성 : 필드 선언
    private Long id; // 회원 식별코드
    private String name; // 회원 이름
    private Grade grade; // 회원 등급

    // 자바 규약(관례)상 만들어야 할 것
    // 1. 모든 필드를 초기화해주는 생성자
    // 2. 기본 생성자
    // 3. setter/getter/toString
    public Member() {}

    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

package com.spring.core.basic.singleton;

import com.spring.core.basic.config.AppConfig;
import com.spring.core.basic.member.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;


public class SingletonTest {
    
    @Test
    @DisplayName("스프링 없는 순수한 DI 컨테이너 테스트")
    void pureContainer() {
        
        AppConfig appConfig = new AppConfig();
        
        MemberService memberService1 = appConfig.memberService();
        MemberService memberService2 = appConfig.memberService();

        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);
    }

    @Test
    @DisplayName("스프링 컨테이너를 통한 싱글톤 테스트")
    void springContainer() {

        ApplicationContext ac
                = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService1 = ac.getBean(MemberService.class);
        MemberService memberService2 = ac.getBean(MemberService.class);

        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);

    }
}

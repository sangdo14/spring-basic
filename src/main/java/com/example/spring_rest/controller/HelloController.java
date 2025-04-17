package com.example.spring_rest.controller;

import com.example.spring_rest.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//rest api를 간단히 구현하게 해주는 어노테이션
@RestController
public class HelloController {
    // HelloService 클래스 서비스 패키지에서 private으로 가져옴 (보안이슈)
    private HelloService helloService;

    // 가져온 메서드를 해당 인스턴스에 전달처리
    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }
    
    // "/hello" url 접속시 sayHello함수 호출
    // sayHello함수 안쪽에는 은닉화 해놓은 서비스 계층 함수 실행
    // controller(요청) + service(실행 로직)을 분리해서 관리
    @GetMapping("/hello")
    public String sayHello(){
        return helloService.getHello();
    }
}

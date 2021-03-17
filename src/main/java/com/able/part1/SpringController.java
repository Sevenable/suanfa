package com.able.part1;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Scope(value = "prototype")
@RequestMapping("/mvcController")
public class SpringController {
    private static int st = 0;// 静态的
    private int index = 0;// 非静态的

    @RequestMapping("/test")
    public String test() {
        System.out.println(st++ + "|" + index++);
        return "index";
    }
}

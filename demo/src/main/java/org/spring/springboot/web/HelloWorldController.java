package org.spring.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by niuhonglei on 2017/12/15.
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String sayHello() {
        return "Hello World,老牛";
    }

}

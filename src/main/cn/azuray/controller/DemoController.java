package azuray.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/demo")
@Slf4j
public class DemoController {

    @RequestMapping(value = "first", method = RequestMethod.GET)
    public String firstDemo() {
        System.out.println("hello spring boot!");
        return "index";
    }
}

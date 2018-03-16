package azuray.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "first" , method = RequestMethod.GET)
    public String firstDemo() {
        System.out.println("hello spring boot!");
        return "index";
    }
}

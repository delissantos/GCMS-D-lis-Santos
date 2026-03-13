package com.example.WEBAPP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
@RequestMapping("/Delis")
public @ResponseBody String greeting() {
return "Hello, Delis!";
}
//c
@RequestMapping("/hotfix")
public @ResponseBody String greetinghotfix() {
return "Hello, hotfix";
}
}

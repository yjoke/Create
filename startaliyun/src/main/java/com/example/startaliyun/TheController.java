package com.example.startaliyun;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HeYunjia
 */

@RestController
//@CrossOrigin("*")
public class TheController {

    @RequestMapping("/test")
    public String test() {
        return "spring boot test project";
    }
}

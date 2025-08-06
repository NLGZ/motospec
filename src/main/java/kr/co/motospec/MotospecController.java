package kr.co.motospec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MotospecController {
    @GetMapping("/")
    public String home() {
        return "TEST";
    }
}

package dev.stecher.UserNexus.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/users")
public class AuthController {
    @GetMapping("/me")
    public String hello() {
        return "Hello World";
    }

    @PatchMapping("/me")
    public String hello2() {
        return "Hello World";
    }

    @GetMapping() //ADMIN - user pagination
    public String hello3() {
        return "Hello World";
    }

    @PatchMapping("/{id}/roles") //ADMIN - patch user role
    public String hello4() {
        return "Hello World";
    }
}

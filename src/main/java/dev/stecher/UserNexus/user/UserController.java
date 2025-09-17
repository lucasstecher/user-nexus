package dev.stecher.UserNexus.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/auth")
public class UserController {
    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        return "User created";
    }

    @PostMapping("/login")
    public String registerUser(@RequestBody User user) {
        return "User created";
    }

    @PostMapping("/refresh")
    public String registerUser(@RequestBody User user) {
        return "User created";
    }

    @PostMapping("/logout")
    public String registerUser(@RequestBody User user) {
        return "User created";
    }

    @PostMapping("/verify-email")
    public String registerUser(@RequestBody User user) {
        return "User created";
    }

    @PostMapping("/request-reset")
    public String registerUser(@RequestBody User user) {
        return "User created";
    }

    @PostMapping("/reset-password")
    public String registerUser(@RequestBody User user) {
        return "User created";
    }
}

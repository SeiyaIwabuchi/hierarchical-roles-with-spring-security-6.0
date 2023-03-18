package com.example.demo20230318;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserDetailController {

    @Autowired
    private UserDetailsService userDetailsService;

    @GetMapping("/")
    public String userDetail(Authentication authentication, Model model) {
        model.addAttribute("role", authentication.getAuthorities());
        return "user_detail.html";
    }
}

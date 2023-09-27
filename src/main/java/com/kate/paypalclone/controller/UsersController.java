package com.kate.paypalclone.controller;


import com.kate.paypalclone.model.UsersModel;
import com.kate.paypalclone.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
//        model.addAttribute("registerRequest", new UsersModel());
        return "register_page";
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
//        model.addAttribute("loginRequest", new UsersModel());
        return "login_page";
    }
//
    @PostMapping("/process_registration")
    public String register(@ModelAttribute("usersModel") UsersModel usersModel) {
        System.out.println("register request: " + usersModel);
        UsersModel registeredUser = usersService.registerUser(usersModel);
        if (registeredUser != null && registeredUser.getId() != null){
            System.out.println("Saved!");
        }
        else{
            System.out.println("Failed to save!");
            System.out.println("Returned object: " + registeredUser);
        }
        return registeredUser == null ? "error_page" : "login_page";
    }

    @PostMapping("/process_login")
    public String login(@ModelAttribute("usersModel") UsersModel usersModel) {
        System.out.println("login request: " + usersModel);
        UsersModel authenticated_user = usersService.authenticate(usersModel.getEmail(), usersModel.getPassword());
        return authenticated_user == null ? "error_page" : "my_account";
    }

}

package com.kate.paypalclone.controller;


import com.kate.paypalclone.model.UsersModel;
import com.kate.paypalclone.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {

    @Autowired
    IUsersService usersService;

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
//        model.addAttribute("registerRequest", new UsersModel());
        return "register_page";
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
//        model.addAttribute("loginRequest", new UsersModel());     display their name
        return "login_page";
    }
//
    @PostMapping("/process_registration")
    public String register(@ModelAttribute("usersModel") UsersModel usersModel) {
        System.out.println("Received registration request from the following user: " + usersModel);
        UsersModel registeredUser = null;
        if (usersService.duplicateUserCheck(usersModel.getEmail()) == false) {
            registeredUser = usersService.registerUser(usersModel);
            if (registeredUser != null && registeredUser.getId() != null){
                System.out.println("New user "+registeredUser.getName() + " " + registeredUser.getEmail()+" has been registered successfully!");
            }
            else{
                System.out.println("New user "+registeredUser.getName() + " " + registeredUser.getEmail()+" could not be registered. Please try again later!");
            }
        }

        return registeredUser == null ? "error_page" : "login_page";
    }

    @PostMapping("/process_login")
    public String login(@ModelAttribute("usersModel") UsersModel usersModel) {
        System.out.println("login request: " + usersModel);
        UsersModel authenticated_user = usersService.authenticate(usersModel.getEmail(), usersModel.getPassword());
        if (authenticated_user != null && authenticated_user.getEmail() != null && authenticated_user.getPassword() != null){
            if (authenticated_user.getEmail().equalsIgnoreCase(usersModel.getEmail()) && authenticated_user.getPassword().equals(usersModel.getPassword())){
                System.out.println("User "+authenticated_user.getName() + " " + authenticated_user.getEmail()+" has logged in successfully!");
            }
            else{
                System.out.println("User "+authenticated_user.getName() + " " + authenticated_user.getEmail()+" has supplied incorrect login information!");
            }
        }
        else{
            System.out.println("User "+authenticated_user.getName() + " " + authenticated_user.getEmail()+" could not be found!");
        }
        return authenticated_user == null ? "error_page" : "my_account";
    }


    @GetMapping("/my_account")
    public String getMyAccountPage(Model model) {
        return "my_account";
    }

    @GetMapping("/send_money")
    public String getSendMoneyPage(Model model) {
//        model.addAttribute("registerRequest", new UsersModel());
        return "send_money_page";
    }

    @GetMapping("/request_money")
    public String getRequestMoneyPage(Model model) {
//        model.addAttribute("registerRequest", new UsersModel());
        return "request_money_page";
    }

    @GetMapping("/contacts_page")
    public String getContactsPage(Model model) {
//        model.addAttribute("registerRequest", new UsersModel());
        return "contacts_page";
    }

    @GetMapping("/profile_setting_page")
    public String getProfileSettingPage(Model model) {

        return "profile_setting_page";
    }



}


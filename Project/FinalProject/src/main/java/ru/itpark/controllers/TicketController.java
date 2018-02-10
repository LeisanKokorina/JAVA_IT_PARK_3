package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.itpark.models.User;
import ru.itpark.services.AuthenticationService;

import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class TicketController {
    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/get_ticket")
    public String getTicket(Authentication authentication,
                              @ModelAttribute("model") ModelMap model) {
        if (authentication != null) {
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);


        }
        return "reserve_ticket";
    }

}
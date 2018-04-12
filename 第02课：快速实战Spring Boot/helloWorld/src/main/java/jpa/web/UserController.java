package jpa.web;

import jpa.repository.UserRepository;
import jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    //private UserService userService;
    @RequestMapping("/index")
    public String index() {
        return "user/index";
        //return "redirect:/list";
    }
}

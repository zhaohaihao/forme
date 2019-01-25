package top.hilox.forme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hilox on 2019/1/25 0025.
 */
@Controller
public class MailController {

    @RequestMapping("/mail")
    public String mail(Model model) {
        return "mail";
    }
}

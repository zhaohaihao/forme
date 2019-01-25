package top.hilox.forme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhh on 2019/1/24 0024.
 */
@Controller
public class TestController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("content", "Freemarker");
        return "index";
    }
}

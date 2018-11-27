package jp.sbworks.controller.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    // @Value("${env}")
    // private String env;

    @GetMapping("/sample")
    public String index(Model model) {
        // LogUtil.info("確認だよ" + env);
        model.addAttribute("message", "Sample");
        return "sample/index";
    }
}

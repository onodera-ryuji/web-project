package jp.sbworks.controller.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.sql2o.Connection;
import org.sql2o.Query;
import org.sql2o.Sql2o;

import jp.sbworks.db.pojo.Sample;
import jp.sbworks.util.LogUtil;

@Controller
public class DbSampleController {

    @Value("${url}")
    private String url;

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @GetMapping("/dbsample")
    public String index(Model model) {
        LogUtil.info("確認だよ: " + url);
        LogUtil.info("確認だよ: " + username);
        LogUtil.info("確認だよ: " + password);
        Sql2o sql2o = new Sql2o(url, username, password);
        try (Connection connection = sql2o.open()) {
            Query query = connection.createQuery("select * from sample");
            List<Sample> list = query.executeAndFetch(Sample.class);
            LogUtil.info("確認だよ: " + list);
        }

        // model.addAttribute("message", "Sample");
        return "sample/index";
    }
}

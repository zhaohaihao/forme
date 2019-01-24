package top.hilox.resume.service;

import freemarker.template.Template;
import io.github.biezhi.ome.OhMyEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import top.hilox.resume.form.MailForm;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * <pre>
 *     邮件服务Service
 * </pre>
 *
 * Created by Hilox on 2019/1/24 0024.
 */
@Service
public class MailService {

    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    /**
     * 发送模板邮件
     *
     * @param mailForm
     */
    public void sendTemplateMail(MailForm mailForm) {
        // 配置邮件服务器
        String userName = "e20125014@163.com";
        String password = "邮箱授权码";
        Properties properties = OhMyEmail.SMTP_163(false);
        OhMyEmail.config(properties, userName, password);

        // 页面显示数据绑定
        StringBuilder text = new StringBuilder();
        String name = mailForm.getName();
        String email = mailForm.getEmail();
        String message = mailForm.getMessage();
        String phone = mailForm.getPhone();
        Map<String, Object> content = new HashMap();
        content.put("name", name);
        content.put("email", email);
        content.put("message", message);
        content.put("phone", phone);

        try {
            final Template template = freeMarkerConfigurer.getConfiguration().getTemplate("mail.ftl");
            text.append(FreeMarkerTemplateUtils.processTemplateIntoString(template, content));
            OhMyEmail.subject("您的简历有人留言啦!")
                    .from(name)
                    .to("接收者邮箱")
                    .html(text.toString())
                    .send();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

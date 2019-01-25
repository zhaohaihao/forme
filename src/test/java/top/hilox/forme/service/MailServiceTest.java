package top.hilox.forme.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.hilox.forme.FormeApplicationTests;
import top.hilox.forme.form.MailForm;

/**
 * <pre>
 *     邮件服务测试类
 * </pre>
 *
 * Created by Hilox on 2019/1/24 0024.
 */
public class MailServiceTest extends FormeApplicationTests {

    @Autowired
    private MailService mailService;

    @Test
    public void sendTemplateMail() throws Exception {
        MailForm mailForm = new MailForm();
        mailForm.setName("hilox");
        mailForm.setEmail("发送者邮箱地址");
        mailForm.setMessage("邮箱功能测试!");
        mailForm.setPhone("发送者电话");
        mailService.sendTemplateMail(mailForm);
    }

}
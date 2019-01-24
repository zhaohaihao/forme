package top.hilox.resume.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * <pre>
 *     邮件信息提交表单
 * </pre>
 *
 * Created by Hilox on 2019/1/24 0024.
 */
@Data
public class MailForm {

    /**
     * 姓名
     */
    @NotEmpty(message = "姓名必填")
    private String name;

    /**
     * 邮件地址
     */
    @NotEmpty(message = "邮件地址必填")
    private String email;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 留言信息
     */
    @NotEmpty(message = "留言不能为空")
    private String message;
}

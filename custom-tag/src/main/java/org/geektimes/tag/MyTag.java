package org.geektimes.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * @author wangya
 * @date 2021-07-07 15:00
 */
public class MyTag extends SimpleTagSupport {

    private String message;

    public void setMessage(String msg) {
        this.message = msg;
    }

    @Override
    public void doTag() throws JspException, IOException {
        {
            if (message != null) {
                /* 从属性中使用消息 */
                JspWriter out = getJspContext().getOut();
                out.println(message);
            } else {
                JspWriter out = getJspContext().getOut();
                out.println("Hello World ");
            }
        }
    }
}

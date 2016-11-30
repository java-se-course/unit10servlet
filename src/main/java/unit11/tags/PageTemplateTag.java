package unit11.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.JspTag;
import java.io.IOException;

public class PageTemplateTag extends BodyTagSupport {
    private int cnt = 0;

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int doStartTag() throws JspException {
        final JspWriter out = pageContext.getOut();

        try {
            out.write("<html>\n");
            out.write("<head>\n");
            out.write("<title>");
            if (title != null) {
                out.write(title);
            } else {
                out.write("Default title");
            }
            out.write("</title>\n");
            out.write("</head>\n");
            out.write("<body>\n");
            out.write("<div class=\"iteration" + cnt);
            out.write("\">");
        } catch (IOException e) {
            throw new JspException(e);
        }

        return EVAL_BODY_INCLUDE;
    }


    @Override
    public int doAfterBody() throws JspException {
        final JspWriter out = pageContext.getOut();

        try {
            out.write("</div>");
        } catch (IOException e) {
            throw new JspException(e);
        }

        cnt++;
        if (cnt < 2) {
            try {
                out.write("<div class=\"iteration" + cnt);
                out.write("\">");
            } catch (IOException e) {
                e.printStackTrace();
            }

            return EVAL_BODY_AGAIN;
        } else {
            return SKIP_BODY;
        }
    }

    @Override
    public int doEndTag() throws JspException {
        final JspWriter out = pageContext.getOut();

        try {
            out.write("</body>");
            out.write("</html>");
        } catch (IOException e) {
            throw new JspException(e);
        }

        return SKIP_BODY;
    }
}

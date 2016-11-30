package unit11.tags;

import unit11.model.Role;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.util.List;


public class RolesTag extends TagSupport {
    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public int doStartTag() throws JspException {
        final JspWriter out = pageContext.getOut();

        try {
            out.write("<ol class=\"from-tag\">\n");

            if (roles != null) {
                for (Role role : roles) {
                    final String color;
                    if (role.isAdmin()) {
                        color = "red";
                    } else if (role.isAuthor()) {
                        color = "green";
                    } else {
                        color = "blue";
                    }

                    out.write("<li><span style=\"color: ");
                    out.write(color);
                    out.write(";\">");
                    out.write(role.getName());
                    out.write("</span></li>\n");
                }
            }

            out.write("</ol>\n");
        } catch (IOException e) {
            throw new JspException(e);
        }


        return SKIP_BODY;
    }
}

package unit10.user;

import unit11.model.Role;

import java.util.Date;
import java.util.List;

public interface User {
    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    Date getDate();

    void setDate(Date date);

    List<Role> getRoles();

    void setRoles(List<Role> roles);
}

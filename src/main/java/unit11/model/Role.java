package unit11.model;

public class Role {
    private final boolean isAdmin;
    private final boolean isAuthor;

    private final String name;

    public Role(boolean isAdmin, boolean isAuthor, String name) {
        this.isAdmin = isAdmin;
        this.isAuthor = isAuthor;
        this.name = name;
    }

    public boolean isAuthor() {
        return isAuthor;
    }

    public String getName() {
        return name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }


}

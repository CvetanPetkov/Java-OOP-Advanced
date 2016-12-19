package p01_Database;

public class People {

    private long id;
    private String userName;

    public People(long id, String userName) {
        this.setId(id);
        this.setUserName(userName);
    }

    private void setId(long id) {
        this.id = id;
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    public long getId() {
        return this.id;
    }

    public String getUserName() {
        return this.userName;
    }
}

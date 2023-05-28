package company.dao;

import company.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    List<User> users = new ArrayList<>();

    public UserDao() {
    }

    public UserDao(List<User> users) {
        this.users = users;
    }


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "users=" + users +
                '}';
    }
}

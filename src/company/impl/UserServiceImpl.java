package company.impl;

import company.dao.UserDao;
import company.model.User;
import company.service.UserService;


public class UserServiceImpl implements UserService {
public final UserDao userDao=new UserDao();

    @Override
    public void addUser(User user) {
        userDao.getUsers().add(user);
    }

    @Override
    public User getById(Long id) {
        User user=new User();
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (id==userDao.getUsers().get(i).getId()){
                user=userDao.getUsers().get(i);
            }
        }
        return user;
        }

    @Override
    public void getAllUsers() {
    userDao.getUsers().forEach(System.out::println);
    }

    @Override
    public void deleteById(Long id) {
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (id==userDao.getUsers().get(i).getId()){
                userDao.getUsers().remove(userDao.getUsers().get(i));
            }
        }
    }


}


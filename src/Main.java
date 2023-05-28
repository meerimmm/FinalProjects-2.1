
import company.impl.UserServiceImpl;
import company.model.User;

import static company.enums.Gender.FEMALE;
import static company.enums.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1L, "Meerim1", 17, FEMALE);
        User user2 = new User(2L, "Meerim2", 15, FEMALE);
        User user3 = new User(3L, "Meerim3", 19, MALE);

        UserServiceImpl userService = new UserServiceImpl();

        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);
        try {
            userService.getById(4L);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println(userService.getById(1L));
        userService.getAllUsers();
        userService.deleteById(2L);
        userService.getAllUsers();


    }
}

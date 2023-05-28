package company.service;
import company.model.User;



public interface UserService  {
void addUser( User user);
User getById(Long id);
 void getAllUsers();
void  deleteById(Long id);

}

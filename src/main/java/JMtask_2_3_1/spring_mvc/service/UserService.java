package JMtask_2_3_1.spring_mvc.service;

import JMtask_2_3_1.spring_mvc.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUserById(long id);

    void deleteUser(long id);

    void updateUser(User user);

}

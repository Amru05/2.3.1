package JMtask_2_3_1.spring_mvc.initDb;

import JMtask_2_3_1.spring_mvc.model.User;
import JMtask_2_3_1.spring_mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitUsersDB {

    private UserService userService;

    @Autowired
    public InitUsersDB(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void makeUsers() {
        User user1 = new User("Oleg","Tinkoff","ol@eg.ti");
        User user2 = new User("Rustam","Tariko","ru@st.am");
        userService.saveUser(user1);
        userService.saveUser(user2);
    }
}

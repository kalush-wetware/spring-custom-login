package net.kalush.customlogin.bootstrap;

import net.kalush.customlogin.model.User;
import net.kalush.customlogin.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserService userService;

    public DataLoader(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        User mary = new User("Mary", "Alice", "mary.alice@somewhere.net", "m123");
        User john = new User("John", "Smith", "john.smith@somewhere.net", "j123");
        User liz = new User("Liz", "Hurley", "liz.hurley@somewhere.net", "l123");
        
        userService.save(mary);
        userService.save(john);
        userService.save(liz);
    }

}

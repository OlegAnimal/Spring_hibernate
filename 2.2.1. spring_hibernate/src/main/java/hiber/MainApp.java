package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.CarService;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);
        CarService carService = context.getBean(CarService.class);

        userService.add(new User("User1", "Lastname1", "user1@mail.ru", new Car("BMW", 6)));
        userService.add(new User("User2", "Lastname2", "user2@mail.ru", new Car("Audi", 1)));
        userService.add(new User("User3", "Lastname3", "user3@mail.ru", new Car("VAZ", 6)));
        userService.add(new User("User4", "Lastname4", "user4@mail.ru", new Car("UZAZ", 10)));

        List<User> users = userService.listUsers();
        for (User user : users) {
            System.out.println(user);
        }

        System.out.println(carService.getUserByCar("VAZ", 6).toString());

        context.close();
    }
}


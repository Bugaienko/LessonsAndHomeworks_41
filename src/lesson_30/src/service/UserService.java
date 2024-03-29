package lesson_30.src.service;
/*
@date 26.02.2024
@author Sergey Bugaienko
*/


import lesson_30.src.model.User;
import lesson_30.src.repository.UserRepository;
import util.MyList;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public MyList<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User createUser(String email, String password) {
        boolean isExist = userRepository.isUserEmailExist(email);
        if (isExist) {
           return null;
        }
        // Мне нужно провалидировать мой email и пароль
        User user = userRepository.createUser(email, password);
        return user;
    }
}

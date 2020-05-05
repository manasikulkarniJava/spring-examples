package com.codefountain.spring.core;

public class UserService {
    private UserRepository userRepository;

    public void save(User user) {
        userRepository.Save(user);
    }

    public void findById(long userId) {
        userRepository.findById(userId);
    }

    public void update(User user) {
        userRepository.Save(user);
    }

    public void delete(long userId) {
        userRepository.delete(userId);
    }
}

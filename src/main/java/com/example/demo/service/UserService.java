package com.example.demo.service;

import com.example.demo.repository.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class UserService {

    public List<User> helloWorld(){
        return List.of(
                new User(1L, "Sergey", "ser@mail.ru", LocalDate.of(1990, 1, 1), 35),
                new User(1L, "Mary", "marry@mail.ru", LocalDate.of(1991, 2, 2), 34),
                new User(1L, "Ivan", "Ivan@mail.ru", LocalDate.of(1992, 3, 3), 33)
        );
    }
}

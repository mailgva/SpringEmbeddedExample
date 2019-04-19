package com.gorbatenko.embed;

import com.gorbatenko.embed.model.Address;
import com.gorbatenko.embed.model.Phone;
import com.gorbatenko.embed.model.User;
import com.gorbatenko.embed.repository.PhoneRepository;
import com.gorbatenko.embed.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class EmbedApplication implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PhoneRepository phoneRepository;

    public static void main(String[] args) {
        SpringApplication.run(EmbedApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Phone phone1 = new Phone("1111");
        Phone phone2 = new Phone("2222");
        Phone phone3 = new Phone("3333");

        Address address = new Address("Pushkinskaya 23", "Odessa", "Ukraine");

        User user1 = new User("Kela", Arrays.asList(phone1, phone2, phone3), address);

        userRepository.save(user1);

        System.out.println(userRepository.findAll().stream().findFirst());

    }
}

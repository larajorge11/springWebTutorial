package com.spring.web.example.springWebTutorial.bootstrap;

import com.spring.web.example.springWebTutorial.domain.Pet;
import com.spring.web.example.springWebTutorial.domain.Publisher;
import com.spring.web.example.springWebTutorial.domain.User;
import com.spring.web.example.springWebTutorial.repository.PetRepository;
import com.spring.web.example.springWebTutorial.repository.PublisherRepository;
import com.spring.web.example.springWebTutorial.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PetRepository petRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(UserRepository userRepository, PetRepository petRepository, PublisherRepository publisherRepository) {
        this.userRepository = userRepository;
        this.petRepository = petRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher("Stefani", "Calle 152", "Bogota", "Cundinamarca", null);
        publisherRepository.save(publisher);

        User user1 = new User("Jorge", "Lara", "larajorge11@gmail.com");
        Pet pet1 = new Pet("Davor", 13);
        pet1.setPublisher(publisher);
        publisher.getPets().add(pet1);
        user1.getPets().add(pet1);

        userRepository.save(user1);
        petRepository.save(pet1);
        publisherRepository.save(publisher);

        User user2 = new User("Andy", "Lara", "laraandy@gmail.com");
        Pet pet2 = new Pet("Lupe", 4);
        pet2.setPublisher(publisher);
        publisher.getPets().add(pet2);
        user2.getPets().add(pet2);

        userRepository.save(user2);
        petRepository.save(pet2);

        System.out.println("Bootstrap started");
        System.out.println("Number of Pets " + petRepository.count());
    }
}

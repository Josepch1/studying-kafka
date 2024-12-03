package josehomenhuck.costumer.service;

import josehomenhuck.costumer.entiy.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @KafkaListener(topics = "user-created", containerFactory = "userKafkaListenerContainerFactory")
    public void userListener(User user) {
        System.out.println("Received user: " + user.email() + " - " + user.name());
    }
}

package josehomenhuck.producer.service;

import josehomenhuck.producer.entity.User;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final KafkaTemplate<String, User> kafkaTemplateOrder;

    public UserService(KafkaTemplate<String, User> kafkaTemplateOrder) {
        this.kafkaTemplateOrder = kafkaTemplateOrder;
    }

    public User sendUser(User user) {
        System.out.println("Producing user: " + user.name());
        kafkaTemplateOrder.send("user-created", user);
        return user;
    }
}

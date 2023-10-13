package ie.atu.week4_1;


import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    private RegistrationServiceClient registrationServiceClient;

    @Autowired
    public UserController(RegistrationServiceClient registrationServiceClient) {
        this.registrationServiceClient = registrationServiceClient;
    }

    @PostMapping("/confirm-and-register")
    public Object confirmAndRegister(@RequestBody UserDetails userDetails) {
        //Map<String, String> receivedNotification = registrationServiceClient.someDetails(userDetails);
        /*
        Map<String, String> responseMessage = new HashMap<>();
        responseMessage.put("message", confirm);
        return responseMessage;
         */
        return registrationServiceClient.someDetails(userDetails);
    }
}

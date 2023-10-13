package ie.atu.week4_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final RegistrationServiceClient registrationServiceClient;

    @Autowired
    public UserController(RegistrationServiceClient registrationServiceClient) {
        this.registrationServiceClient = registrationServiceClient;
    }

    @PostMapping("/confirm-and-register")
    public Object confirmAndRegister(@RequestBody UserDetails userDetails) {
        System.out.println("User details received at UserController: " + userDetails);
        return registrationServiceClient.someDetails(userDetails);
    }
}

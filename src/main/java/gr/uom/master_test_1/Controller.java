package gr.uom.master_test_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello";
    }
    
}

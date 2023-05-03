package hello.springmvc.basic.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappinfClassController {

    @GetMapping
    public String user(){
        return "get Users";
    }

    @PostMapping
    public String addUser(){
        return "add User";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId){
        return "get userId = " + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId){
        return "update userId = " + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId){
        return "delete userId = " + userId;
    }
}

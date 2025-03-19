package com.example.User.Controller;

import com.example.User.Entity.User;
import com.example.User.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@PostMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable long id){
        Optional<User> userBd = userRepository.findById(id);

        if (userBd.isPresent()){
            return ResponseEntity.status(HttpStatus.FOUND)
                    .body(userBd.get());
        }
    }

    @PostMapping
    ResponseEntity<User> create(@RequestBody User user){
        User userBd = userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userBd);
    }

    @DeleteMapping
    public ResponseEntity<User> deleteById(@PathVariable Long id){
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()){
            userRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Usuario deletado");
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario não" + "Encontrado para ser deletado");
        }
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        List<User> users = userRepository.findAll();
        if (users.isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }


}

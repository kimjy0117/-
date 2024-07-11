package org.example.example;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    private final Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @PostMapping
    public void create(@RequestBody Domain domain){
        this.repository.save(domain);
    }

    @GetMapping
    public List<Domain> getAllDomain(){
        return this.repository.findAll();
    }
}

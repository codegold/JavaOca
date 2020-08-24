package com.example.accessingDataNEO4J;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
    Person findByName(String name);
}

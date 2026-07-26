package com.psudo.restaurant.modules.profile.repository;

import com.psudo.restaurant.modules.profile.entity.About;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AboutRepository extends MongoRepository<About, String> {

    Optional<About> findByActiveTrue();

}
package com.registerservice.repository;

import com.registerservice.model.ClientModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends MongoRepository<ClientModel, String> {

    Optional<ClientModel> findById(String id);
}

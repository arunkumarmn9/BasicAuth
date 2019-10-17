package com.media.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.media.model.Show;
@Repository
public interface ShowRepo extends MongoRepository<Show,Integer> {

}

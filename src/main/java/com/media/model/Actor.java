package com.media.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("actor")
public class Actor {
	@Id
	ObjectId id;

}

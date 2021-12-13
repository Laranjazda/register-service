package com.registerservice.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "clients")

public class ClientModel {

    @Id
    private String id;
    private String name;
    private String login;
    private String password;

}

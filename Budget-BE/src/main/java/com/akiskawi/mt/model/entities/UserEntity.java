package com.akiskawi.mt.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = UserEntity.users)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {

    public final static String users = "users";

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String picture;
    private String email;
}

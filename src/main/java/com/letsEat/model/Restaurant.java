package com.letsEat.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "restaurant")
@ToString
public class Restaurant {
    @Id
    UUID id;

    @NonNull
    String name;

    @NonNull
    String pricePoints;

    @NonNull
    String category;

}



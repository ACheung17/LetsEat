package com.letsEat.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Document
@ToString
public class Restaurant {
    @Id
    UUID id;

    String name;

    String pricePoints;

    String category;

}



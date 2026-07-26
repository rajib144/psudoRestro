package com.psudo.restaurant.modules.profile.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "about")
public class About {

    @Id
    private String id;

    private String restaurantName;

    private String description;

    private String mission;

    private String vision;

    private String email;

    private String phone;

    private String address;

    private String website;

    private boolean active;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
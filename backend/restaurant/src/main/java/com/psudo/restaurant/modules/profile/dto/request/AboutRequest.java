package com.psudo.restaurant.modules.profile.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AboutRequest {

    @NotBlank
    private String restaurantName;

    private String description;

    private String mission;

    private String vision;

    private String email;

    private String phone;

    private String address;

    private String website;
}
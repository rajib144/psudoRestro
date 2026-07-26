package com.psudo.restaurant.modules.profile.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AboutResponse {

    private String id;

    private String restaurantName;

    private String description;

    private String mission;

    private String vision;

    private String email;

    private String phone;

    private String address;

    private String website;
}
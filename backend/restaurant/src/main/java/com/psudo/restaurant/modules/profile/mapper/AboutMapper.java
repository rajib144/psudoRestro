package com.psudo.restaurant.modules.profile.mapper;

import com.psudo.restaurant.modules.profile.dto.response.AboutResponse;
import com.psudo.restaurant.modules.profile.entity.About;

public class AboutMapper {

    private AboutMapper() {
    }

    public static AboutResponse toResponse(About about) {

        return AboutResponse.builder()
                .id(about.getId())
                .restaurantName(about.getRestaurantName())
                .description(about.getDescription())
                .mission(about.getMission())
                .vision(about.getVision())
                .email(about.getEmail())
                .phone(about.getPhone())
                .address(about.getAddress())
                .website(about.getWebsite())
                .build();
    }
}
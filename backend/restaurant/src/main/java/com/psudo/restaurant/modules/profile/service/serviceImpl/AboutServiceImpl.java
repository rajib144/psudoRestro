package com.psudo.restaurant.modules.profile.service.serviceImpl;

import com.psudo.restaurant.modules.profile.dto.request.AboutRequest;
import com.psudo.restaurant.modules.profile.dto.response.AboutResponse;
import com.psudo.restaurant.modules.profile.entity.About;
import com.psudo.restaurant.modules.profile.exception.AboutNotFoundException;
import com.psudo.restaurant.modules.profile.mapper.AboutMapper;
import com.psudo.restaurant.modules.profile.repository.AboutRepository;
import com.psudo.restaurant.modules.profile.service.AboutService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AboutServiceImpl implements AboutService {

    private final AboutRepository repository;

    @Override
    public AboutResponse getAbout() {

        About about = repository.findByActiveTrue()
                .orElseThrow(() -> new AboutNotFoundException("About information not found"));

        return AboutMapper.toResponse(about);
    }

    @Override
    public AboutResponse create(AboutRequest request) {

        About about = About.builder()
                .restaurantName(request.getRestaurantName())
                .description(request.getDescription())
                .mission(request.getMission())
                .vision(request.getVision())
                .email(request.getEmail())
                .phone(request.getPhone())
                .address(request.getAddress())
                .website(request.getWebsite())
                .active(true)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        repository.save(about);

        return AboutMapper.toResponse(about);
    }

    @Override
    public AboutResponse update(String id, AboutRequest request) {

        About about = repository.findById(id)
                .orElseThrow(() -> new AboutNotFoundException("About information not found"));

        about.setRestaurantName(request.getRestaurantName());
        about.setDescription(request.getDescription());
        about.setMission(request.getMission());
        about.setVision(request.getVision());
        about.setEmail(request.getEmail());
        about.setPhone(request.getPhone());
        about.setAddress(request.getAddress());
        about.setWebsite(request.getWebsite());
        about.setUpdatedAt(LocalDateTime.now());

        repository.save(about);

        return AboutMapper.toResponse(about);
    }
}
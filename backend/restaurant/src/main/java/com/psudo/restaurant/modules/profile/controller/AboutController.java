package com.psudo.restaurant.modules.profile.controller;

import com.psudo.restaurant.modules.profile.dto.request.AboutRequest;
import com.psudo.restaurant.modules.profile.dto.response.AboutResponse;
import com.psudo.restaurant.modules.profile.service.AboutService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/profile/about")
@RequiredArgsConstructor
public class AboutController {

    private final AboutService aboutService;

    @GetMapping
    public AboutResponse getAbout() {
        return aboutService.getAbout();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AboutResponse create(@Valid @RequestBody AboutRequest request) {
        return aboutService.create(request);
    }

    @PutMapping("/{id}")
    public AboutResponse update(@PathVariable String id,
                                @Valid @RequestBody AboutRequest request) {

        return aboutService.update(id, request);
    }
}
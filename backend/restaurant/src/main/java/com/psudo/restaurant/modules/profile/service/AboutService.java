package com.psudo.restaurant.modules.profile.service;

import com.psudo.restaurant.modules.profile.dto.request.AboutRequest;
import com.psudo.restaurant.modules.profile.dto.response.AboutResponse;

public interface AboutService {

    AboutResponse getAbout();

    AboutResponse create(AboutRequest request);

    AboutResponse update(String id, AboutRequest request);

}
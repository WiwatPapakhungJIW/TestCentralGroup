package com.example.demo.services;

import com.example.demo.services.models.RandomUserResponse;

public interface IUserService {
    public RandomUserResponse getRandomUserResponse(String seed);
}
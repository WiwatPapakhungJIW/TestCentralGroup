package com.example.demo.controller;

import com.example.demo.Dto.ErrorResponse;
import com.example.demo.Dto.InfoDto;
import com.example.demo.Dto.UserApiResponse;
import com.example.demo.Dto.UserDto;
import com.example.demo.services.IUserService;
import com.example.demo.services.models.RandomUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private IUserService userService;
    @GetMapping("/v1/users")
    public UserApiResponse getUser(
            @RequestParam(value = "seed", defaultValue = "foobar") String seed) {

        UserApiResponse wipResponse = new UserApiResponse();

        try {
            RandomUserResponse response = userService.getRandomUserResponse(seed);
            // Datamap
            var data = response.getResults();
            var info = response.getInfo();
            wipResponse.setData(UserDto.ConvertUserModelToUserDto(data)); // Datamapping using static function on DTO
            wipResponse.setInfo(InfoDto.ConvertUserModelToInfoDto(info));
        } catch (Exception e) {
            ErrorResponse errorWip = new ErrorResponse();
            errorWip.setMessage(e.getMessage());
            wipResponse.setError(errorWip);
        }

        return wipResponse;
    }
}

package com.example.demo.Dto;

import java.util.ArrayList;

public class UserApiResponse {
    private ArrayList<UserDto> data;

    public ArrayList<UserDto> getData() {
        return data;
    }

    public void setData(ArrayList<UserDto> data) {
        this.data = data;
    }


    private InfoDto info;

    public InfoDto getInfo() {
        return info;
    }

    public void setInfo(InfoDto info) {
        this.info = info;
    }

    private ErrorResponse error;

    public ErrorResponse getError() {
        return error;
    }

    public void setError(ErrorResponse error) {
        this.error = error;
    }
}

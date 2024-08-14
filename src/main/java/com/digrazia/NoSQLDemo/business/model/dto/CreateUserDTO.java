package com.digrazia.NoSQLDemo.business.model.dto;

public record CreateUserDTO(String username, String password, String email, String phone, String role) {
}

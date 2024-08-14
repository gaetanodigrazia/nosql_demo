package com.digrazia.NoSQLDemo.business.model.dto;

import java.time.LocalDateTime;

public record UserDTO(String id, String username, String password, String email, String phone, String role, LocalDateTime createdAt) {
}

package com.practices.urlshortener.domain.models;

import com.practices.urlshortener.domain.entities.User;

import java.io.Serializable;

/**
 * DTO for {@link User}
 */
public record UserDto(Long id, String name) implements Serializable {
}
package com.app.registration.repository;
import java.util.Optional;

import com.app.registration.model.ImageModel;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ImageRepository extends JpaRepository<ImageModel, Long> {
	Optional<ImageModel> findByName(String name);
}
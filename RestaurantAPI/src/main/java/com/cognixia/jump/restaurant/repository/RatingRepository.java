package com.cognixia.jump.restaurant.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.restaurant.model.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {

	Optional<Rating> findById(Long id);
	
	List<Rating> findByRating(int rating);
}

package com.cognixia.jump.restaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rating_id")
	private long id;
	
	@Size(min = 1, max = 5)
	private int rating;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Rating() {
		this(-1, 0);
	}

	public Rating(long id, @Size(min = 1, max = 5) int rating) {
		super();
		this.id = id;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Rating [id=" + id + ", rating=" + rating + "]";
	}
	
	
	
}

package com.app.pojos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass // cls level anno to tell hibernate : following will be used as a common base
					// class , to be extended by other entities. No table will be created for this
					// class
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// later : @Version : will be added here : to support optimistic locking

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

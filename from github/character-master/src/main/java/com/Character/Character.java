package com.Character;

@javax.persistence.Entity
public class Character {

	@javax.persistence.Column(name = "name")
	private String name;

	@javax.persistence.Id
	@javax.persistence.Column(name = "id")
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private Integer id;

	public Character() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer temp) {
		this.id = temp;
	}
}
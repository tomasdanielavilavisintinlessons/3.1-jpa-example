package com.example.jpaExample.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="authors")
@NamedQueries({
	@NamedQuery(
		name="findAllAuthors",
		query="select a from Author a"
	),
	@NamedQuery(
		name="findAuthorsBySecondName",
		query="select a from Author a where a.second_name = :second_name"
	)
})
public class Author implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="first_name")
	private String first_name;
	@Column(name="second_name")
	private String second_name;

	public Author() {}

	public Author(int id, String first_name, String second_name) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.second_name = second_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getSecond_name() {
		return second_name;
	}

	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}
	
	
	
}

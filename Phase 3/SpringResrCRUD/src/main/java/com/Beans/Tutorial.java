package com.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tutorials")
public class Tutorial {
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO)
	 private long id;
	@Column(name = "Title",length=50)
	 private String title;
	@Column(name = "Description",length=200)
	 private String description;
	@Column(name = "Published")
	 private boolean published;
	public Tutorial() {}
	public Tutorial( String title, String description, boolean published) {
		
		this.title = title;
		this.description = description;
		this.published = published;
	}
	 

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isPublished() {
		return published;
	}
	public void setPublished(boolean published) {
		this.published = published;
	}
	
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", published=" + published
				+ "]";
	}
	}

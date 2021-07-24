package com.springrest.springrest.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Table(name = "course")
@Entity
public class Course implements Serializable  {
	@Id
	@GeneratedValue
    @Column(name = "course_id")
	private long id;
    @Column(nullable = false)
	private String title;
    
    @ManyToOne
    private Centre centre;
//    @JoinColumn(name ="centre", nullable = false, referencedColumnName="centre_id")

	/**
	 * 
	 */
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
/**
 * @param id
 * @param title
 * @param centre
 */
public Course(long id, String title, Centre centre) {
	this.id = id;
	this.title = title;
	this.centre = centre;
}
public final long getId() {
	return id;
}
public final void setId(long id) {
	this.id = id;
}
public final String getTitle() {
	return title;
}
public final void setTitle(String title) {
	this.title = title;
}
public final Centre getCentre() {
	return centre;
}
public final void setCentre(Centre centre) {
	this.centre = centre;
}
@Override
public String toString() {
	return "Course [id=" + id + ", title=" + title + ", centre=" + centre + "]";
}
    

}

/**
 * 
 */
package com.springrest.springrest.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//import javax.persistence.Table;

/**
 * @author amith
 *
 */

@Table(name = "centre")
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Centre implements Serializable{
	@Id
    @GeneratedValue
    @Column(name = "centre_id")
    private Long id;
    @Column(nullable = false, length = 40)
	private String centreName;
    
    @Column(nullable = false, length = 12)
	private String centreCode;
    
    @Column(nullable = false)
    @Embedded
    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Address address;
    
	@CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdOn;
	
	@Column(nullable = false)
	private long studentCapacity;
	
	@Column(nullable = false)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course", cascade = CascadeType.ALL)
    private List<Course> coursesOffered = new ArrayList<>();

	@Column(nullable = false)
	private String contactEmail;
	
	@Column(nullable = false, length = 12)
	private String contactPhone;
	
	
	/**
	 * 
	 */
	public Centre() {
		// TODO Auto-generated constructor stub
		super();
	}


	/**
	 * @param id
	 * @param centreName
	 * @param centreCode
	 * @param address
	 * @param createdOn
	 * @param studentCapacity
	 * @param coursesOffered
	 * @param contactEmail
	 * @param contactPhone
	 */
	public Centre(Long id, String centreName, String centreCode, Address address, Date createdOn, long studentCapacity,
			List<Course> coursesOffered, String contactEmail, String contactPhone) {
		this.id = id;
		this.centreName = centreName;
		this.centreCode = centreCode;
		this.address = address;
		this.createdOn = createdOn;
		this.studentCapacity = studentCapacity;
		this.coursesOffered = coursesOffered;
		this.contactEmail = contactEmail;
		this.contactPhone = contactPhone;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCentreName() {
		return centreName;
	}


	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}


	public String getCentreCode() {
		return centreCode;
	}


	public void setCentreCode(String centreCode) {
		this.centreCode = centreCode;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Date getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}


	public long getStudentCapacity() {
		return studentCapacity;
	}


	public void setStudentCapacity(long studentCapacity) {
		this.studentCapacity = studentCapacity;
	}


	public List<Course> getCoursesOffered() {
		return coursesOffered;
	}


	public void setCoursesOffered(List<Course> coursesOffered) {
		this.coursesOffered = coursesOffered;
	}


	public String getContactEmail() {
		return contactEmail;
	}


	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}


	public String getContactPhone() {
		return contactPhone;
	}


	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}


	@Override
	public String toString() {
		return "Centre [id=" + id + ", centreName=" + centreName + ", centreCode=" + centreCode + ", address=" + address
				+ ", createdOn=" + createdOn + ", studentCapacity=" + studentCapacity + ", coursesOffered="
				+ coursesOffered + ", contactEmail=" + contactEmail + ", contactPhone=" + contactPhone + "]";
	}

}

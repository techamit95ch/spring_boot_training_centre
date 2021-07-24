/**
 * 
 */
package com.springrest.springrest.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
//import com.springrest.springrest.entities.Centre;
import javax.persistence.Table;

/**
 * @author amith
 *
 */
@Embeddable 
@Table(name = "address")
@Entity
public class Address implements Serializable {
	@Id
	@GeneratedValue
	private long id;
    @Column(nullable = false,length = 4000)
	private String detailedAddress;
    @Column(nullable = false)
	private String city;
    @Column(nullable = false)
	private String state;
    @Column(nullable = false)
	private long pinCode;
    
    @OneToOne
    private Centre centre;

	/**
	 * 
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param detailedAddress
	 * @param city
	 * @param state
	 * @param pinCode
	 * @param centre
	 */
	public Address(long id, String detailedAddress, String city, String state, long pinCode, Centre centre) {
		this.id = id;
		this.detailedAddress = detailedAddress;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.centre = centre;
	}

	public final long getId() {
		return id;
	}

	public final void setId(long id) {
		this.id = id;
	}

	public final String getDetailedAddress() {
		return detailedAddress;
	}

	public final void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}

	public final String getCity() {
		return city;
	}

	public final void setCity(String city) {
		this.city = city;
	}

	public final String getState() {
		return state;
	}

	public final void setState(String state) {
		this.state = state;
	}

	public final long getPinCode() {
		return pinCode;
	}

	public final void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public final Centre getCentre() {
		return centre;
	}

	public final void setCentre(Centre centre) {
		this.centre = centre;
	}

}

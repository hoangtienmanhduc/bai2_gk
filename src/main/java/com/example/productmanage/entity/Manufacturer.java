package com.example.productmanage.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name =  "tblManufactory")
public class Manufacturer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 100, unique = true, nullable = false)
    private String manName;
	
	@Column(length = 100, unique = true, nullable = false)
    private String manContactName;
	
	@Column(length = 100, unique = true, nullable = false)
    private String manContactEmail;
	
	@Column(length = 100, unique = true, nullable = false)
    private String manContactPhone;
	
	@Column(length = 100, unique = true, nullable = false)
    private String manWebsite;
	
	@OneToMany(mappedBy = "manuf")
    private List<Product> lsProduct;

	public Manufacturer() {
		
	}

	public Manufacturer(String manName, String manContactName, String manContactEmail, String manContactPhone,
			String manWebsite) {
		super();
		this.manName = manName;
		this.manContactName = manContactName;
		this.manContactEmail = manContactEmail;
		this.manContactPhone = manContactPhone;
		this.manWebsite = manWebsite;
	}
	

	public Manufacturer(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getManName() {
		return manName;
	}

	public void setManName(String manName) {
		this.manName = manName;
	}

	public String getManContactName() {
		return manContactName;
	}

	public void setManContactName(String manContactName) {
		this.manContactName = manContactName;
	}

	public String getManContactEmail() {
		return manContactEmail;
	}

	public void setManContactEmail(String manContactEmail) {
		this.manContactEmail = manContactEmail;
	}

	public String getManContactPhone() {
		return manContactPhone;
	}

	public void setManContactPhone(String manContactPhone) {
		this.manContactPhone = manContactPhone;
	}

	public String getManWebsite() {
		return manWebsite;
	}

	public void setManWebsite(String manWebsite) {
		this.manWebsite = manWebsite;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lsProduct);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manufacturer other = (Manufacturer) obj;
		return Objects.equals(lsProduct, other.lsProduct);
	}

	@Override
	public String toString() {
		return "Manufacturer [id=" + id + ", manName=" + manName + ", manContactName=" + manContactName
				+ ", manContactEmail=" + manContactEmail + ", manContactPhone=" + manContactPhone + ", manWebsite="
				+ manWebsite + "]";
	}
	
}

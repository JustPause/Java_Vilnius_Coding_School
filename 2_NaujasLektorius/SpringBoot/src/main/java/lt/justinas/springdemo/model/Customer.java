package lt.justinas.springdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customernumber")
	private Integer customerNumber; // customer_number
	@Column(name = "customername")
	private String customerName;
	@Column(name = "contactlastname")
	private String contactLastName;
	@Column(name = "contactfirstname")
	private String contactFirstName;
	@Column(name = "phone")
	private String phone;
	@Column(name = "addressline1")
	private String addressLine1;
	@Column(name = "addressline2")
	private String addressLine2;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "postalcode")
	private String postalCode;
	@Column(name = "country")
	private String country;
	@Column(name = "salesrepemployeenumber")
	private Integer salesRepEmployeeNumber;
	@Column(name = "creditlimit")
	private Double creditLimit;

	public Integer getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactLastName() {
		return contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	public String getContactFirstName() {
		return contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getSalesRepEmployeeNumber() {
		return salesRepEmployeeNumber;
	}

	public void setSalesRepEmployeeNumber(Integer salesRepEmployeeNumber) {
		this.salesRepEmployeeNumber = salesRepEmployeeNumber;
	}

	public Double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"customerNumber=" + customerNumber +
				", customerName='" + customerName + '\'' +
				", contactLastName='" + contactLastName + '\'' +
				", contactFirstName='" + contactFirstName + '\'' +
				", phone='" + phone + '\'' +
				", addressLine1='" + addressLine1 + '\'' +
				", addressLine2='" + addressLine2 + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", postalCode='" + postalCode + '\'' +
				", country='" + country + '\'' +
				", salesRepEmployeeNumber=" + salesRepEmployeeNumber +
				", creditLimit=" + creditLimit +
				'}';
	}
}

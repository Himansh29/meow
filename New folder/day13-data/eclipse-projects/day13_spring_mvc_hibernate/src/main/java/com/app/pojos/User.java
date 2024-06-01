package com.app.pojos;
/*
 *  (PK) ,name,email,password,confirmPassword,role(enum), regAmount;
	 LocalDate/Date regDate;
	 byte[] image;
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity 
@Table(name = "users_tbl") // specifies table name
public class User extends BaseEntity{
	
	@Column(name="first_name",length = 30)//length : varchar size
	private String firstName;
	@Column(name="last_name",length = 30)//length : varchar size
	private String lastName;
	@Column(length = 30,unique = true)//=> unique constraint
	private String email;
	@Column(length = 20,nullable = false)//=> not null constraint
	private String password;
	@Enumerated(EnumType.STRING) //=> col type : varchar : enum const name
	@Column(name="user_role",length = 20)
	private Role userRole;
	private LocalDate dob;
	//add one to one association User 1--->1 Address
	@OneToOne(mappedBy = "myUser",cascade = CascadeType.ALL,orphanRemoval = true)
	private Address userAddress;
	//mapping between enity n embeddable 
	@Embedded //optional added only for understanding !
	private AdhaarCard card;
	//mapping between entity n collection of basic value type
	@ElementCollection //mandatory : o.w Mapping exc
	@CollectionTable(name="user_hobbies",joinColumns = @JoinColumn(name="user_id"))
	@Column(name="hobby_name",length = 50)
	private List<String> hobbies;
	//add collection of embeddables
	@ElementCollection
	@CollectionTable(name="payment_cards",joinColumns = @JoinColumn(name="user_id"))
	private List<PaymentCard> cards=new ArrayList<>();
	
	// def ctor : MANDATORY
	public User() {
		System.out.println("in def ctor " + getClass());
	}


	public User(String firstName, String lastName, String email, String password, Role userRole, LocalDate dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.userRole = userRole;
		this.dob = dob;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Role getUserRole() {
		return userRole;
	}


	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public Address getUserAddress() {
		return userAddress;
	}


	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}

	

	public AdhaarCard getCard() {
		return card;
	}


	public void setCard(AdhaarCard card) {
		this.card = card;
	}


	public List<String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
		

	public List<PaymentCard> getCards() {
		return cards;
	}


	public void setCards(List<PaymentCard> cards) {
		this.cards = cards;
	}


	@Override
	public String toString() {
		return "User "+getId()+" [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", userRole=" + userRole
				+ ", dob=" + dob + "]";
	}
	


	
		
}

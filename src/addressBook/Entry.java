package addressBook;

import java.util.Objects;

public class Entry {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String emailAddress;
	
	public Entry(String firstName, String lastName, String phoneNumber, String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
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

		  public String getPhoneNumber() {
		    return phoneNumber;
		  }

		  public void setPhone(String phone) {
		    this.phoneNumber = phone;
		  }

		  public String getEmailAddress() {
		    return emailAddress;
		  }

		  public void setEmailAddress(String email) {
		    this.emailAddress = email;
		  }

		  @Override
		  public boolean equals(Object o) {
		    if (this == o) {
		      return true;
		    }
		    if (o == null || getClass() != o.getClass()) {
		      return false;
		    }
		    Entry entry = (Entry) o;
		    return Objects.equals(getEmailAddress(), entry.getEmailAddress());
		  }

		  @Override
		  public int hashCode() {
		    return Objects.hash(getEmailAddress());
		  }

		  @Override
		  public String toString() {
		    return "Entry{"
		        + "firstName='"
		        + firstName
		        + '\''
		        + ", lastName='"
		        + lastName
		        + '\''
		        + ", phoneNumber='"
		        + phoneNumber
		        + '\''
		        + ", emailAddress='"
		        + emailAddress
		        + '\''
		        + '}';
		  }
		}

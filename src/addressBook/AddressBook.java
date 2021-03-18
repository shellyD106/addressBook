package addressBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class AddressBook {
	private List<Entry> entries;
	public AddressBook() {
	this.entries = new ArrayList<>();
}
	public boolean addEntry(Entry entry) {
	    if (this.entries.contains(entry)) {
	      System.out.println("Another entry already present with same email address\n");
	      return false;
	    }
	    this.entries.add(entry);
	    System.out.println("Entry added successfully\n");
	    return true;
	  }

	  public boolean removeEntry(String email) {
	    int index = getEntryIndexByEmail(email);

	    if (index == -1) {
	      System.out.println("No entry found with given email\n");
	      return false;
	    }

	    this.entries.remove(index);
	    System.out.println("Entry deleted successfully\n");
	    return true;
	  }

	  public int getEntryIndexByEmail(String email) {
	    for (int i = 0; i < this.entries.size(); i++) {
	      if (this.entries.get(i).getEmailAddress().equals(email)) {
	        return i;
	      }
	    }
	    return -1;
	  }

	  public List<Entry> searchForAnEntry(String searchType, String searchQuery) {
	    searchQuery = searchQuery.strip();
	    if (searchType.equals("firstName")) {
	      return searchByFirstName(searchQuery);
	    } else if (searchType.equals("lastName")) {
	      return searchByLastName(searchQuery);
	    } else if (searchType.equals("phoneNumber")) {
	      return searchByPhone(searchQuery);
	    } else {
	      return searchByEmail(searchQuery);
	    }
	  }

	  private List<Entry> searchByFirstName(String firstName) {
	    List<Entry> ans = new ArrayList<>();
	    for (Entry entry : this.entries) {
	      if (entry.getFirstName().contains(firstName)) {
	        ans.add(entry);
	      }
	    }
	    return ans;
	  }

	  private List<Entry> searchByLastName(String lastName) {
	    List<Entry> ans = new ArrayList<>();
	    for (Entry entry : this.entries) {
	      if (entry.getLastName().contains(lastName)) {
	        ans.add(entry);
	      }
	    }
	    return ans;
	  }

	  private List<Entry> searchByPhone(String phone) {
	    List<Entry> ans = new ArrayList<>();
	    for (Entry entry : this.entries) {
	      if (entry.getPhoneNumber().contains(phone)) {
	        ans.add(entry);
	      }
	    }
	    return ans;
	  }

	  private List<Entry> searchByEmail(String email) {
	    for (Entry entry : this.entries) {
	      if (entry.getEmailAddress().equals(email)) {
	        return Arrays.asList(entry);
	      }
	    }
	    return new ArrayList<>();
	  }

	  public void printAddressBook() {
	    if (this.entries.size() == 0) System.out.println("Address book is empty.");
	    else {
	      System.out.println("Printing Entries in Address Book:");
	      System.out.println(this.toString());
	    }
	    System.out.println();
	  }

	  public void deleteAddressBook() {
	    this.entries.clear();
	    System.out.println("Address book deleted\n");
	  }

	  @Override
	  public String toString() {
	    StringJoiner sj = new StringJoiner("\n");
	    for (Entry entry : this.entries) {
	      sj.add(entry.toString());
	    }
	    return sj.toString();
	  }
	}

	  

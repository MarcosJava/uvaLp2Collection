package br.com.mrcsfelipe.collections.model;

import java.util.Comparator;

public class Person {
	
	private String name;

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Person(String name) {
		super();
		this.name = name;
	}



	public static Comparator<Person> StuNameComparator = new Comparator<Person>() {

		public int compare(Person p1, Person p2) {
		   String personName = p1.getName().toUpperCase();
		   String personName2 = p2.getName().toUpperCase();

		   //ascending order
		   return personName.compareTo(personName2);

		   //descending order
		   //return personName2.compareTo(personName);
	    }
	};
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	


	
	

}

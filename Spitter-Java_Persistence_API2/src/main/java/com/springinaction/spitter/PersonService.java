package com.springinaction.spitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonService {

	private PersonDao personDao;

	public PersonDao getPersonDao() {
		return personDao;
	}
	@Autowired
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public void addPerson(Person person) {
		getPersonDao().insert(person);
	}

	public List<Person> fetchAllPersons() {
		return getPersonDao().selectAll();
	}
}

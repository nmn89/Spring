package com.springorm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.entities.Person;

public class PersonDao {
	
	
	private HibernateTemplate hibernateTemplate;
	
	//save person
	@Transactional
	public String insert(Person person) {
		String i=(String) this.hibernateTemplate.save(person);
		return i;
	}
	
	//get single data(object)
	//no transactional needed when we get data
	public Person getperson(String personName) {
		Person person=this.hibernateTemplate.get(Person.class, personName);
		return person;
	}
	
	//get all data
	//no transactional needed when we get data
	public List<Person> getAllPerson(){
		List<Person> persons = this.hibernateTemplate.loadAll(Person.class);
		return persons;
	}
	
	//delete data
	@Transactional
	public void deletePerson(String personName) {
		Person person=this.hibernateTemplate.get(Person.class, personName);
		this.hibernateTemplate.delete(person);
	}
	
	//updating data
	@Transactional
	public void updatePerson(Person person) {
		this.hibernateTemplate.update(person);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}

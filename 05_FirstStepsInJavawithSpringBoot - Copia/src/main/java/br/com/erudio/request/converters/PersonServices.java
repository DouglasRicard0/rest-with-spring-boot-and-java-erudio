package br.com.erudio.request.converters;

import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());


    public List<Person> findAll() {
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person create(Person person) {
        logger.info("Creating one Person! ");
        return person;
    }

    public Person update(Person person) {
        logger.info("Update one Person! ");
        return person;
    }

    public void delete(String id) {
        logger.info("Deleting one Person! ");

    }

    public Person findById(String id) {
        logger.info("Fidding one Person! ");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Douglas");
        person.setLastName("Ricardo");
        person.setAddress("Igarapé - MG");
        person.setGender("Male");
        return person;
    }

    private Person mockPerson(int i) {
        logger.info("Fidding all Peoples");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("First Name: " + i);
        person.setLastName("Last Name: " + i);
        person.setAddress("Adress: " + i);
        person.setGender("Male");

        return person;
    }


}





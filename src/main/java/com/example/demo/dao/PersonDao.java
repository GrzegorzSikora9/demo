package com.example.demo.dao;

import com.example.demo.model.Person;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface  PersonDao {

    int insertPerson(UUID id, Person person);

    default int insertPerson (Person person) {
        UUID id = UUID.randomUUID();
        return  insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}

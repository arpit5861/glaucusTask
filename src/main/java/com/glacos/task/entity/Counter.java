package com.glacos.task.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * @author Arpit Aggarwal
 * Entity class for table representation in database
 */
@Entity
public class Counter {

    /**
     * Primary key for table
     */
    @Id
    private Long id;
    /**
     * Counter value, upon multiple thread perform operation concurrently
     */
    private Long counter;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCounter() {
        return counter;
    }

    public void setCounter(Long counter) {
        this.counter = counter;
    }
}

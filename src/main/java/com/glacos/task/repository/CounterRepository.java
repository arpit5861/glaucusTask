package com.glacos.task.repository;

import com.glacos.task.entity.Counter;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import java.util.Optional;

/**
 * Dao representation
 * @author Arpit Aggarwal
 */
@Repository
public interface CounterRepository extends CrudRepository<Counter, Long> {
    /**
     * This method will fetch row from table counter
     * @param var1 takes primary ket as ID
     * @return return row on basis of provided argument
     */
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Optional<Counter> findById(Long var1);
}

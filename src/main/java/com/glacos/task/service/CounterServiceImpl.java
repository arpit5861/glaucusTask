package com.glacos.task.service;

import com.glacos.task.entity.Counter;
import com.glacos.task.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * Service class for buiness logic
 * @author Arpit Aggarwal
 */
@Service
public class CounterServiceImpl implements CounterService {

    /**
     * Repository class to fetch data
     */
    @Autowired
    private CounterRepository counterRepository;

    /**
     * Perform business logic, increment field counter by 1 each time
     * @return
     */
    @Override
    @Transactional
    public Long incrementCounter() {
            Optional<Counter> byId = counterRepository.findById(1L);
            if (byId.isPresent()) {
                Counter counter = byId.get();
                counter.setCounter(counter.getCounter() + 1);
                return counter.getCounter();
            }

        return null;
       }
}

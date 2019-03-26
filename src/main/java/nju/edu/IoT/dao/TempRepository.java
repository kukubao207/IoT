package nju.edu.IoT.dao;

import nju.edu.IoT.entity.Temp;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TempRepository extends CrudRepository<Temp,Integer> {
    @Query(value = "SELECT * from temp r where r.topic =?1 order by r.id desc limit 30", nativeQuery = true)
    List<Temp> findTempsByTopic(String topic);
}

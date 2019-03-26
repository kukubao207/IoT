package nju.edu.IoT.dao;

import nju.edu.IoT.entity.Temp;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TempRepository extends CrudRepository<Temp,Integer> {
    @Query(value = "SELECT * from F_TEMP r where r.F_TOPIC =?1 order by r.F_ID desc limit 30", nativeQuery = true)
    List<Temp> findTempsByTopic(String topic);
}

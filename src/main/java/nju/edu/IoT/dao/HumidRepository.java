package nju.edu.IoT.dao;

import nju.edu.IoT.entity.Humid;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HumidRepository extends CrudRepository<Humid, Integer> {
    @Query(value = "SELECT * from F_TEMP r where r.F_TOPIC =?1 order by r.F_ID desc limit 30", nativeQuery = true)
    List<Humid> findHumidsByTopic(String topic);
}

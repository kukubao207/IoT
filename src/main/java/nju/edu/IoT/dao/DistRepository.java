package nju.edu.IoT.dao;

import nju.edu.IoT.entity.Dist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistRepository extends CrudRepository<Dist,Integer> {
    @Query(value = "SELECT * from t_dist r where r.f_topic =?1 order by r.f_id desc limit 30", nativeQuery = true)
    List<Dist> findDistsByTopic(String topic);
}

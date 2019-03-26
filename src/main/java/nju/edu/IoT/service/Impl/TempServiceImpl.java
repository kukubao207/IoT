package nju.edu.IoT.service.Impl;

import nju.edu.IoT.dao.TempRepository;
import nju.edu.IoT.entity.Temp;
import nju.edu.IoT.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TempServiceImpl implements TempService {

    @Autowired
    private TempRepository tempRepository;

    @Override
    public void save(Temp temp){
         tempRepository.save(temp);
    }
    @Override
    public List<Temp> get(String topic){
        return tempRepository.findTempsByTopic(topic);
    }

}

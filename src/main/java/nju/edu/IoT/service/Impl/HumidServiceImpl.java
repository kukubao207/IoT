package nju.edu.IoT.service.Impl;

import nju.edu.IoT.dao.HumidRepository;
import nju.edu.IoT.entity.Humid;
import nju.edu.IoT.service.HumidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumidServiceImpl implements HumidService {
    @Autowired
    private HumidRepository humidRepository;
    public List<Humid> findHumidsByTopic(String topic){
        return humidRepository.findHumidsByTopic(topic);
    }
}

package nju.edu.IoT.service.Impl;

import nju.edu.IoT.dao.DistRepository;
import nju.edu.IoT.entity.Dist;
import nju.edu.IoT.service.DistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistServiceImpl implements DistService {

    @Autowired
    private DistRepository distRepository;

    @Override
    public List<Dist> findDistsByTopic(String topic){
        return distRepository.findDistsByTopic(topic);
    }

}

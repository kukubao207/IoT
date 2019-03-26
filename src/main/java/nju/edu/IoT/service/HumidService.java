package nju.edu.IoT.service;

import nju.edu.IoT.entity.Humid;

import java.util.List;

public interface HumidService {
    List<Humid> findHumidsByTopic(String topic);
}

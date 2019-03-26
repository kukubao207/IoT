package nju.edu.IoT.service;

import nju.edu.IoT.entity.Dist;

import java.util.List;

public interface DistService {
    List<Dist> findDistsByTopic(String topic);

}

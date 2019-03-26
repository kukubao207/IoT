package nju.edu.IoT.service;

import nju.edu.IoT.entity.Temp;

import java.util.List;

public interface TempService {
    void save(Temp temp);
    List<Temp> get(String topic);
}

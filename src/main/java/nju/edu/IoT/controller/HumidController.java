package nju.edu.IoT.controller;

import nju.edu.IoT.entity.Humid;
import nju.edu.IoT.entity.Message;
import nju.edu.IoT.entity.Temp;
import nju.edu.IoT.service.HumidService;
import nju.edu.IoT.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(value = "humid")
public class HumidController {
    @Autowired
    private HumidService humidService;

    @GetMapping("/get")
    public Message<List<Humid>> get(String topic){
        List<Humid> humids = humidService.findHumidsByTopic(topic);
        return new Message<>(humids,200,"查询成功");
    }
}

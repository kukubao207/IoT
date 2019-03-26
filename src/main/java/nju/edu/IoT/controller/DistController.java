package nju.edu.IoT.controller;

import nju.edu.IoT.entity.Dist;
import nju.edu.IoT.entity.Message;
import nju.edu.IoT.service.DistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "dist")
public class DistController {
    @Autowired
    private DistService distService;

    @GetMapping("/get")
    public Message<List<Dist>> getDistList(String topic){
        List<Dist> dists = distService.findDistsByTopic(topic);
        return new Message<>(dists,200,"查询成功");
    }


}

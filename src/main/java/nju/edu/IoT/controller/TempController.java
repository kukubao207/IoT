package nju.edu.IoT.controller;

import nju.edu.IoT.entity.Message;
import nju.edu.IoT.entity.Temp;
import nju.edu.IoT.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "temp")
public class TempController {
    @Autowired
    private TempService tempService;

    @PostMapping("/save")
    public void save(String topic,String temp){
        Temp newTemp = new Temp();
        newTemp.setTopic(topic);
        newTemp.setTemp(temp);
        newTemp.setCreateTime(new Timestamp(System.currentTimeMillis()));
        tempService.save(newTemp);
    }

    @GetMapping("/get")
    public Message<List<Temp>> get(String topic){
        List<Temp> temps = tempService.get(topic);
        return new Message<>(temps,200,"查询成功");
    }


}

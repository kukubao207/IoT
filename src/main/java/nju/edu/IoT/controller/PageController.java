package nju.edu.IoT.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin
@RestController
@RequestMapping("/page")
public class PageController {
    @GetMapping("/{topic}")
    public ModelAndView viewOnTV(@PathVariable("topic") String topic) {
        ModelAndView view = new ModelAndView();
        view.setViewName("data");
        view.addObject("topic", topic);
        return view;
    }
}

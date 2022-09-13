package com.scanasksolve.backendbyspringboot.controller;

import com.scanasksolve.backendbyspringboot.pojo.vo.WeatherVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @GetMapping()
    @ResponseBody
    public WeatherVo today() {
        WeatherVo weatherVo = new WeatherVo();
        weatherVo.setDate("溫度");
        weatherVo.setValue("25度C");
        return weatherVo;
    }
}

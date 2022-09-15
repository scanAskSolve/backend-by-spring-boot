package com.scanasksolve.backendbyspringboot.controller;

import com.scanasksolve.backendbyspringboot.pojo.vo.WeatherVo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @GetMapping("/{location}")
    @ResponseBody
    public WeatherVo today(@PathVariable(value = "location") String location) {
        WeatherVo weatherVo = new WeatherVo();
        weatherVo.setDate("溫度");
        weatherVo.setValue("25度C");
        return weatherVo;
    }

    @GetMapping("/{location}/{date}")
    @ResponseBody
    public WeatherVo date(@PathVariable(value = "location") String location, @PathVariable(value = "date") String date) {

        WeatherVo weatherVo = new WeatherVo();
        weatherVo.setDate("溫度");
        weatherVo.setValue(date);
        return weatherVo;
    }

    @PostMapping("/{location}")
    @ResponseBody
    public WeatherVo createLocation(@PathVariable(value = "location") String location) {
        // TODO: 2022/9/14 建立 
        WeatherVo weatherVo = new WeatherVo();
        weatherVo.setDate("溫度");
        weatherVo.setValue(location);
        return weatherVo;
    }

    @PutMapping("/{location}")
    @ResponseBody
    public WeatherVo updateLocation(@PathVariable(value = "location") String location) {
        // TODO: 2022/9/14 更新 
        WeatherVo weatherVo = new WeatherVo();
        weatherVo.setDate("溫度");
        weatherVo.setValue(location);
        return weatherVo;
    }

    @DeleteMapping("/{location}")
    @ResponseBody
    public WeatherVo deleteLocation(@PathVariable(value = "location") String location) {
        // TODO: 2022/9/14 刪除至db 
        WeatherVo weatherVo = new WeatherVo();
        weatherVo.setDate("溫度");
        weatherVo.setValue(location);
        return weatherVo;
    }
}

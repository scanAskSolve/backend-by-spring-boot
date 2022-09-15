package com.scanasksolve.backendbyspringboot.pojo.po;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "weather")
public class weatherPo {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 30)
    private String location;

    @Column(length = 3)
    private Integer temperature;

    /**
     * 天氣資訊
     */
    @Column(length = 50)
    private String Wx;
    /**
     * 降雨機率
     */
    @Column(length = 3)
    private Integer pop;
    /**
     * 舒適度
     */
    @Column(length = 50)
    private String CI;

    @Column(length = 3)
    private Integer MaxTemperature;

    @Column(length = 3)
    private Integer MinTemperature;

    @Column
    private LocalDateTime startTime;

    @Column
    private LocalDateTime endTime;


}

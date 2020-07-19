package com.ryoua.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * * @Author: RyouA
 * * @Date: 2020/7/18
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SystemInfo {
    private Integer id;
    private String ip;
    private Integer user;
    private String mac;
    private String host;
    private String javaVersion;
    private String osName;
    private String osVersion;
    private String username;
    private Object other;
    private String updateTime;
}

package com.itheima.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 包名:com.itheima.entry
 *
 * @author Leevi
 * 日期2020-06-30  15:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Boolean flag;
    private Object result;
    private String message;
}

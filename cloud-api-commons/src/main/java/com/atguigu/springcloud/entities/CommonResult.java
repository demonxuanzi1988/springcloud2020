package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: lx
 * @Date: 2021/4/21 12:44
 * @Description:
 */
@Data
@AllArgsConstructor //自动生成全参数构造函数
@NoArgsConstructor  //自动生成无参数构造函数
public class CommonResult<T>
{
    //404 not_found
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message)
    {
        this(code,message,null);
    }
}

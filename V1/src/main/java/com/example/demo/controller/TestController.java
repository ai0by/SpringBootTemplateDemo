package com.example.demo.controller;

import com.example.demo.entry.ResultBody;
import com.example.demo.exception.BizException;
import com.example.demo.pojo.UserPojo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService serv;

    @ApiOperation(value="查询用户信息", notes="根据UserPojo对象查询用户信息")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "UserPojo")
    @RequestMapping("/myapitest")
    public ResultBody myapitest(@RequestBody UserPojo userPojo) {
        if (userPojo.getId() == null){
            throw  new BizException("-1","用户Id不能为空！"); // 抛出自定义异常
        }
        return serv.test(userPojo);
    }

    // 常用 请求 格式如下
    // @GetMapping("/user")
    // @PostMapping("/user")
    // @DeleteMapping("/user")
    // @PutMapping("/user")

    // 常用Swagger注解
    //    @Api：将类标记为Swagger资源。
    //    @ApiImplicitParam：表示API操作中的单个参数。
    //    @ApiImplicitParams：一个包装器，允许列出多个ApiImplicitParam对象。
    //    @ApiModel：提供有关Swagger模型的其他信息，比如描述POJO对象。
    //    @ApiModelProperty： 添加和操作模型属性的数据。
    //    @ApiOperation： 描述针对特定路径的操作或通常是HTTP方法。
    //    @ApiParam： 为操作参数添加其他元数据。
    //    @ApiResponse： 描述操作的可能响应。
    //    @ApiResponses： 一个包装器，允许列出多个ApiResponse对象。
    //    @Authorization： 声明要在资源或操作上使用的授权方案。
    //    @AuthorizationScope： 描述OAuth2授权范围。
    //    @ResponseHeader： 表示可以作为响应的一部分提供的标头。
    //    @ApiProperty： 描述POJO对象中的属性值。
    //    @ApiError ： 接口错误所返回的信息
}

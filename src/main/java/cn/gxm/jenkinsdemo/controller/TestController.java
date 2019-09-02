package cn.gxm.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GXM www.guokangjie.cn
 * @date 2019/8/30
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "ok";
    }
}

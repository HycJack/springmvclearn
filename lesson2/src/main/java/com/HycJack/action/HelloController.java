package com.HycJack.action;

import org.springframework.web.bind.annotation.*;

/**
 * <p></p>
 *
 * @param
 * @author huangyicao 2017/9/8 11:23
 * @return
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017/9/8
 * @modify by reason:{原因}
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello (@RequestParam String name){
        return "Hello" + name ;
    }

    @RequestMapping(value = "/error",method = RequestMethod.GET)
    public String error() throws Exception{
        throw new Exception("发生错误1");
    }

    @RequestMapping(value = "/jsonError",method = RequestMethod.GET)
    public String jsonError() throws Exception{
        throw new Exception("发生错误2");
    }
}

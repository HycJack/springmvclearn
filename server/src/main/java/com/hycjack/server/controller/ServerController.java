package com.hycjack.server.controller;

import com.hycjack.server.domain.Server;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 服务器监控
 *
 * @author hyc
 */
@Controller
@RequestMapping("/monitor/server")
public class ServerController {
    private String prefix = "monitor/server";

    @GetMapping()
    public String server(ModelMap mmap) throws Exception {
        Server server = new Server();
        server.copyTo();
        mmap.put("server", server);
        return "server";
    }
}

package com.HycJack.user.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by huangyicao on 2017/7/13.
 */
@Controller
public class ApidocAction {
    @RequestMapping(value="/apidocs", method = RequestMethod.GET)
    public String toApidocs() {
        return "redirect:/apidoc/index.html";
    }
}

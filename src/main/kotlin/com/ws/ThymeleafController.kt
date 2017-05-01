package com.ws

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by wwx on 17-5-1.
 */
@Controller
class ThymeleafController {

    @RequestMapping("thy")
    fun helloThy(map: ModelMap): String{
        map.addAttribute("hello","hello thymeleaf!!")

        return "thy"
    }
}
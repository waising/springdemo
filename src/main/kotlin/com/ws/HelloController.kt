package com.ws

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by wwx on 17-4-28.
 */
@RestController
class HelloController {

    @RequestMapping("/")
    fun hello(): String {
        return "hello world!"
    }
}

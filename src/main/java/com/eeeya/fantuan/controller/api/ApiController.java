package com.eeeya.fantuan.controller.api;

import com.eeeya.fantuan.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ben@eeeya.com
 * @since 4/16/15
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    AppConfig appConfig;

    @RequestMapping(value = "/app/config.json", method = RequestMethod.GET)
    AppConfig getAppConfig() {
        return appConfig;
    }

}

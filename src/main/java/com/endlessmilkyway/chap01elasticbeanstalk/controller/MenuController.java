package com.endlessmilkyway.chap01elasticbeanstalk.controller;

import com.endlessmilkyway.chap01elasticbeanstalk.dto.MenuDTO;
import com.endlessmilkyway.chap01elasticbeanstalk.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MenuController {

    private final MenuService service;

    @GetMapping("/health")
    public String healthCheck() {

        return "cloud health check!!";
    }

    @GetMapping("/menus/{menuCode}")
    public MenuDTO findByMenuCode(@PathVariable("menuCode") int menuCode) {

        return service.findByMenuCode(menuCode);
    }
}

package com.endlessmilkyway.chap01elasticbeanstalk.service;

import com.endlessmilkyway.chap01elasticbeanstalk.dto.MenuDTO;
import com.endlessmilkyway.chap01elasticbeanstalk.entity.Menu;
import com.endlessmilkyway.chap01elasticbeanstalk.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository repository;
    private final ModelMapper modelMapper;

    public MenuDTO findByMenuCode(int menuCode) {

        Menu foundMenu = repository.findById(menuCode).orElseThrow(IllegalArgumentException::new);

        return modelMapper.map(foundMenu, MenuDTO.class);
    }
}

package com.endlessmilkyway.chap01elasticbeanstalk.repository;

import com.endlessmilkyway.chap01elasticbeanstalk.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {
}

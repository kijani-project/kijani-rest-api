package com.kijani.restapi.repository;

import com.kijani.restapi.model.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<Demo, Long> {}

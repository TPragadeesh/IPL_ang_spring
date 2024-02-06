package com.example.cricket;

import com.example.cricket.entity.Manager;
import com.example.cricket.service.ManagerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ActiveProfiles("test")
public class JUnitExampleTest {

    @Autowired
    ManagerService managerService;

    @Test
    public void demoTestMethod() {

        var manager = managerService.findManager("Chennai Super Kings", "password1");

        Assertions.assertNotNull(manager);

    }
}

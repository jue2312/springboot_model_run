package com.jue;

import com.jue.domain.Model;
import com.jue.service.impl.ModelServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootModelApplicationTests {

    @Autowired
    private ModelServiceImpl modelService;
    @Test
    void textSave() {

        Model model=new Model();
        model.setModelParameter("1s1");
        model.setJar("22");
        model.setName("444");
        model.setBusinessInformation("122221");
        model.setOutputSourceRule("454dsa");
        model.setInputSourceRule("cxzc");
        model.setJarDriver("454dsa");
        modelService.save(model);
    }

    @Test
    void testGetAll() {
        modelService.list().forEach(System.out::println);
    }
}

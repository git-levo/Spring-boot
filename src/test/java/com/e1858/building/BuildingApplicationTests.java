package com.e1858.building;

import com.e1858.building.dao.UserMapper;
import com.e1858.building.models.User;
import com.e1858.building.utils.DbUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
//测试注解
@AutoConfigureMockMvc
@WebAppConfiguration
public class BuildingApplicationTests {
    private MockMvc mvc;
    @Autowired
    private WebApplicationContext context;

    @Before
    public void setupMockMvc() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }
    @Test
    public void contextLoads() {
    }

    @Test
    public void testMabtis() {
        SqlSession session = DbUtil.getSession();
        User user = session.selectOne("com.e1858.building.dao.UserMapper.findUserById", 1);
        System.out.println(user.toString());
    }
    @Test
    public void say(){
        try {
            mvc.perform(MockMvcRequestBuilders.get("/"))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(MockMvcResultMatchers.content().string("Hello! Spring boot ."));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

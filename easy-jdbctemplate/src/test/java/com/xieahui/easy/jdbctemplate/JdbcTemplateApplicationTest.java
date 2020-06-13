package com.xieahui.easy.jdbctemplate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/13
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class JdbcTemplateApplicationTest {

    private MockMvc mockMvc;

    @Resource
    private WebApplicationContext applicationContext;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(applicationContext).build();
    }

    @Test
    public void testSaveUser() throws Exception {
        String url = "/u/save";
        mockMvc.perform(MockMvcRequestBuilders
                .post(url)
                .accept(MediaType.APPLICATION_JSON)
                .param("id", "1")
                .param("name", "刘华清")
                .param("sex", "男"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void testListUser() throws Exception {
        String url = "/u/list";
        mockMvc.perform(MockMvcRequestBuilders
                .get(url)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void testSaveStudent() throws Exception {
        String url = "/s/save";
        mockMvc.perform(MockMvcRequestBuilders
                .post(url)
                .accept(MediaType.APPLICATION_JSON)
                .param("id", "1")
                .param("name", "刘清华")
                .param("sex", "男"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void testListStudent() throws Exception {
        String url = "/s/list";
        mockMvc.perform(MockMvcRequestBuilders
                .get(url)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }
}

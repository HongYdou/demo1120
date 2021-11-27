package com.example.demo1120.Controller;

import com.alibaba.fastjson.JSON;
import com.example.demo1120.Bean.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@WebAppConfiguration
class HelloControllerTest {

    public MockMvc mockMvc;

    @Autowired
    protected WebApplicationContext wac;


    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void TestGet() throws Exception {
        MultiValueMap params = new LinkedMultiValueMap();
        params.add("name", "hello");
        params.add("age", "1");
        mockMvc.perform(
                get("/hello")//请求方式和请求路径
//                .param("name","hello")//参数1
//                .param("age","1")//参数2
                        .params(params)//用MultiValueMap传入多个参数
        )
                .andExpect(status().isOk())//返回状态码校验
                .andExpect(content().string("hello1"))//返回字符串校验
                .andDo(print())//返回请求报文和返回报文
                .andReturn();//返回MvcResult

    }


    @Test
    public void TestPost() throws Exception {
        Student student = Student.init("xiaoming", 11, "12345");
        mockMvc.perform(
                post("/hello")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(JSON.toJSONString(student))
        ).andExpect(status().isOk())
                .andExpect(content().string(student.toString()))
                .andDo(print())
                .andReturn();
    }
    @Test
    public void tst(){
        Student xiaoming = new Student().in("xiaoming", 11, "12345");
        System.out.println(xiaoming);
    }
}
package com.zhl.ali.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhl.springcloud2020.common.entities.Order;
import lombok.val;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
/**
 * OrderController Tester.
 *
 * @author <Authors name>
 * @since <pre>2?? 6, 2022</pre>
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderControllerTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void before() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @After
    public void after() throws Exception {
    }

    //@Test
    //public void testSavePayment() throws Exception {
    //    String str = JSONObject.toJSONString(new Payment("bbbbb"));
    //mockMvc.perform(MockMvcRequestBuilders.post("/payment/create").contentType(MediaType.APPLICATION_JSON).content(str)).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();
    //}

    /**
     *
     * Method: orderProduct(@RequestBody Order order)
     *
     */
    @Test
    public void testOrderProduct() throws Exception {
        val order = new Order(1,1, 10, 10, 10);
        final val str = JSONObject.toJSONString(order);
        mockMvc.perform(MockMvcRequestBuilders.post("/order/product").contentType(MediaType.APPLICATION_JSON).content(str)).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();
    }


}

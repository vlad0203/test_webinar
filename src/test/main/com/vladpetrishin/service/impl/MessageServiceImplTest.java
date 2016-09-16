package test.main.com.vladpetrishin.service.impl;

import main.com.vladpetrishin.service.MessageService;
import main.com.vladpetrishin.service.impl.MessageServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Влад on 8/27/2016.
 */
public class MessageServiceImplTest {
    MessageService service;
    @Before
    public void init()
    {
        service = new MessageServiceImpl();
    }
    @Test
    public void getGreetings() throws Exception {
        String name = "Vlad";
        String expected = "Hello Vlad! How are you?";

        String actual = service.getGreetings(name);
        Assert.assertEquals(expected, actual);
    }


}
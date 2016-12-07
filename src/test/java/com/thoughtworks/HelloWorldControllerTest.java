package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldControllerTest {

  @Autowired
  private HelloWorldController sut;

  @Test
  public void hello() throws Exception {
    //Assert.assertEquals("Hello World! How are you?", sut.hello());
    assertThat(sut.hello(), is("Hello World! How are you tomorrow?"));
  }

}


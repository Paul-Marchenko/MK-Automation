package com.test.app.tests.app;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by pavel on 8/19/17.
 */
public class DemoTest {
    @Test
    public  void test1(){
        assertThat(1+1, equalTo(2));
        Assertions.assertThat(1+1).isEqualTo(2);

    }
}

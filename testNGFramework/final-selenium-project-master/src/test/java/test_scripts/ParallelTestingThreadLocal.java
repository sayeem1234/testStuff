package test_scripts;

import org.testng.annotations.Test;

public class ParallelTestingThreadLocal extends BaseTest {


    @Test
    public void test1() throws InterruptedException {
        getDriver().get("https://www.youtube.com/watch?v=Ov08vT8UTqY");

    }


    @Test
    public void test2() throws InterruptedException {
        getDriver().get("https://www.facebook.com/");

    }






}

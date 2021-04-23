//package test_scripts;
//
//import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class creatingNewWindows extends DriverWrapper{
//
//    private void switchToWindow(int index) {
//        List<String> windows = new ArrayList<>(getDriver().getWindowHandles()); //getting the window id's and making a string array with each window id as an element
//        //each window corresponds to an id - > string
//        getDriver().switchTo().window(windows.get(index));
//    }
//
//        //this method closes all current windows and switch to the root window(kepes root window open)
//        private void switchToRootWindow() {
//        List<String> windows = new ArrayList<>(getDriver().getWindowHandles());
//            for(int i =1; i < windows.size(); i ++){     //all windows  EXCEPT the root window(i = 0 not included bc need root window open)
//                getDriver().switchTo().window(windows.get(i));//for all windows other than the root window , nagivate to the window and close it.
//                getDriver().close(); //closes all windows where i>0(excludes root window)
//                //switching to all windows and closing them one by one
//
//            }
//
//            //now go to the root window once all windows are closed
//            getDriver().switchTo().window(windows.get(0)); // switches back to the root window
//    }
//
//
//
//    @Test
//    public void testWindow() throws InterruptedException {
//        getDriver().findElement(By.cssSelector("#privacy-link")).click();
//        Thread.sleep(3000);
//        switchToWindow(1);  //switch to the new window after clicking it
//        Thread.sleep(3000);
//        getDriver().findElement(By.linkText("Sign Up")).click();
//        Thread.sleep(3000);
//        switchToRootWindow();     //closing the window and switching to the root
//        Thread.sleep(3000);
//
//
//        //getDriver().switchTo().frame("dfadfadsfasd");
//        //getDriver().findElement(By.by).click;
//        //getDriver().switchTo().alert().accept();
//        // or .alert().dismiss();
//
//
//
//
//    }
//
//}

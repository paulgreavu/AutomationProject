package pages.switchTo;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import pages.BasePage;

public class Window extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(Window.class);
    private static Window instance;

    private Window(){}

    public static Window getInstance(){
        if (instance == null){
            instance = new Window();
        }
        return instance;
    }

    public void switchToNewTabWindow(){
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.switchTo().window(originalWindow);
    }


}

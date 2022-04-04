package pages.switchTo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class Frame extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(Frame.class);
    private static Frame instance;

    private Frame(){}

    public static Frame getInstance(){
        if (instance == null){
            instance = new Frame();
        }
        return instance;
    }
}

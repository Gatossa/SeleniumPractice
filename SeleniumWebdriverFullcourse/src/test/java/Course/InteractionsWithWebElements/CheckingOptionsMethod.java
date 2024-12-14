package Course.InteractionsWithWebElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckingOptionsMethod {

    public boolean checkOptionsInDropDownMenu(String optionsText, WebElement element) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();

        for (WebElement option : options) {
            if (option.getText().equals(optionsText))
                return true;
        }
        return false;

    }
}

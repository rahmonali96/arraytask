package uz.epam.arraytask.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NumberValidator {
    private static final Logger logger = LogManager.getLogger(NumberValidator.class);
    public boolean isNumber(String number) {
        boolean isNumber = true;
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            logger.info("{} is not number", number);
            isNumber = false;
        }
        return isNumber;
    }
}

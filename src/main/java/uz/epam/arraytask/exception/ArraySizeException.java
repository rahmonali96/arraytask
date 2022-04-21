package uz.epam.arraytask.exception;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySizeException extends IllegalArgumentException{
    private static final Logger logger = LogManager.getLogger(ArraySizeException.class);
    public ArraySizeException(String s) {
        super(s);
        logger.log(Level.ERROR, s);
    }
}

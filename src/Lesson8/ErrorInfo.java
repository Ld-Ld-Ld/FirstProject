package Lesson8;

public class ErrorInfo {
    String msgs[] = {
            "Output Error",
            "Input Error",
            "No available space on the disk",
            "Index Out of Range"
    };

    int howBad[]={3,3,2,4};

    Err getErrorInfo (int i) {
        if (i>=0 & i<msgs.length)
            return new Err(msgs[i], howBad[i]);
        else
            return new Err("Nonexistent Error Type", 0);
    }
}

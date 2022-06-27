package Lesson8;

public class ErrorMessageDemo {
    public static void main(String[] args) {

        ErrorMessage em=new ErrorMessage();

        System.out.println(em.getErrorMessage(2));
        System.out.println(em.getErrorMessage(19));

        ErrorInfo err = new ErrorInfo();
        Err e;

        e=err.getErrorInfo(2);
        System.out.println(e.msg + "level" + e.severity);


    }
}

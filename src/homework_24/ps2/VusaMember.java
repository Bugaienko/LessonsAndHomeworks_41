package homework_24.ps2;
/*
@date 19.02.2024
@author Sergey Bugaienko
*/

public abstract class VusaMember {

    private final String currency;

    private double courseBTC;

    public VusaMember(String currency) {
        this.currency = currency;
        setActualBtcCourse();
    }

    public void setActualBtcCourse() {
        // запрос на сервер платежной системы.
        // получение актуального курса и присвоение его в поле courseBtc
        this.courseBTC = 30_000;
    }

    public String getCurrency() {
        return currency;
    }

    public double getCourseBTC() {
        return courseBTC;
    }

    public void setCourseBTC(double courseBTC) {
        this.courseBTC = courseBTC;
    }
}

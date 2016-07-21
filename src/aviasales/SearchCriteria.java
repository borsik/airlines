package aviasales;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by laptop on 21.07.2016.
 */

public class SearchCriteria {
    String dept;
    String arv;
    Date dateDept;
    Date dateArv;
    private LocalDate depDate;

    public SearchCriteria(String newDept, String newArv, Date newDateDept, Date newDateArv){
        dept = newDept;
        arv = newArv;
        dateDept = newDateDept;
        dateArv = newDateArv;
    }

    public String getDep() {
    }

    public String getArr() {
        return arr;
    }

    public LocalDate getDepDate() {
        return depDate;
    }

    public int getClinetsCount() {
        return clinetsCount;
    }
}

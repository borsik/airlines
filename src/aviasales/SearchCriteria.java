package aviasales;

import java.util.Date;

/**
 * Created by laptop on 21.07.2016.
 */

public class SearchCriteria {
    String dept;
    String arv;
    Date dateDept;
    Date dateArv;
    public SearchCriteria(String newDept, String newArv, Date newDateDept, Date newDateArv){
        dept = newDept;
        arv = newArv;
        dateDept = newDateDept;
        dateArv = newDateArv;
    }
}

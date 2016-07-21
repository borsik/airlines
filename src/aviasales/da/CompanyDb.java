package aviasales.da;

import aviasales.domain.Company;

/**
 * Created by laptop on 21.07.2016.
 */
public interface CompanyDb {
    Company getCompanyByName(String name);
}

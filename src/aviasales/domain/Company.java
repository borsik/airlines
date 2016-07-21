package aviasales.domain;

/**
 * Created by laptop on 21.07.2016.
 */
public class Company {

    private String companyName;

    public Company(String companyName){
        this.setCompanyName(companyName);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

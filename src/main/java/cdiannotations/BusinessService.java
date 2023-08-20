package cdiannotations;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
@Named
public class BusinessService {

    private DataService dataService;

    public DataService getDataService() {
        return dataService;
    }

    //@Autowired
    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter injection");
        this.dataService = dataService;
    }
}

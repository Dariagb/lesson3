import java.util.List;

public class Controller {
    private ServiceFlow serviceFlow;
    public Controller(ServiceFlow serviceFlow){
        this.serviceFlow =serviceFlow;
    }
    public void sorting(){
        serviceFlow.sorting();
    }
    public void sortservis(List<ServiceFlow>sortstr){
        serviceFlow.sort(sortstr);
    }
}

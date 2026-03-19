package Week06Lab.Question2AdaptorProxy;

public class Adaptor4New implements JobService {
    LegacyHR legacyHR;
    public Adaptor4New(LegacyHR legacyHR) {
        this.legacyHR = legacyHR;
    }

    @Override
    public void assign(String employee, String task) {
        legacyHR.giveTask(employee, task);
    }
}

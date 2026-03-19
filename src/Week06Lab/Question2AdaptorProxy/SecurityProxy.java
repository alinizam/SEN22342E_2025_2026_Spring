package Week06Lab.Question2AdaptorProxy;

import java.lang.reflect.InvocationHandler;

public class SecurityProxy implements JobService{
    JobService jobService;
    public SecurityProxy(JobService jobService) {
        this.jobService = jobService;
    }
    void checkUsernameAndPassword(String employee, String task){
        if (employee.equals("Admin") && task.equals("Admin")){
            System.out.println("You are an Admin");
        }else {

            System.out.println("You are not an Admin");
            throw new RuntimeException("You are not an Admin");
        }
    }

    @Override
    public void assign(String employee, String task) {
        //proxy method
        checkUsernameAndPassword(employee, task);
        jobService.assign(employee, task);
    }
}

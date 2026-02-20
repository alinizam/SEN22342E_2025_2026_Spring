package Week02Theory.Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeStore {
    Map<String, Student> students=new HashMap<>();
    public PrototypeStore() {
        students.put("SE", new Student("", "", 1, "EN"));
        students.put("CE", new Student("", "", 2, "Turkish"));
    }

    public Student getStudents(String key ) {
        try {
            return  (Student)students.get(key).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

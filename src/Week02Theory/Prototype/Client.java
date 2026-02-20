package Week02Theory.Prototype;

public class Client {
    static void main() {
        PrototypeStore store = new PrototypeStore();
        Student s=store.getStudents("SE");

        s.setFirstName("Ahmet");
        s.setLastName("AK");
        System.out.println(s.getFirstName()+""+s.getLastName()+" "+s.getDepartmentID()+"-"+s.getEducationLanguage());
        Student s2=store.getStudents("SE");
        s2.setFirstName("Mehmet");
        s2.setLastName("AKOğlu");

        System.out.println(s2.getFirstName()+""+s2.getLastName()+" "+s2.getDepartmentID()+"-"+s2.getEducationLanguage());
        Student s1=store.getStudents("CE");
        System.out.println(s1.getDepartmentID()+"-"+s1.getEducationLanguage());
    }
}

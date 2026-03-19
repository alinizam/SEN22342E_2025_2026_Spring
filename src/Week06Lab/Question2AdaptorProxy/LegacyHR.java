package Week06Lab.Question2AdaptorProxy;

class LegacyHR {

    public void giveTask(String emp, String t) {
        System.out.println("Legacy system: " + t + " -> " + emp);
    }
}
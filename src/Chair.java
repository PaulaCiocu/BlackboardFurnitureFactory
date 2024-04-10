import java.util.*;

class Chair{
    private String name;
    private Map<String, Boolean> tasks = new HashMap<>();

    public Chair(String type) {
        this.name = type;
        initializeTasks();
    }

    private void initializeTasks() {
        tasks.put("Cut Seat", false);
        tasks.put("Assemble Feet", false);
        tasks.put("Assemble Backrest", false);
        tasks.put("Assemble Stabilizer Bar", false);
        tasks.put("Package Chair", false);
    }

    public String getName() {
        return name;
    }

    public Map<String, Boolean> getTasks() {
        return new HashMap<>(tasks);
    }

    public void setTaskStatus(String task, boolean status) {
        tasks.put(task, status);
    }
}



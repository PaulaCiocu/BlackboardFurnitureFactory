import java.util.Map;

public class AssembleFeetEmployee implements Employees {

    @Override
    public void action(Blackboard blackboard) {
        Chair chair;
        chair = blackboard.getAvailableChair("Assemble Feet");
        if (chair != null && checkCondition(chair)) {
            chair.setTaskStatus("Assemble Feet", true);
            System.out.println("Feet added to " + chair.getName());
        }

    }

    @Override
    public boolean checkCondition(Chair chair) {
        Map<String, Boolean> tasks = chair.getTasks();
        return tasks.get("Cut Seat") && !tasks.get("Package Chair") && !tasks.get("Assemble Stabilizer Bar");
    }
}

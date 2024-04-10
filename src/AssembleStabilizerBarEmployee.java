import java.util.Map;

public class AssembleStabilizerBarEmployee implements Employees {

    @Override
    public void action(Blackboard blackboard) {
        Chair chair;
        chair = blackboard.getAvailableChair("Assemble Stabilizer Bar");
        if (chair != null && checkCondition(chair)) {
            chair.setTaskStatus("Assemble Stabilizer Bar", true);
            System.out.println("Stabilizer added for " + chair.getName());
        }

    }

    @Override
    public boolean checkCondition(Chair chair) {
        Map<String, Boolean> tasks = chair.getTasks();
        return tasks.get("Cut Seat") && !tasks.get("Package Chair") && tasks.get("Assemble Feet");
    }

}

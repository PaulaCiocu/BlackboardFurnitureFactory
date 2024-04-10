import java.util.Map;

public class CutSeatEmployee implements Employees {

    @Override
    public void action(Blackboard blackboard) {
        Chair chair;
        chair = blackboard.getAvailableChair("Cut Seat");
        if (chair != null && checkCondition(chair)) {
            chair.setTaskStatus("Cut Seat", true);
            System.out.println("Seat cut for " + chair.getName());
        }
    }

    @Override
    public boolean checkCondition(Chair chair) {
        // Check the conditions for cutting the seat
        // You may need to modify this based on your specific conditions
        Map<String, Boolean> tasks = chair.getTasks();
        return !tasks.get("Assemble Backrest") &&
                !tasks.get("Assemble Feet") &&
                !tasks.get("Assemble Stabilizer Bar") &&
                !tasks.get("Package Chair");
    }

}

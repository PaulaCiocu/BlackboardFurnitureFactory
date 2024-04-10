import java.sql.SQLOutput;
import java.util.Map;

public class PackageChairEmployee implements Employees {

    @Override
    public void action(Blackboard blackboard) {
        Chair chair;
        chair = blackboard.getAvailableChair("Package Chair");
        if (chair != null && checkCondition(chair)) {
            chair.setTaskStatus("Package Chair", true);
            System.out.println("Package assembled for chair " + chair.getName());
            System.out.println("Chair finished!");
            blackboard.deleteChair(chair);
        }
    }

    @Override
    public boolean checkCondition(Chair chair) {
        Map<String, Boolean> tasks = chair.getTasks();
        return tasks.get("Assemble Backrest") &&
                tasks.get("Assemble Feet") &&
                tasks.get("Assemble Stabilizer Bar") &&
                tasks.get("Cut Seat");
    }

}

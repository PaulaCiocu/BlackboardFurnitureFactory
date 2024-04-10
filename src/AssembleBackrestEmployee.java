import java.util.Map;

public class AssembleBackrestEmployee implements Employees{


    @Override
    public void action(Blackboard blackboard) {
        Chair chair;
        chair=blackboard.getAvailableChair("Assemble Backrest");
        if ( chair!=null && checkCondition(chair) ) {
            chair.setTaskStatus("Assemble Backrest",true);
            System.out.println("Back added to "+chair.getName());
        }

    }

    @Override
    public boolean checkCondition(Chair chair) {
        Map<String, Boolean> tasks = chair.getTasks();
        return tasks.get("Cut Seat") && !tasks.get("Package Chair");
    }
}


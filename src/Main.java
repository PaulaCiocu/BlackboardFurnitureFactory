import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Chair chair1=new Chair("Chair1");
        Chair chair2=new Chair("Chair2");
        Chair chair3=new Chair("Chair3");

        Blackboard blackboard =new Blackboard();
        ArrayList<Employees> employees_List=new ArrayList<>();

        blackboard.attachChair(chair1);
        blackboard.attachChair(chair2);
        blackboard.attachChair(chair3);

        Employees cutSeatEmployee=new CutSeatEmployee();
        Employees assembleBackrestEmployee=new AssembleBackrestEmployee();
        Employees assembleFeetEmployee=new AssembleFeetEmployee();
        Employees assembleStabilizerBarEmployee=new AssembleStabilizerBarEmployee();
        Employees packageChairEmployee=new PackageChairEmployee();


        employees_List.add(packageChairEmployee);
        employees_List.add(assembleStabilizerBarEmployee);
        employees_List.add(assembleBackrestEmployee);
        employees_List.add(assembleFeetEmployee);
        employees_List.add(cutSeatEmployee);

        while(blackboard!=null){
            for(Employees e:employees_List){
                e.action(blackboard);
            }
        }


    }
}
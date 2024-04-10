import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class Blackboard {
    private List<Chair> furnitureItems = new ArrayList<>();

    public void attachChair(Chair item) {
        furnitureItems.add(item);
    }
    public void deleteChair(Chair item){
        furnitureItems.remove(item);
    }
    public Chair getAvailableChair(String task) {
        List<Chair> availableChairs = furnitureItems.stream()
                .filter(chair -> !chair.getTasks().get(task))
                .collect(Collectors.toList());

        if (!availableChairs.isEmpty()) {
            return availableChairs.get(new Random().nextInt(availableChairs.size()));
        }
        return null;
    }
}
import java.util.*;
public class ToyStore {
    private ArrayList<Toy> toyList = new ArrayList<>();
    public ToyStore(String ts) {
        loadToys(ts);
    }
	
    public Toy getThatToy(String title) {
        for(Toy t : toyList) {
            if(t.getName().equals(title)) {
                return t;
            }
        }
        return null;
    }
	
    public String getMostFrequentToy() {
        String name = "";
        int max = Integer.MIN_VALUE;
        for(Toy t : toyList) {
            if(max < t.getCount()) {
                max = t.getCount();
                name = t.getName();
            }
        }
        return name;
    }
	
    public String getMostFrequentType() {
        int cars = 0, figures = 0;
        for(Toy t : toyList) {
            if(t.getType().equals("Car")) {
                cars++;
            }
            else if(t.getType().equals("Action Figure")) {
                figures++;
            }
        }
        if(cars > figures) {
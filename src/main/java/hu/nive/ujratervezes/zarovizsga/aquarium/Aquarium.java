package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aquarium {

    private List<Fish> aquarium = new ArrayList<>();

    public void addFish(Fish fish){
        aquarium.add(fish);
    }

    public void feed(){
        for (Fish fish : aquarium) {
            fish.feed();
        }
    }

    public void removeFish(){
        Fish fish;
        Iterator<Fish> iterator = aquarium.iterator();
        while(iterator.hasNext()){
            fish = iterator.next();
            if (fish.getWeight() >= 11){
                iterator.remove();
            }
        }
    }

    public List<String > getStatus(){
        List<String> result = new ArrayList<>();
        String s;
        for (Fish fish : aquarium){
            s = fish.status();
            result.add(s);
        }
        return result;
    }

}

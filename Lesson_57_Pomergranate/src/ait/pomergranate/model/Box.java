package ait.pomergranate.model;

import ait.pomergranate.model.Pomergranate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Box implements Iterable<Pomergranate> {
    private String name;
    private List<Pomergranate> pomergranates;

    public Box(String name, int numPomergranates) {
        this.name = name;
        pomergranates = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numPomergranates; i++) {
            int numSeeds = random.nextInt(301) + 400; // Random quantity of seeds (range from 400 to 700)
            pomergranates.add(new Pomergranate(numSeeds));
        }
    }

    @Override
    public Iterator<Pomergranate> iterator() {
        return pomergranates.iterator();
    }

    public String getName() {
        return name;
    }
}

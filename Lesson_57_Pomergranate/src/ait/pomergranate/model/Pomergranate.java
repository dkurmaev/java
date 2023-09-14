package ait.pomergranate.model;

import ait.pomergranate.model.Seed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pomergranate implements Iterable<Seed> {
    private List<Seed> seeds;

    public Pomergranate(int numSeeds) {
        seeds = new ArrayList<>();
        for (int i = 0; i < numSeeds; i++) {
            seeds.add(new Seed());
        }
    }
    @Override
    public Iterator<Seed> iterator() {
        return seeds.iterator();
    }
}

package com.imp.CompanyInterview.Yelp;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Businesses {
    String name;
    String location;
    Integer id;


}

class Chain {
    String name;
    Integer frequency;
}

public class interview {
    public List<Chain> merge(List<Businesses> businesses, String location) {
        List<Businesses> b = businesses.stream()
                .filter(s -> s.location.equals(location))
                .distinct()
                .collect(Collectors.toList());

        Map<Object, Long> r = b.stream()
                .collect(Collectors.groupingBy(g -> g.id, Collectors.counting()));

        List<Chain> ch = r.entrySet()
                .stream()
                .map(e -> {
                    Chain c = new Chain();
                    c.name = e.getKey().toString();
                    c.frequency = Math.toIntExact(e.getValue());
                    return c;
                })
                .collect(Collectors.toList());

        return ch;
    }
}

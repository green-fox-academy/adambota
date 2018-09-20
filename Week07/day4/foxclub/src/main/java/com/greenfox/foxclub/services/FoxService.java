package com.greenfox.foxclub.services;

import com.greenfox.foxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
    private List<Fox> foxList;

    public FoxService() {
        this.foxList = new ArrayList<>();
    }

    public void addFox(String name) {
        foxList.add(new Fox(name));
    }

    public Fox getFox(String name) {
        if (foxList.size() > 0) {
            for (int i = 0; i <= foxList.size() -1; i++) {
                if (foxList.get(i).getName().equals(name)) return foxList.get(i);
            }
        }
        return null;
    }
}

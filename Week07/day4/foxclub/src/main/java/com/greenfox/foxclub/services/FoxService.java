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
}

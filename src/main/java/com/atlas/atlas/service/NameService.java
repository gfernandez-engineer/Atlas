package com.atlas.atlas.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public interface NameService {
    public List<String> getNameStartingWith(String letter);
    public List<String> convertNameToUpperCase();

}

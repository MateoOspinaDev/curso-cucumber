package com.mateoospina.app.palabras;

import java.util.List;

public class ContadorCaracteres {

    public int contar(String palabra) {
        return palabra.length();
    }

    public int contar(List<String> palabra) {
        return palabra.stream().mapToInt(String::length).sum();
    }
}

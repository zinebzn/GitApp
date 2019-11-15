package com.company;

// Lire le contenu d'un fichier et le renvoyer dans une chaîne de caractères

import java.io.FileReader;

public class fichier {

    public String getStringFromFile( String path ) throws Exception {
        FileReader reader = new FileReader(path);
        //StringBuilder permet de concaténer des chaînes de caractères de manière optimisée, sans synchronisation
        StringBuilder stringBuilder = new StringBuilder();
        char[] b = new char[5];
        int n;
        while ((n = reader.read(b)) > 0) {
            //offset :The index of the first char to append. len:The number of characters to append.
            stringBuilder.append(b, 0, n);
        }
        return stringBuilder.toString();
    }

    public fichier() {
    }
}

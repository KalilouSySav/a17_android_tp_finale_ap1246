package com.example.projetguideville.utils;

import android.content.pm.PackageManager;
import android.os.Environment;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SQLQueryParser {

    public static List<String> extractQueries() {
        String sqlString = SQLString.getRawQuery();
        List<String> queries = new ArrayList<>();
        Pattern pattern = Pattern.compile("--[^;]+;|\\bINSERT INTO[^;]+;");
        Matcher matcher = pattern.matcher(sqlString);

        while (matcher.find()) {
            String query = matcher.group();
            // Supprime les commentaires et les espaces inutiles de chaque requête
            query = query.replaceAll("--.*\n", "").trim();
            queries.add(query);
        }

        return queries;
    }
}
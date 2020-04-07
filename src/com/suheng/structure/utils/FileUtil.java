package com.suheng.structure.utils;

import java.io.File;
import java.util.List;

public class FileUtil {

    public static void listFiles(File file, List<String> pathList) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isDirectory()) {
                        listFiles(f, pathList);
                    } else {
                        pathList.add(file.getPath());
                    }
                }
            }
        } else {
            pathList.add(file.getPath());
        }
    }

}

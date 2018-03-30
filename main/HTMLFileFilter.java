package main;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class HTMLFileFilter extends FileFilter {
    @Override
    public boolean accept(File f) {
        boolean result = false;
        if (f.isDirectory() || f.getName().toLowerCase().endsWith(".html") || f.getName().toLowerCase().endsWith(".htm")){
            result = true;
        }
        return result;
    }

    @Override
    public String getDescription() {
        return "HTML и HTM файлы";
    }
}

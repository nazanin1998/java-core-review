package org.negah;

import java.io.File;

public abstract class FolderHandler {
    public boolean createFolderAndItsParents(String completePath) {
        File file = new File(completePath);
        return file.mkdirs();
    }

    public boolean createOnlyOneFolder(String completePath) {
        File file = new File(completePath);
        return file.mkdir();
    }
}

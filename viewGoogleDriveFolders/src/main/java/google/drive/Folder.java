package google.drive;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private final String htmlResponse;

    public Folder(String htmlResponse) {
        this.htmlResponse = htmlResponse;
    }

    public List<String> files() {
        return fileJson(htmlResponse);
    }

    private List<String> fileJson(String htmlData) {
        List<String> filesList = new ArrayList<String>();
        for (String str : htmlData.split("viewerItems")[1].split("\"")) {
            if (str.contains("https") && !str.contains("\\")) {
                filesList.add(str);
            }
        }
        return filesList;
    }
}

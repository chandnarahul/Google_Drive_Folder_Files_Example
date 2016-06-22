package http.get;

import google.drive.Folder;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertFalse;

public class HttpTest {
    /*
    * Please see pic 001 and 002 on how to create a folder
    * and
    * then how to get the folder URL.
    *
    * Once the folder is created please upload your files inside the folder and then run the test case    *
    * */
    private static final String GOOGLE_DRIVE_FOLDER_VIEW_ONLY_URL = "https://drive.google.com/folderview?id=0B0liICfCXE61QWJrQ2JSc1BKS0U";

    @Test
    public void should_connect_to_google_drive_and_return_files_in_folder() throws IOException {
        Folder folder = new Folder(Http.get(GOOGLE_DRIVE_FOLDER_VIEW_ONLY_URL));
        assertFalse(folder.files().isEmpty());
    }
}
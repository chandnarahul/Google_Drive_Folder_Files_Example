package google.drive;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class FolderTest {

    @Test
    public void should_return_list_of_files_in_google_drive_folder() {
        Folder folder = new Folder(sampleResponse());
        assertFalse(folder.files().isEmpty());
    }

    private String sampleResponse() {
        return "viewerItems: [[,,\"0460.jpg\",\"https://lh5.googleusercontent.com/uIfYXcOwGC5aWlQsZEAY0m64gj0Pe_h1A2zGVngW80sUujyLTrulOYlbNVaavtwMl-VByw\",\"https://lh5.googleusercontent.com/uIfYXcOwGC5aWlQsZEAY0m64gj0Pe_h1A2zGVngW80sUujyLTrulOYlbNVaavtwMl-VByw\\u003dw1600\",,,\"0B0liICfCXE61cy1hcTJTZVYtaTg\",,\"0B0liICfCXE61cy1hcTJTZVYtaTg\",,,\"image/jpeg\",,,0,,\"https://drive.google.com/file/d/0B0liICfCXE61cy1hcTJTZVYtaTg/view?usp\\u003ddrive_web\",,,,3] ,[,,\"8.png\",\"https://lh5.googleusercontent.com/cK61R8YaPBoorvHTvRxmV3gGudeVaXAVhfrr-5bgmyb_pQ4BKdIueIpXsYf-dfHWKAHPnA\",\"https://lh5.googleusercontent.com/cK61R8YaPBoorvHTvRxmV3gGudeVaXAVhfrr-5bgmyb_pQ4BKdIueIpXsYf-dfHWKAHPnA\\u003dw1600\",,,\"0B0liICfCXE61Um5aWFQwc21NcHM\",,\"0B0liICfCXE61Um5aWFQwc21NcHM\",,,\"image/png\",,,0,,\"https://drive.google.com/file/d/0B0liICfCXE61Um5aWFQwc21NcHM/view?usp\\u003ddrive_web\",,,,3] ,[,,\"Selection_002.jpg\",\"https://lh5.googleusercontent.com/r6Nc3DVLlwIA8dIe-CBkJGcRniF0BrNhzcfk6OTb-EIqtAdZFsdhnduqhrzARR-TdoOqUA\",\"https://lh5.googleusercontent.com/r6Nc3DVLlwIA8dIe-CBkJGcRniF0BrNhzcfk6OTb-EIqtAdZFsdhnduqhrzARR-TdoOqUA\\u003dw1600\",,,\"0B0liICfCXE61ZUpaUVZnWmU5Tkk\",,\"0B0liICfCXE61ZUpaUVZnWmU5Tkk\",,,\"image/jpeg\",,,0,,\"https://drive.google.com/file/d/0B0liICfCXE61ZUpaUVZnWmU5Tkk/view?usp\\u003ddrive_web\",,,,3] ] ,};";
    }
}
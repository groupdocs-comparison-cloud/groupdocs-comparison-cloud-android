/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 * Copyright (c) 2003-2021 Aspose Pty Ltd
 * </copyright>
 * <summary>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */
package com.groupdocs.cloud.comparison.api;

import com.groupdocs.cloud.comparison.model.requests.ObjectExistsRequest;
import com.groupdocs.cloud.comparison.model.requests.DeleteFolderRequest;
import com.groupdocs.cloud.comparison.model.requests.UploadFileRequest;
import com.groupdocs.cloud.comparison.model.ObjectExist;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.groupdocs.cloud.comparison.client.ApiException;
import com.groupdocs.cloud.comparison.client.Configuration;
import com.groupdocs.cloud.comparison.client.JSON;
import com.groupdocs.cloud.comparison.model.ChangeInfo;
import com.groupdocs.cloud.comparison.model.FileInfo;
import com.groupdocs.cloud.comparison.model.ItemsStyle;
import com.groupdocs.cloud.comparison.model.Settings;
import com.groupdocs.cloud.comparison.model.ComparisonOptions;
import com.groupdocs.cloud.comparison.model.UpdatesOptions;
import com.groupdocs.cloud.comparison.model.ChangeInfo.ComparisonActionEnum;
import com.groupdocs.cloud.comparison.model.Settings.CloneMetadataEnum;
import com.groupdocs.cloud.comparison.model.Settings.DetailsLevelEnum;
import com.groupdocs.cloud.comparison.model.Settings.PasswordSaveOptionEnum;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;

/**
 * API tests for ComparisonApi
 */
public class BaseApiTest
{
    protected InfoApi infoApi;
    protected CompareApi compareApi;
    protected ReviewApi reviewApi;
    protected StorageApi storageApi;
    protected FileApi fileApi;
    protected FolderApi folderApi;

    public BaseApiTest()
    {
        super();

        Configuration configuration = new Configuration(Config.AppSID, Config.AppKey);
        configuration.setApiBaseUrl(Config.ApiBaseUrl);

        infoApi = new InfoApi(configuration);
        compareApi = new CompareApi(configuration);
        reviewApi = new ReviewApi(configuration);
        storageApi = new StorageApi(configuration);
        fileApi = new FileApi(configuration);
        folderApi = new FolderApi(configuration);
    }

    private static boolean setUpIsDone = false;

    @Before
    public void setUp() throws ApiException, FileNotFoundException
    {

        if (setUpIsDone)
        {
            return;
        }

        for (TestFile file : TestFiles.TestFilesList())
        {

            ObjectExist response = storageApi.objectExists(new ObjectExistsRequest(file.getPath(), null, null));
            if (!response.getExists())
            {
                File fileObj = getTestFile(file);
                fileApi.uploadFile(new UploadFileRequest(file.getPath(), fileObj, null));
            }
        }

        setUpIsDone = true;
    }

    @After
    public void cleanup() throws ApiException
    {
        removeTempFiles();
    }

    private void removeTempFiles() throws ApiException
    {
        deleteFolderFromStorage("comparison");
    }

    private void deleteFolderFromStorage(String folderName) throws ApiException
    {
        folderApi.deleteFolder(new DeleteFolderRequest(folderName, null, true));
    }

    public File getTestFile(TestFile testFile) throws FileNotFoundException
    {
        Path filePath = Paths.get("resources", testFile.getFolder(), testFile.getFileName());
        File file = filePath.toFile();
        if (!file.exists())
        {
            throw new FileNotFoundException(file.getAbsolutePath());
        }

        return file;
    }

    public File toJsonFile(Object obj) throws IOException
    {
        JSON json = new JSON();
        String content = json.serialize(obj);

        File file = File.createTempFile("java", ".json");
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
        fileWriter.write(content);
        fileWriter.close();

        return file;
    }

    // base method for prepare options
    protected ComparisonOptions GetComparisonOptions(TestFile sourceFile, List<TestFile> targetFiles)
    {
        ComparisonOptions comparisonOptions = new ComparisonOptions();
        comparisonOptions.setSourceFile(sourceFile.ToFileInfo());

        List<FileInfo> tarFiles = new ArrayList<>();
        for (TestFile f : targetFiles)
        {
            tarFiles.add(f.ToFileInfo());
        }
        comparisonOptions.setTargetFiles(tarFiles);

        Settings settings = new Settings();
        settings.setGenerateSummaryPage(Boolean.TRUE);
        settings.setShowDeletedContent(Boolean.TRUE);
        settings.setStyleChangeDetection(Boolean.TRUE);
        settings.setUseFramesForDelInsElements(Boolean.FALSE);
        settings.setCalculateComponentCoordinates(Boolean.FALSE);
        settings.setDetailsLevel(DetailsLevelEnum.LOW);
        settings.setCloneMetadata(CloneMetadataEnum.DEFAULT);
        settings.setPassword("1111");
        settings.setPasswordSaveOption(PasswordSaveOptionEnum.USER);

        ItemsStyle deletedItemsStyle = new ItemsStyle();
        deletedItemsStyle.setBeginSeparatorString("");
        deletedItemsStyle.setEndSeparatorString("");
        deletedItemsStyle.setFontColor("16711680");
        deletedItemsStyle.setHighlightColor("16711680");
        deletedItemsStyle.setBold(Boolean.FALSE);
        deletedItemsStyle.setItalic(Boolean.FALSE);
        deletedItemsStyle.setStrikeThrough(Boolean.FALSE);

        ItemsStyle insertedItemsStyle = new ItemsStyle();
        insertedItemsStyle.setBeginSeparatorString("");
        insertedItemsStyle.setEndSeparatorString("");
        insertedItemsStyle.setFontColor("255");
        insertedItemsStyle.setHighlightColor("255");
        insertedItemsStyle.setBold(Boolean.FALSE);
        insertedItemsStyle.setItalic(Boolean.FALSE);
        insertedItemsStyle.setStrikeThrough(Boolean.FALSE);

        ItemsStyle styleChangedItemsStyle = new ItemsStyle();
        styleChangedItemsStyle.setBeginSeparatorString("");
        styleChangedItemsStyle.setEndSeparatorString("");
        styleChangedItemsStyle.setFontColor("65280");
        styleChangedItemsStyle.setHighlightColor("65280");
        styleChangedItemsStyle.setBold(Boolean.FALSE);
        styleChangedItemsStyle.setItalic(Boolean.FALSE);
        styleChangedItemsStyle.setStrikeThrough(Boolean.FALSE);

        comparisonOptions.setSettings(settings);
        return comparisonOptions;
    }
    
    // base method for prepare updates options
    protected UpdatesOptions GetComparisonOptionsUpdates(TestFile sourceFile, List<TestFile> targetFiles)
    {
        UpdatesOptions comparisonOptions = new UpdatesOptions();
        comparisonOptions.setSourceFile(sourceFile.ToFileInfo());

        List<FileInfo> tarFiles = new ArrayList<>();
        for (TestFile f : targetFiles)
        {
            tarFiles.add(f.ToFileInfo());
        }
        comparisonOptions.setTargetFiles(tarFiles);

        List<ChangeInfo> changes = new ArrayList<>();

        ChangeInfo acceptInfo = new ChangeInfo();
        acceptInfo.setId(0);
        acceptInfo.setComparisonAction(ComparisonActionEnum.ACCEPT);

        ChangeInfo rejectInfo = new ChangeInfo();
        rejectInfo.setId(1);
        rejectInfo.setComparisonAction(ComparisonActionEnum.REJECT);

        changes.add(acceptInfo);
        changes.add(rejectInfo);

        comparisonOptions.setChanges(changes);

        Settings settings = new Settings();
        settings.setGenerateSummaryPage(Boolean.TRUE);
        settings.setShowDeletedContent(Boolean.TRUE);
        settings.setStyleChangeDetection(Boolean.TRUE);
        settings.setUseFramesForDelInsElements(Boolean.FALSE);
        settings.setCalculateComponentCoordinates(Boolean.FALSE);
        settings.setDetailsLevel(DetailsLevelEnum.LOW);
        settings.setCloneMetadata(CloneMetadataEnum.DEFAULT);
        settings.setPassword("1111");
        settings.setPasswordSaveOption(PasswordSaveOptionEnum.USER);

        ItemsStyle deletedItemsStyle = new ItemsStyle();
        deletedItemsStyle.setBeginSeparatorString("");
        deletedItemsStyle.setEndSeparatorString("");
        deletedItemsStyle.setFontColor("16711680");
        deletedItemsStyle.setHighlightColor("16711680");
        deletedItemsStyle.setBold(Boolean.FALSE);
        deletedItemsStyle.setItalic(Boolean.FALSE);
        deletedItemsStyle.setStrikeThrough(Boolean.FALSE);

        ItemsStyle insertedItemsStyle = new ItemsStyle();
        insertedItemsStyle.setBeginSeparatorString("");
        insertedItemsStyle.setEndSeparatorString("");
        insertedItemsStyle.setFontColor("255");
        insertedItemsStyle.setHighlightColor("255");
        insertedItemsStyle.setBold(Boolean.FALSE);
        insertedItemsStyle.setItalic(Boolean.FALSE);
        insertedItemsStyle.setStrikeThrough(Boolean.FALSE);

        ItemsStyle styleChangedItemsStyle = new ItemsStyle();
        styleChangedItemsStyle.setBeginSeparatorString("");
        styleChangedItemsStyle.setEndSeparatorString("");
        styleChangedItemsStyle.setFontColor("65280");
        styleChangedItemsStyle.setHighlightColor("65280");
        styleChangedItemsStyle.setBold(Boolean.FALSE);
        styleChangedItemsStyle.setItalic(Boolean.FALSE);
        styleChangedItemsStyle.setStrikeThrough(Boolean.FALSE);

        comparisonOptions.setSettings(settings);
        return comparisonOptions;
    }
}

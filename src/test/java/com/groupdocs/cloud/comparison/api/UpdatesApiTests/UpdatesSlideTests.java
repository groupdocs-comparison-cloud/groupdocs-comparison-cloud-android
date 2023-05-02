/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 * Copyright (c) 2003-2023 Aspose Pty Ltd
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
package com.groupdocs.cloud.comparison.api.UpdatesApiTests;

import com.groupdocs.cloud.comparison.api.BaseApiTest;
import com.groupdocs.cloud.comparison.api.TestFiles;
import com.groupdocs.cloud.comparison.client.ApiException;
import com.groupdocs.cloud.comparison.model.UpdatesOptions;
import com.groupdocs.cloud.comparison.model.Link;
import com.groupdocs.cloud.comparison.model.requests.PutChangesDocumentRequest;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UpdatesSlideTests extends BaseApiTest
{

    @Test
    public void updatesSlide() throws ApiException
    {
        UpdatesOptions comparisonOptions = GetComparisonOptionsUpdates(TestFiles.SourceSlide, Arrays.asList(TestFiles.TargetSlide));
        comparisonOptions.setOutputPath("/resultFilePath/result.pptx");
        PutChangesDocumentRequest request = new PutChangesDocumentRequest(comparisonOptions);
        Link link = compareApi.putChangesDocument(request);
        assertEquals(link.getRel(), "/resultFilePath/result.pptx");
    }

    @Test
    public void updatesSlidePassword() throws ApiException
    {
        UpdatesOptions comparisonOptions = GetComparisonOptionsUpdates(TestFiles.SourceSlideProtected, Arrays.asList(TestFiles.TargetSlideProtected));
        comparisonOptions.setOutputPath("/resultFilePath/result.pptx");
        PutChangesDocumentRequest request = new PutChangesDocumentRequest(comparisonOptions);
        Link link = compareApi.putChangesDocument(request);
        assertEquals(link.getRel(), "/resultFilePath/result.pptx");
    }

    @Test
    public void updatesSlideMulti() throws ApiException
    {
        UpdatesOptions comparisonOptions = GetComparisonOptionsUpdates(TestFiles.SourceSlide,
                Arrays.asList(
                        TestFiles.TargetSlide,
                        TestFiles.TargetSlide1,
                        TestFiles.TargetSlide2));
        comparisonOptions.setOutputPath("/resultFilePath/result.pptx");
        PutChangesDocumentRequest request = new PutChangesDocumentRequest(comparisonOptions);
        Link link = compareApi.putChangesDocument(request);
        assertEquals(link.getRel(), "/resultFilePath/result.pptx");
    }

    @Test
    public void updatesSlideMultiPassword() throws ApiException
    {
        UpdatesOptions comparisonOptions = GetComparisonOptionsUpdates(TestFiles.SourceSlideProtected,
                Arrays.asList(
                        TestFiles.TargetSlideProtected,
                        TestFiles.TargetSlide1Protected,
                        TestFiles.TargetSlide2Protected));
        comparisonOptions.setOutputPath("/resultFilePath/result.pptx");
        PutChangesDocumentRequest request = new PutChangesDocumentRequest(comparisonOptions);
        Link link = compareApi.putChangesDocument(request);
        assertEquals(link.getRel(), "/resultFilePath/result.pptx");
    }
}

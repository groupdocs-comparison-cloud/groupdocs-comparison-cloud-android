/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 * Copyright (c) 2003-2020 Aspose Pty Ltd
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

import com.groupdocs.cloud.comparison.client.ApiException;
import com.groupdocs.cloud.comparison.model.UpdatesOptions;
import com.groupdocs.cloud.comparison.model.Link;
import com.groupdocs.cloud.comparison.model.requests.PutChangesDocumentRequest;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UpdatesWordTests extends BaseApiTest
{

    @Test
    public void updatesWord() throws ApiException
    {
        UpdatesOptions comparisonOptions = GetComparisonOptionsUpdates(TestFiles.SourceWord, Arrays.asList(TestFiles.TargetWord));
        comparisonOptions.setOutputPath("/resultFilePath/result.docx");
        PutChangesDocumentRequest request = new PutChangesDocumentRequest(comparisonOptions);
        Link link = compareApi.putChangesDocument(request);
        assertEquals(link.getRel(), "/resultFilePath/result.docx");
    }

    @Test
    public void updatesWordPassword() throws ApiException
    {
        UpdatesOptions comparisonOptions = GetComparisonOptionsUpdates(TestFiles.SourceWordProtected, Arrays.asList(TestFiles.TargetWordProtected));
        comparisonOptions.setOutputPath("/resultFilePath/result.docx");
        PutChangesDocumentRequest request = new PutChangesDocumentRequest(comparisonOptions);
        Link link = compareApi.putChangesDocument(request);
        assertEquals(link.getRel(), "/resultFilePath/result.docx");
    }

    @Test
    public void updatesWordMulti() throws ApiException
    {
        UpdatesOptions comparisonOptions = GetComparisonOptionsUpdates(TestFiles.SourceWord,
                Arrays.asList(
                        TestFiles.TargetWord,
                        TestFiles.TargetWord1,
                        TestFiles.TargetWord2));
        comparisonOptions.setOutputPath("/resultFilePath/result.docx");
        PutChangesDocumentRequest request = new PutChangesDocumentRequest(comparisonOptions);
        Link link = compareApi.putChangesDocument(request);
        assertEquals(link.getRel(), "/resultFilePath/result.docx");
    }

    @Test
    public void updatesWordMultiPassword() throws ApiException
    {
        UpdatesOptions comparisonOptions = GetComparisonOptionsUpdates(TestFiles.SourceWordProtected,
                Arrays.asList(
                        TestFiles.TargetWordProtected,
                        TestFiles.TargetWord1Protected,
                        TestFiles.TargetWord2Protected));
        comparisonOptions.setOutputPath("/resultFilePath/result.docx");
        PutChangesDocumentRequest request = new PutChangesDocumentRequest(comparisonOptions);
        Link link = compareApi.putChangesDocument(request);
        assertEquals(link.getRel(), "/resultFilePath/result.docx");
    }
}

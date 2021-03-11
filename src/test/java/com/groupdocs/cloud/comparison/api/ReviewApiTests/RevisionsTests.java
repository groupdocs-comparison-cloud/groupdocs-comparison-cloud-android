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
package com.groupdocs.cloud.comparison.api.ReviewApiTests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.groupdocs.cloud.comparison.api.BaseApiTest;
import com.groupdocs.cloud.comparison.api.TestFiles;
import com.groupdocs.cloud.comparison.client.ApiException;
import com.groupdocs.cloud.comparison.model.*;
import com.groupdocs.cloud.comparison.model.RevisionInfo.ActionEnum;
import com.groupdocs.cloud.comparison.model.requests.ApplyRevisionsRequest;
import com.groupdocs.cloud.comparison.model.requests.GetRevisionsRequest;

import org.junit.Test;


public class RevisionsTests extends BaseApiTest
{
    @Test
    public void getRevisions() throws ApiException
    {
        List<RevisionInfo> response = reviewApi.getRevisions(new GetRevisionsRequest(TestFiles.SourceWithRevs.ToFileInfo()));
        assertEquals(2, response.size());
    }

    @Test
    public void applyRevisions() throws ApiException
    {
        ApplyRevisionsOptions options = new ApplyRevisionsOptions();
        options.setSourceFile(TestFiles.SourceWithRevs.ToFileInfo());
        options.setOutputPath("/resultFilePath/result.docx");
        List<RevisionInfo> revisions = new ArrayList<>();
        RevisionInfo revision1 = new RevisionInfo();
        revision1.setId(0);
        revision1.setAction(ActionEnum.ACCEPT);
        revisions.add(revision1);
        RevisionInfo revision2 = new RevisionInfo();
        revision2.setId(1);
        revision2.setAction(ActionEnum.REJECT);
        revisions.add(revision2);
        options.setRevisions(revisions);

        Link response = reviewApi.applyRevisions(new ApplyRevisionsRequest(options));
        assertEquals(options.getOutputPath(), response.getRel());
    } 
    
    @Test
    public void acceptAllRevisions() throws ApiException
    {
        ApplyRevisionsOptions options = new ApplyRevisionsOptions();
        options.setSourceFile(TestFiles.SourceWithRevs.ToFileInfo());
        options.setOutputPath("/resultFilePath/result.docx");
        options.setAcceptAll(true);

        Link response = reviewApi.applyRevisions(new ApplyRevisionsRequest(options));
        assertEquals(options.getOutputPath(), response.getRel());
    }    
    
    @Test
    public void rejectAllRevisions() throws ApiException
    {
        ApplyRevisionsOptions options = new ApplyRevisionsOptions();
        options.setSourceFile(TestFiles.SourceWithRevs.ToFileInfo());
        options.setOutputPath("/resultFilePath/result.docx");
        options.setRejectAll(true);

        Link response = reviewApi.applyRevisions(new ApplyRevisionsRequest(options));
        assertEquals(options.getOutputPath(), response.getRel());
    }          
}

/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 * Copyright (c) Aspose Pty Ltd
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
package com.groupdocs.cloud.comparison.api.ChangesApiTests;

import com.groupdocs.cloud.comparison.api.BaseApiTest;
import com.groupdocs.cloud.comparison.api.TestFiles;
import com.groupdocs.cloud.comparison.client.ApiException;
import com.groupdocs.cloud.comparison.model.ChangeInfo;
import com.groupdocs.cloud.comparison.model.ComparisonOptions;
import com.groupdocs.cloud.comparison.model.requests.PostChangesRequest;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class ChangesWordTests extends BaseApiTest
{
    @Test
    public void changesWord() throws ApiException
    {
        ComparisonOptions comparisonOptions = GetComparisonOptions(TestFiles.SourceWord, Arrays.asList(TestFiles.TargetWord));
        PostChangesRequest request = new PostChangesRequest(comparisonOptions);
        List<ChangeInfo> changeList = compareApi.postChanges(request);
        assertEquals(40, changeList.size());
    }
    
    @Test
    public void changesWordPassword() throws ApiException
    {
        ComparisonOptions comparisonOptions = GetComparisonOptions(TestFiles.SourceWordProtected, Arrays.asList(TestFiles.TargetWordProtected));
        PostChangesRequest request = new PostChangesRequest(comparisonOptions);
        List<ChangeInfo> changeList = compareApi.postChanges(request);
        assertEquals(14, changeList.size());
    }

    @Test
    public void changesWordMulti() throws ApiException
    {
        ComparisonOptions comparisonOptions = GetComparisonOptions(TestFiles.SourceWord, 
                Arrays.asList(
                        TestFiles.TargetWord, 
                        TestFiles.TargetWord1,
                        TestFiles.TargetWord2));
        PostChangesRequest request = new PostChangesRequest(comparisonOptions);
        List<ChangeInfo> changeList = compareApi.postChanges(request);
        assertEquals(77, changeList.size());
    }
    
    @Test
    public void changesWordMultiPassword() throws ApiException
    {
        ComparisonOptions comparisonOptions = GetComparisonOptions(TestFiles.SourceWordProtected, 
                Arrays.asList(
                        TestFiles.TargetWordProtected, 
                        TestFiles.TargetWord1Protected,
                        TestFiles.TargetWord2Protected));
        PostChangesRequest request = new PostChangesRequest(comparisonOptions);
        List<ChangeInfo> changeList = compareApi.postChanges(request);
        assertEquals(32, changeList.size());
    }
}

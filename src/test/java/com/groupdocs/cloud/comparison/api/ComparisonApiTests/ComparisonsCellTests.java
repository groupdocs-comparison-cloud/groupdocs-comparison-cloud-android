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
package com.groupdocs.cloud.comparison.api.ComparisonApiTests;

import com.groupdocs.cloud.comparison.api.BaseApiTest;
import com.groupdocs.cloud.comparison.api.TestFiles;
import com.groupdocs.cloud.comparison.client.ApiException;
import com.groupdocs.cloud.comparison.model.ComparisonOptions;
import com.groupdocs.cloud.comparison.model.Link;
import com.groupdocs.cloud.comparison.model.requests.ComparisonsRequest;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ComparisonsCellTests extends BaseApiTest
{

    @Test
    public void comparisonsCell() throws ApiException
    {
        ComparisonOptions comparisonOptions = GetComparisonOptions(TestFiles.SourceCell, Arrays.asList(TestFiles.TargetCell));
        comparisonOptions.setOutputPath("/resultFilePath/result.xlsx");
        ComparisonsRequest request = new ComparisonsRequest(comparisonOptions);
        Link link = compareApi.comparisons(request);
        assertEquals(link.getRel(), "/resultFilePath/result.xlsx");
    }

    @Test
    public void comparisonsCellPassword() throws ApiException
    {
        ComparisonOptions comparisonOptions = GetComparisonOptions(TestFiles.SourceCellProtected, Arrays.asList(TestFiles.TargetCellProtected));
        comparisonOptions.setOutputPath("/resultFilePath/result.xlsx");
        ComparisonsRequest request = new ComparisonsRequest(comparisonOptions);
        Link link = compareApi.comparisons(request);
        assertEquals(link.getRel(), "/resultFilePath/result.xlsx");
    }
}

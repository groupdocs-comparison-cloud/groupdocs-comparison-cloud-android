///**
// * --------------------------------------------------------------------------------------------------------------------
// * <copyright company="Aspose Pty Ltd">
// * Copyright (c) 2003-2019 Aspose Pty Ltd
// * </copyright>
// * <summary>
// * Permission is hereby granted, free of charge, to any person obtaining a copy
// * of this software and associated documentation files (the "Software"), to deal
// * in the Software without restriction, including without limitation the rights
// * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// * copies of the Software, and to permit persons to whom the Software is
// * furnished to do so, subject to the following conditions:
// *
// * The above copyright notice and this permission notice shall be included in
// * all copies or substantial portions of the Software.
// *
// * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// * SOFTWARE.
// * </summary>
// * --------------------------------------------------------------------------------------------------------------------
// */
//package com.groupdocs.cloud.comparison.api;
//
//import com.groupdocs.cloud.comparison.client.ApiException;
//import com.groupdocs.cloud.comparison.model.ComparisonCategoryChanges;
//import com.groupdocs.cloud.comparison.model.ComparisonOptionsBase;
//import com.groupdocs.cloud.comparison.model.requests.PostCategoryChangesRequest;
//import java.util.Arrays;
//import java.util.List;
//import static org.junit.Assert.assertEquals;
//import org.junit.Ignore;
//import org.junit.Test;
//
//public class CategoryChangesCellTests extends BaseApiTest
//{
//    @Test
//    public void categoryCellByType() throws ApiException
//    {
//        ComparisonOptionsBase comparisonOptions = GetComparisonOptions(TestFiles.SourceCell, Arrays.asList(TestFiles.TargetCell));
//        comparisonOptions.setOutputPath("/resultFilePath/result.xlsx");
//        comparisonOptions.setCategoryType("ByTypeChanged");
//        PostCategoryChangesRequest request = new PostCategoryChangesRequest(comparisonOptions);
//        List<ComparisonCategoryChanges> changeList = comparisonApi.postCategoryChanges(request);
//        assertEquals(1, changeList.size());
//    }
//    
//    @Test @Ignore("Fixed in Comparison 19.4")
//    public void categoryCellByTypePassword() throws ApiException
//    {
//        ComparisonOptionsBase comparisonOptions = GetComparisonOptions(TestFiles.SourceCellProtected, Arrays.asList(TestFiles.TargetCellProtected));
//        comparisonOptions.setOutputPath("/resultFilePath/result.xlsx");
//        comparisonOptions.setCategoryType("ByTypeChanged");
//        PostCategoryChangesRequest request = new PostCategoryChangesRequest(comparisonOptions);
//        List<ComparisonCategoryChanges> changeList = comparisonApi.postCategoryChanges(request);
//        assertEquals(2, changeList.size());
//    }
//    
//    @Test
//    public void categoryCellByNodeType() throws ApiException
//    {
//        ComparisonOptionsBase comparisonOptions = GetComparisonOptions(TestFiles.SourceCell, Arrays.asList(TestFiles.TargetCell));
//        comparisonOptions.setOutputPath("/resultFilePath/result.xlsx");
//        comparisonOptions.setCategoryType("ByNodeType");
//        PostCategoryChangesRequest request = new PostCategoryChangesRequest(comparisonOptions);
//        List<ComparisonCategoryChanges> changeList = comparisonApi.postCategoryChanges(request);
//        assertEquals(1, changeList.size());
//    }
//    
//    @Test @Ignore("Fixed in Comparison 19.4")
//    public void categoryCellByNodeTypePassword() throws ApiException
//    {
//        ComparisonOptionsBase comparisonOptions = GetComparisonOptions(TestFiles.SourceCellProtected, Arrays.asList(TestFiles.TargetCellProtected));
//        comparisonOptions.setOutputPath("/resultFilePath/result.xlsx");
//        comparisonOptions.setCategoryType("ByNodeType");
//        PostCategoryChangesRequest request = new PostCategoryChangesRequest(comparisonOptions);
//        List<ComparisonCategoryChanges> changeList = comparisonApi.postCategoryChanges(request);
//        assertEquals(2, changeList.size());
//    }
//    
//    @Test
//    public void categoryCellContainsNumbers() throws ApiException
//    {
//        ComparisonOptionsBase comparisonOptions = GetComparisonOptions(TestFiles.SourceCell, Arrays.asList(TestFiles.TargetCell));
//        comparisonOptions.setOutputPath("/resultFilePath/result.xlsx");
//        comparisonOptions.setCategoryType("ContainsNumbers");
//        PostCategoryChangesRequest request = new PostCategoryChangesRequest(comparisonOptions);
//        List<ComparisonCategoryChanges> changeList = comparisonApi.postCategoryChanges(request);
//        assertEquals(1, changeList.size());
//    }
//    
//    @Test @Ignore("Fixed in Comparison 19.4")
//    public void categoryCellContainsNumbersPassword() throws ApiException
//    {
//        ComparisonOptionsBase comparisonOptions = GetComparisonOptions(TestFiles.SourceCellProtected, Arrays.asList(TestFiles.TargetCellProtected));
//        comparisonOptions.setOutputPath("/resultFilePath/result.xlsx");
//        comparisonOptions.setCategoryType("ContainsNumbers");
//        PostCategoryChangesRequest request = new PostCategoryChangesRequest(comparisonOptions);
//        List<ComparisonCategoryChanges> changeList = comparisonApi.postCategoryChanges(request);
//        assertEquals(2, changeList.size());
//    }
//    
//    @Test
//    public void categoryCellOnlyNumbers() throws ApiException
//    {
//        ComparisonOptionsBase comparisonOptions = GetComparisonOptions(TestFiles.SourceCell, Arrays.asList(TestFiles.TargetCell));
//        comparisonOptions.setOutputPath("/resultFilePath/result.xlsx");
//        comparisonOptions.setCategoryType("OnlyNumbers");
//        PostCategoryChangesRequest request = new PostCategoryChangesRequest(comparisonOptions);
//        List<ComparisonCategoryChanges> changeList = comparisonApi.postCategoryChanges(request);
//        assertEquals(1, changeList.size());
//    }
//    
//    @Test @Ignore("Fixed in Comparison 19.4")
//    public void categoryCellOnlyNumbersPassword() throws ApiException
//    {
//        ComparisonOptionsBase comparisonOptions = GetComparisonOptions(TestFiles.SourceCellProtected, Arrays.asList(TestFiles.TargetCellProtected));
//        comparisonOptions.setOutputPath("/resultFilePath/result.xlsx");
//        comparisonOptions.setCategoryType("OnlyNumbers");
//        PostCategoryChangesRequest request = new PostCategoryChangesRequest(comparisonOptions);
//        List<ComparisonCategoryChanges> changeList = comparisonApi.postCategoryChanges(request);
//        assertEquals(1, changeList.size());
//    }
//}

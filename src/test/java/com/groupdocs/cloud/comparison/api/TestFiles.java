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

import java.util.ArrayList;

public class TestFiles
{
    // Source files
    public static TestFile SourceCell = new TestFile("source.xlsx", "source_files\\cell\\");
    public static TestFile SourceDiagram = new TestFile("source.vsdx", "source_files\\diagram\\");
    public static TestFile SourceEmail = new TestFile("source.eml", "source_files\\email\\");
    public static TestFile SourceHtml = new TestFile("source.html", "source_files\\html\\");
    public static TestFile SourceImage = new TestFile("source.png", "source_files\\image\\");
    public static TestFile SourceNote = new TestFile("source.one", "source_files\\note\\");
    public static TestFile SourcePdf = new TestFile("source.pdf", "source_files\\pdf\\");
    public static TestFile SourceSlide = new TestFile("source.pptx", "source_files\\slide\\");
    public static TestFile SourceText = new TestFile("source.txt", "source_files\\text\\");
    public static TestFile SourceWord = new TestFile("source.docx", "source_files\\word\\");
    public static TestFile SourceWithRevs = new TestFile("source_with_revs.docx", "source_files\\word\\");

    // Source protected files
    public static TestFile SourceCellProtected = new TestFile("source_protected.xlsx", "source_files\\cell\\", "1231");
    public static TestFile SourceNoteProtected = new TestFile("source_protected.one", "source_files\\note\\", "123");
    public static TestFile SourcePdfProtected = new TestFile("source_protected.pdf", "source_files\\pdf\\", "12345678");
    public static TestFile SourceSlideProtected = new TestFile("source_protected.pptx", "source_files\\slide\\", "1231");
    public static TestFile SourceWordProtected = new TestFile("source_protected.docx", "source_files\\word\\", "1231");

    // Target files
    public static TestFile TargetCell = new TestFile("target.xlsx", "target_files\\cell\\");
    public static TestFile TargetDiagram = new TestFile("target.vsdx", "target_files\\diagram\\");
    public static TestFile TargetEmail = new TestFile("target.eml", "target_files\\email\\");
    public static TestFile TargetHtml = new TestFile("target.html", "target_files\\html\\");
    public static TestFile TargetImage = new TestFile("target.png", "target_files\\image\\");
    public static TestFile TargetNote = new TestFile("target.one", "target_files\\note\\");
    public static TestFile TargetPdf = new TestFile("target.pdf", "target_files\\pdf\\");
    public static TestFile TargetSlide = new TestFile("target.pptx", "target_files\\slide\\");
    public static TestFile TargetText = new TestFile("target.txt", "target_files\\text\\");
    public static TestFile TargetWord = new TestFile("target.docx", "target_files\\word\\");

    // Target protected files
    public static TestFile TargetCellProtected = new TestFile("target_protected.xlsx", "target_files\\cell\\", "1471");
    public static TestFile TargetNoteProtected = new TestFile("target_protected.one", "target_files\\note\\", "123");
    public static TestFile TargetPdfProtected = new TestFile("target_protected.pdf", "target_files\\pdf\\", "0987654");
    public static TestFile TargetSlideProtected = new TestFile("target_protected.pptx", "target_files\\slide\\", "1471");
    public static TestFile TargetWordProtected = new TestFile("target_protected.docx", "target_files\\word\\", "5784");

    // Additional files
    public static TestFile TargetSlide1 = new TestFile("target_1.pptx", "target_files\\slide\\");
    public static TestFile TargetSlide2 = new TestFile("target_2.pptx", "target_files\\slide\\");
    public static TestFile TargetSlide1Protected = new TestFile("target_1_protected.pptx", "target_files\\slide\\", "1471");
    public static TestFile TargetSlide2Protected = new TestFile("target_2_protected.pptx", "target_files\\slide\\", "1471");
    public static TestFile TargetWord1 = new TestFile("target_1.docx", "target_files\\word\\");
    public static TestFile TargetWord2 = new TestFile("target_2.docx", "target_files\\word\\");
    public static TestFile TargetWord1Protected = new TestFile("target_1_protected.docx", "target_files\\word\\", "5784");
    public static TestFile TargetWord2Protected = new TestFile("target_2_protected.docx", "target_files\\word\\", "5784");

    public static ArrayList<TestFile> TestFilesList()
    {
        ArrayList<TestFile> files = new ArrayList<>();
        files.add(SourceCell);
        files.add(SourceDiagram);
        files.add(SourceEmail);
        files.add(SourceHtml);
        files.add(SourceImage);
        files.add(SourceNote);
        files.add(SourcePdf);
        files.add(SourceSlide);
        files.add(SourceText);
        files.add(SourceWord);
        files.add(SourceCellProtected);
        files.add(SourceNoteProtected);
        files.add(SourcePdfProtected);
        files.add(SourceSlideProtected);
        files.add(SourceWordProtected);
        files.add(TargetCell);
        files.add(TargetDiagram);
        files.add(TargetEmail);
        files.add(TargetHtml);
        files.add(TargetImage);
        files.add(TargetNote);
        files.add(TargetPdf);
        files.add(TargetSlide);
        files.add(TargetText);
        files.add(TargetWord);
        files.add(TargetCellProtected);
        files.add(TargetNoteProtected);
        files.add(TargetPdfProtected);
        files.add(TargetSlideProtected);
        files.add(TargetWordProtected);
        files.add(TargetSlide1);
        files.add(TargetSlide2);
        files.add(TargetSlide1Protected);
        files.add(TargetSlide2Protected);
        files.add(TargetWord1);
        files.add(TargetWord2);
        files.add(TargetWord1Protected);
        files.add(TargetWord2Protected);
        return files;
    }
}

/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ApplyRevisionsOptions.java">
 *   Copyright (c) 2003-2020 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.comparison.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.comparison.model.FileInfo;
import com.groupdocs.cloud.comparison.model.RevisionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Options for apply revisions method
 */
@ApiModel(description = "Options for apply revisions method")
public class ApplyRevisionsOptions {
  @SerializedName("sourceFile")
  private FileInfo sourceFile = null;

  @SerializedName("revisions")
  private List<RevisionInfo> revisions = null;

  @SerializedName("outputPath")
  private String outputPath = null;

  public ApplyRevisionsOptions sourceFile(FileInfo sourceFile) {
    this.sourceFile = sourceFile;
    return this;
  }

   /**
   * Information about source file
   * @return sourceFile
  **/
  @ApiModelProperty(value = "Information about source file")
  public FileInfo getSourceFile() {
    return sourceFile;
  }

  public void setSourceFile(FileInfo sourceFile) {
    this.sourceFile = sourceFile;
  }

  public ApplyRevisionsOptions revisions(List<RevisionInfo> revisions) {
    this.revisions = revisions;
    return this;
  }

  public ApplyRevisionsOptions addRevisionsItem(RevisionInfo revisionsItem) {
    if (this.revisions == null) {
      this.revisions = new ArrayList<RevisionInfo>();
    }
    this.revisions.add(revisionsItem);
    return this;
  }

   /**
   * Revisions to apply or reject.
   * @return revisions
  **/
  @ApiModelProperty(value = "Revisions to apply or reject.")
  public List<RevisionInfo> getRevisions() {
    return revisions;
  }

  public void setRevisions(List<RevisionInfo> revisions) {
    this.revisions = revisions;
  }

  public ApplyRevisionsOptions outputPath(String outputPath) {
    this.outputPath = outputPath;
    return this;
  }

   /**
   * Path to the resultant document (if not specified the document will not be saved)
   * @return outputPath
  **/
  @ApiModelProperty(value = "Path to the resultant document (if not specified the document will not be saved)")
  public String getOutputPath() {
    return outputPath;
  }

  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyRevisionsOptions applyRevisionsOptions = (ApplyRevisionsOptions) o;
    return Objects.equals(this.sourceFile, applyRevisionsOptions.sourceFile) &&
        Objects.equals(this.revisions, applyRevisionsOptions.revisions) &&
        Objects.equals(this.outputPath, applyRevisionsOptions.outputPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceFile, revisions, outputPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyRevisionsOptions {\n");
    
    sb.append("    sourceFile: ").append(toIndentedString(sourceFile)).append("\n");
    sb.append("    revisions: ").append(toIndentedString(revisions)).append("\n");
    sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


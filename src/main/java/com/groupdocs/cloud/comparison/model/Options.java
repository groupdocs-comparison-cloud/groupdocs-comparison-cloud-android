/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Options.java">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
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
import com.groupdocs.cloud.comparison.model.Settings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines comparison options
 */
@ApiModel(description = "Defines comparison options")
public class Options {
  @SerializedName("sourceFile")
  private FileInfo sourceFile = null;

  @SerializedName("targetFiles")
  private List<FileInfo> targetFiles = null;

  @SerializedName("settings")
  private Settings settings = null;

  @SerializedName("outputPath")
  private String outputPath = null;

  public Options sourceFile(FileInfo sourceFile) {
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

  public Options targetFiles(List<FileInfo> targetFiles) {
    this.targetFiles = targetFiles;
    return this;
  }

  public Options addTargetFilesItem(FileInfo targetFilesItem) {
    if (this.targetFiles == null) {
      this.targetFiles = new ArrayList<FileInfo>();
    }
    this.targetFiles.add(targetFilesItem);
    return this;
  }

   /**
   * Information about target file(s)
   * @return targetFiles
  **/
  @ApiModelProperty(value = "Information about target file(s)")
  public List<FileInfo> getTargetFiles() {
    return targetFiles;
  }

  public void setTargetFiles(List<FileInfo> targetFiles) {
    this.targetFiles = targetFiles;
  }

  public Options settings(Settings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Comparison settings
   * @return settings
  **/
  @ApiModelProperty(value = "Comparison settings")
  public Settings getSettings() {
    return settings;
  }

  public void setSettings(Settings settings) {
    this.settings = settings;
  }

  public Options outputPath(String outputPath) {
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
    Options options = (Options) o;
    return Objects.equals(this.sourceFile, options.sourceFile) &&
        Objects.equals(this.targetFiles, options.targetFiles) &&
        Objects.equals(this.settings, options.settings) &&
        Objects.equals(this.outputPath, options.outputPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceFile, targetFiles, settings, outputPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Options {\n");
    
    sb.append("    sourceFile: ").append(toIndentedString(sourceFile)).append("\n");
    sb.append("    targetFiles: ").append(toIndentedString(targetFiles)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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


/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PreviewOptions.java">
 *   Copyright (c) Aspose Pty Ltd
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines preview options
 */
@ApiModel(description = "Defines preview options")
public class PreviewOptions {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

  /**
   * Preview image format
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    JPEG("Jpeg"),
    
    PNG("Png"),
    
    BMP("Bmp");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String text) {
      for (FormatEnum b : FormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("format")
  private FormatEnum format = null;

  @SerializedName("outputFolder")
  private String outputFolder = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("pageNumbers")
  private List<Integer> pageNumbers = null;

  public PreviewOptions fileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

   /**
   * Input file info
   * @return fileInfo
  **/
  @ApiModelProperty(value = "Input file info")
  public FileInfo getFileInfo() {
    return fileInfo;
  }

  public void setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
  }

  public PreviewOptions format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * Preview image format
   * @return format
  **/
  @ApiModelProperty(required = true, value = "Preview image format")
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public PreviewOptions outputFolder(String outputFolder) {
    this.outputFolder = outputFolder;
    return this;
  }

   /**
   * Path to folder with preview results
   * @return outputFolder
  **/
  @ApiModelProperty(value = "Path to folder with preview results")
  public String getOutputFolder() {
    return outputFolder;
  }

  public void setOutputFolder(String outputFolder) {
    this.outputFolder = outputFolder;
  }

  public PreviewOptions width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Preview width
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Preview width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public PreviewOptions height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Preview height
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Preview height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PreviewOptions pageNumbers(List<Integer> pageNumbers) {
    this.pageNumbers = pageNumbers;
    return this;
  }

  public PreviewOptions addPageNumbersItem(Integer pageNumbersItem) {
    if (this.pageNumbers == null) {
      this.pageNumbers = new ArrayList<Integer>();
    }
    this.pageNumbers.add(pageNumbersItem);
    return this;
  }

   /**
   * Page numbers that will be previewed.
   * @return pageNumbers
  **/
  @ApiModelProperty(value = "Page numbers that will be previewed.")
  public List<Integer> getPageNumbers() {
    return pageNumbers;
  }

  public void setPageNumbers(List<Integer> pageNumbers) {
    this.pageNumbers = pageNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviewOptions previewOptions = (PreviewOptions) o;
    return Objects.equals(this.fileInfo, previewOptions.fileInfo) &&
        Objects.equals(this.format, previewOptions.format) &&
        Objects.equals(this.outputFolder, previewOptions.outputFolder) &&
        Objects.equals(this.width, previewOptions.width) &&
        Objects.equals(this.height, previewOptions.height) &&
        Objects.equals(this.pageNumbers, previewOptions.pageNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, format, outputFolder, width, height, pageNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviewOptions {\n");
    
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    outputFolder: ").append(toIndentedString(outputFolder)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    pageNumbers: ").append(toIndentedString(pageNumbers)).append("\n");
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


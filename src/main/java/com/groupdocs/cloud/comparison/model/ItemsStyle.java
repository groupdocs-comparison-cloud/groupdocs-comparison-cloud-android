/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ItemsStyle.java">
 *   Copyright (c) 2003-2022 Aspose Pty Ltd
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ItemsStyle Object fields
 */
@ApiModel(description = "ItemsStyle Object fields")
public class ItemsStyle {
  @SerializedName("fontColor")
  private String fontColor = null;

  @SerializedName("highlightColor")
  private String highlightColor = null;

  @SerializedName("beginSeparatorString")
  private String beginSeparatorString = null;

  @SerializedName("endSeparatorString")
  private String endSeparatorString = null;

  @SerializedName("bold")
  private Boolean bold = null;

  @SerializedName("italic")
  private Boolean italic = null;

  @SerializedName("strikeThrough")
  private Boolean strikeThrough = null;

  @SerializedName("underline")
  private Boolean underline = null;

  public ItemsStyle fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

   /**
   * Font color for changed components
   * @return fontColor
  **/
  @ApiModelProperty(value = "Font color for changed components")
  public String getFontColor() {
    return fontColor;
  }

  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  public ItemsStyle highlightColor(String highlightColor) {
    this.highlightColor = highlightColor;
    return this;
  }

   /**
   * Highlight color for changed components
   * @return highlightColor
  **/
  @ApiModelProperty(value = "Highlight color for changed components")
  public String getHighlightColor() {
    return highlightColor;
  }

  public void setHighlightColor(String highlightColor) {
    this.highlightColor = highlightColor;
  }

  public ItemsStyle beginSeparatorString(String beginSeparatorString) {
    this.beginSeparatorString = beginSeparatorString;
    return this;
  }

   /**
   * Start tag for changed components
   * @return beginSeparatorString
  **/
  @ApiModelProperty(value = "Start tag for changed components")
  public String getBeginSeparatorString() {
    return beginSeparatorString;
  }

  public void setBeginSeparatorString(String beginSeparatorString) {
    this.beginSeparatorString = beginSeparatorString;
  }

  public ItemsStyle endSeparatorString(String endSeparatorString) {
    this.endSeparatorString = endSeparatorString;
    return this;
  }

   /**
   * End tag for changed components
   * @return endSeparatorString
  **/
  @ApiModelProperty(value = "End tag for changed components")
  public String getEndSeparatorString() {
    return endSeparatorString;
  }

  public void setEndSeparatorString(String endSeparatorString) {
    this.endSeparatorString = endSeparatorString;
  }

  public ItemsStyle bold(Boolean bold) {
    this.bold = bold;
    return this;
  }

   /**
   * Bold style for changed components
   * @return bold
  **/
  @ApiModelProperty(required = true, value = "Bold style for changed components")
  public Boolean getBold() {
    return bold;
  }

  public void setBold(Boolean bold) {
    this.bold = bold;
  }

  public ItemsStyle italic(Boolean italic) {
    this.italic = italic;
    return this;
  }

   /**
   * Italic style for changed components
   * @return italic
  **/
  @ApiModelProperty(required = true, value = "Italic style for changed components")
  public Boolean getItalic() {
    return italic;
  }

  public void setItalic(Boolean italic) {
    this.italic = italic;
  }

  public ItemsStyle strikeThrough(Boolean strikeThrough) {
    this.strikeThrough = strikeThrough;
    return this;
  }

   /**
   * Strike through style for changed components
   * @return strikeThrough
  **/
  @ApiModelProperty(required = true, value = "Strike through style for changed components")
  public Boolean getStrikeThrough() {
    return strikeThrough;
  }

  public void setStrikeThrough(Boolean strikeThrough) {
    this.strikeThrough = strikeThrough;
  }

  public ItemsStyle underline(Boolean underline) {
    this.underline = underline;
    return this;
  }

   /**
   * Underline style for changed components
   * @return underline
  **/
  @ApiModelProperty(required = true, value = "Underline style for changed components")
  public Boolean getUnderline() {
    return underline;
  }

  public void setUnderline(Boolean underline) {
    this.underline = underline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemsStyle itemsStyle = (ItemsStyle) o;
    return Objects.equals(this.fontColor, itemsStyle.fontColor) &&
        Objects.equals(this.highlightColor, itemsStyle.highlightColor) &&
        Objects.equals(this.beginSeparatorString, itemsStyle.beginSeparatorString) &&
        Objects.equals(this.endSeparatorString, itemsStyle.endSeparatorString) &&
        Objects.equals(this.bold, itemsStyle.bold) &&
        Objects.equals(this.italic, itemsStyle.italic) &&
        Objects.equals(this.strikeThrough, itemsStyle.strikeThrough) &&
        Objects.equals(this.underline, itemsStyle.underline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontColor, highlightColor, beginSeparatorString, endSeparatorString, bold, italic, strikeThrough, underline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemsStyle {\n");
    
    sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    sb.append("    highlightColor: ").append(toIndentedString(highlightColor)).append("\n");
    sb.append("    beginSeparatorString: ").append(toIndentedString(beginSeparatorString)).append("\n");
    sb.append("    endSeparatorString: ").append(toIndentedString(endSeparatorString)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    strikeThrough: ").append(toIndentedString(strikeThrough)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
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


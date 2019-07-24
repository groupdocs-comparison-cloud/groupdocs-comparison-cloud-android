/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ChangeInfo.java">
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
import com.groupdocs.cloud.comparison.model.StyleChangeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ChangeInfo Object fields
 */
@ApiModel(description = "ChangeInfo Object fields")
public class ChangeInfo {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("comparisonAction")
  private String comparisonAction = null;

  @SerializedName("comparisonTypeChanged")
  private String comparisonTypeChanged = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("authors")
  private List<String> authors = null;

  @SerializedName("styleChangeInfo")
  private List<StyleChangeInfo> styleChangeInfo = null;

  public ChangeInfo id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id of change
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Id of change")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ChangeInfo comparisonAction(String comparisonAction) {
    this.comparisonAction = comparisonAction;
    return this;
  }

   /**
   * Action (accept or reject). This field shows comparison what to do with this change
   * @return comparisonAction
  **/
  @ApiModelProperty(value = "Action (accept or reject). This field shows comparison what to do with this change")
  public String getComparisonAction() {
    return comparisonAction;
  }

  public void setComparisonAction(String comparisonAction) {
    this.comparisonAction = comparisonAction;
  }

  public ChangeInfo comparisonTypeChanged(String comparisonTypeChanged) {
    this.comparisonTypeChanged = comparisonTypeChanged;
    return this;
  }

   /**
   * Type of change (Inserted, Deleted or StyleChanged)
   * @return comparisonTypeChanged
  **/
  @ApiModelProperty(value = "Type of change (Inserted, Deleted or StyleChanged)")
  public String getComparisonTypeChanged() {
    return comparisonTypeChanged;
  }

  public void setComparisonTypeChanged(String comparisonTypeChanged) {
    this.comparisonTypeChanged = comparisonTypeChanged;
  }

  public ChangeInfo text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text of changed element
   * @return text
  **/
  @ApiModelProperty(value = "Text of changed element")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ChangeInfo authors(List<String> authors) {
    this.authors = authors;
    return this;
  }

  public ChangeInfo addAuthorsItem(String authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<String>();
    }
    this.authors.add(authorsItem);
    return this;
  }

   /**
   * Array of authors who made this change (used for multi comparison)
   * @return authors
  **/
  @ApiModelProperty(value = "Array of authors who made this change (used for multi comparison)")
  public List<String> getAuthors() {
    return authors;
  }

  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }

  public ChangeInfo styleChangeInfo(List<StyleChangeInfo> styleChangeInfo) {
    this.styleChangeInfo = styleChangeInfo;
    return this;
  }

  public ChangeInfo addStyleChangeInfoItem(StyleChangeInfo styleChangeInfoItem) {
    if (this.styleChangeInfo == null) {
      this.styleChangeInfo = new ArrayList<StyleChangeInfo>();
    }
    this.styleChangeInfo.add(styleChangeInfoItem);
    return this;
  }

   /**
   * Array of style changes
   * @return styleChangeInfo
  **/
  @ApiModelProperty(value = "Array of style changes")
  public List<StyleChangeInfo> getStyleChangeInfo() {
    return styleChangeInfo;
  }

  public void setStyleChangeInfo(List<StyleChangeInfo> styleChangeInfo) {
    this.styleChangeInfo = styleChangeInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeInfo changeInfo = (ChangeInfo) o;
    return Objects.equals(this.id, changeInfo.id) &&
        Objects.equals(this.comparisonAction, changeInfo.comparisonAction) &&
        Objects.equals(this.comparisonTypeChanged, changeInfo.comparisonTypeChanged) &&
        Objects.equals(this.text, changeInfo.text) &&
        Objects.equals(this.authors, changeInfo.authors) &&
        Objects.equals(this.styleChangeInfo, changeInfo.styleChangeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, comparisonAction, comparisonTypeChanged, text, authors, styleChangeInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    comparisonAction: ").append(toIndentedString(comparisonAction)).append("\n");
    sb.append("    comparisonTypeChanged: ").append(toIndentedString(comparisonTypeChanged)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    styleChangeInfo: ").append(toIndentedString(styleChangeInfo)).append("\n");
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


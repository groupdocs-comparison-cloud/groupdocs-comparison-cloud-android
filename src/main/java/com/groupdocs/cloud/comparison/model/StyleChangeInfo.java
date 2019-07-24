/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="StyleChangeInfo.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StyleChangeInfo Object fields
 */
@ApiModel(description = "StyleChangeInfo Object fields")
public class StyleChangeInfo {
  @SerializedName("changedProperty")
  private String changedProperty = null;

  @SerializedName("oldValue")
  private String oldValue = null;

  @SerializedName("newValue")
  private String newValue = null;

  public StyleChangeInfo changedProperty(String changedProperty) {
    this.changedProperty = changedProperty;
    return this;
  }

   /**
   * Name of changed style
   * @return changedProperty
  **/
  @ApiModelProperty(value = "Name of changed style")
  public String getChangedProperty() {
    return changedProperty;
  }

  public void setChangedProperty(String changedProperty) {
    this.changedProperty = changedProperty;
  }

  public StyleChangeInfo oldValue(String oldValue) {
    this.oldValue = oldValue;
    return this;
  }

   /**
   * Value of changed style from source document
   * @return oldValue
  **/
  @ApiModelProperty(value = "Value of changed style from source document")
  public String getOldValue() {
    return oldValue;
  }

  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }

  public StyleChangeInfo newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

   /**
   * Value of changed style from target document
   * @return newValue
  **/
  @ApiModelProperty(value = "Value of changed style from target document")
  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StyleChangeInfo styleChangeInfo = (StyleChangeInfo) o;
    return Objects.equals(this.changedProperty, styleChangeInfo.changedProperty) &&
        Objects.equals(this.oldValue, styleChangeInfo.oldValue) &&
        Objects.equals(this.newValue, styleChangeInfo.newValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedProperty, oldValue, newValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StyleChangeInfo {\n");
    
    sb.append("    changedProperty: ").append(toIndentedString(changedProperty)).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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


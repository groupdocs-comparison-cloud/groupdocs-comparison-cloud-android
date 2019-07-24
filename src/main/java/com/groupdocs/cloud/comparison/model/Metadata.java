/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Metadata.java">
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
 * MetaData Object fields
 */
@ApiModel(description = "MetaData Object fields")
public class Metadata {
  @SerializedName("author")
  private String author = null;

  @SerializedName("lastSaveBy")
  private String lastSaveBy = null;

  @SerializedName("company")
  private String company = null;

  public Metadata author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Value of document Author
   * @return author
  **/
  @ApiModelProperty(value = "Value of document Author")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Metadata lastSaveBy(String lastSaveBy) {
    this.lastSaveBy = lastSaveBy;
    return this;
  }

   /**
   * Value of last save by author of document
   * @return lastSaveBy
  **/
  @ApiModelProperty(value = "Value of last save by author of document")
  public String getLastSaveBy() {
    return lastSaveBy;
  }

  public void setLastSaveBy(String lastSaveBy) {
    this.lastSaveBy = lastSaveBy;
  }

  public Metadata company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Value of Company of document
   * @return company
  **/
  @ApiModelProperty(value = "Value of Company of document")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.author, metadata.author) &&
        Objects.equals(this.lastSaveBy, metadata.lastSaveBy) &&
        Objects.equals(this.company, metadata.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, lastSaveBy, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    lastSaveBy: ").append(toIndentedString(lastSaveBy)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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


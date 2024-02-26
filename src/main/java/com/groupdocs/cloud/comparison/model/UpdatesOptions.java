/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="UpdatesOptions.java">
 *   Copyright (c) 2003-2024 Aspose Pty Ltd
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
import com.groupdocs.cloud.comparison.model.ChangeInfo;
import com.groupdocs.cloud.comparison.model.ComparisonOptions;
import com.groupdocs.cloud.comparison.model.FileInfo;
import com.groupdocs.cloud.comparison.model.Settings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Comparison option class for updates endpoint
 */
@ApiModel(description = "Comparison option class for updates endpoint")
public class UpdatesOptions extends ComparisonOptions {
  @SerializedName("changes")
  private List<ChangeInfo> changes = null;

  public UpdatesOptions changes(List<ChangeInfo> changes) {
    this.changes = changes;
    return this;
  }

  public UpdatesOptions addChangesItem(ChangeInfo changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<ChangeInfo>();
    }
    this.changes.add(changesItem);
    return this;
  }

   /**
   * Changes to apply or reject. Used only for updates resource (/comparison/updates)
   * @return changes
  **/
  @ApiModelProperty(value = "Changes to apply or reject. Used only for updates resource (/comparison/updates)")
  public List<ChangeInfo> getChanges() {
    return changes;
  }

  public void setChanges(List<ChangeInfo> changes) {
    this.changes = changes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatesOptions updatesOptions = (UpdatesOptions) o;
    return Objects.equals(this.changes, updatesOptions.changes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatesOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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


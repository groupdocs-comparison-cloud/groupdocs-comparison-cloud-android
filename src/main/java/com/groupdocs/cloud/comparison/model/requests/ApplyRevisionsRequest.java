/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ApplyRevisionsRequest.java">
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

package com.groupdocs.cloud.comparison.model.requests;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.comparison.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.File;

/**
 * Request model for applyRevisions method.
 */
public class ApplyRevisionsRequest {
    
    /**
    * Initializes a new instance of the ApplyRevisionsRequest class.
    */      
    public ApplyRevisionsRequest()
    {
    }

    /**
    * Initializes a new instance of the ApplyRevisionsRequest class.    
    * @param revisionOptions Apply revisions options
    */
    public ApplyRevisionsRequest(ApplyRevisionsOptions revisionOptions)
    {
        this.revisionOptions = revisionOptions;
    }

  @SerializedName("revisionOptions")
  private ApplyRevisionsOptions revisionOptions = null;

  /**
   * Apply revisions options
   * @return Apply revisions options
  **/
  @ApiModelProperty(example = "new ApplyRevisionsOptions()", required = true, value = "Apply revisions options")
  public ApplyRevisionsOptions getrevisionOptions() {
    return revisionOptions;
  }

  public void setrevisionOptions(ApplyRevisionsOptions revisionOptions) {
    this.revisionOptions = revisionOptions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    
    ApplyRevisionsRequest request = (ApplyRevisionsRequest) o;
    return Objects.equals(this.revisionOptions, request.revisionOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revisionOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyRevisions {\n");
    sb.append("    revisionOptions: ").append(toIndentedString(revisionOptions)).append("\n");
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


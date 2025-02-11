/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="DeleteFolderRequest.java">
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
 * Request model for deleteFolder method.
 */
public class DeleteFolderRequest {
    
    /**
    * Initializes a new instance of the DeleteFolderRequest class.
    */      
    public DeleteFolderRequest()
    {
    }

    /**
    * Initializes a new instance of the DeleteFolderRequest class.    
    * @param path Folder path e.g. '/folder'
    * @param storageName Storage name
    * @param recursive Enable to delete folders, subfolders and files
    */
    public DeleteFolderRequest(String path, String storageName, Boolean recursive)
    {
        this.path = path;
        this.storageName = storageName;
        this.recursive = recursive;
    }

  @SerializedName("path")
  private String path = null;

  @SerializedName("storageName")
  private String storageName = null;

  @SerializedName("recursive")
  private Boolean recursive = null;

  /**
   * Folder path e.g. '/folder'
   * @return Folder path e.g. '/folder'
  **/
  @ApiModelProperty(example = "path_example", required = true, value = "Folder path e.g. '/folder'")
  public String getpath() {
    return path;
  }

  public void setpath(String path) {
    this.path = path;
  }

  /**
   * Storage name
   * @return Storage name
  **/
  @ApiModelProperty(example = "storageName_example", value = "Storage name")
  public String getstorageName() {
    return storageName;
  }

  public void setstorageName(String storageName) {
    this.storageName = storageName;
  }

  /**
   * Enable to delete folders, subfolders and files
   * @return Enable to delete folders, subfolders and files
  **/
  @ApiModelProperty(example = "false", value = "Enable to delete folders, subfolders and files")
  public Boolean getrecursive() {
    return recursive;
  }

  public void setrecursive(Boolean recursive) {
    this.recursive = recursive;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    
    DeleteFolderRequest request = (DeleteFolderRequest) o;
    return Objects.equals(this.path, request.path) &&
        Objects.equals(this.storageName, request.storageName) &&
        Objects.equals(this.recursive, request.recursive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, storageName, recursive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteFolder {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    storageName: ").append(toIndentedString(storageName)).append("\n");
    sb.append("    recursive: ").append(toIndentedString(recursive)).append("\n");
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


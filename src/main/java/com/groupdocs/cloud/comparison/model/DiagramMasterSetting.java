/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="DiagramMasterSetting.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DiagramMasterSetting Object fields
 */
@ApiModel(description = "DiagramMasterSetting Object fields")
public class DiagramMasterSetting {
  @SerializedName("masterPath")
  private String masterPath = null;

  @SerializedName("useSourceMaster")
  private Boolean useSourceMaster = null;

  public DiagramMasterSetting masterPath(String masterPath) {
    this.masterPath = masterPath;
    return this;
  }

   /**
   * Path to custom master path
   * @return masterPath
  **/
  @ApiModelProperty(value = "Path to custom master path")
  public String getMasterPath() {
    return masterPath;
  }

  public void setMasterPath(String masterPath) {
    this.masterPath = masterPath;
  }

  public DiagramMasterSetting useSourceMaster(Boolean useSourceMaster) {
    this.useSourceMaster = useSourceMaster;
    return this;
  }

   /**
   * Value of using master from source and target document together
   * @return useSourceMaster
  **/
  @ApiModelProperty(required = true, value = "Value of using master from source and target document together")
  public Boolean getUseSourceMaster() {
    return useSourceMaster;
  }

  public void setUseSourceMaster(Boolean useSourceMaster) {
    this.useSourceMaster = useSourceMaster;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagramMasterSetting diagramMasterSetting = (DiagramMasterSetting) o;
    return Objects.equals(this.masterPath, diagramMasterSetting.masterPath) &&
        Objects.equals(this.useSourceMaster, diagramMasterSetting.useSourceMaster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(masterPath, useSourceMaster);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagramMasterSetting {\n");
    
    sb.append("    masterPath: ").append(toIndentedString(masterPath)).append("\n");
    sb.append("    useSourceMaster: ").append(toIndentedString(useSourceMaster)).append("\n");
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


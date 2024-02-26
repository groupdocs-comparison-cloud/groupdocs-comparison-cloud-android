/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ChangeInfo.java">
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
import com.groupdocs.cloud.comparison.model.PageInfo;
import com.groupdocs.cloud.comparison.model.Rectangle;
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

  /**
   * Action (accept or reject). This field shows comparison what to do with this change
   */
  @JsonAdapter(ComparisonActionEnum.Adapter.class)
  public enum ComparisonActionEnum {
    NONE("None"),
    
    ACCEPT("Accept"),
    
    REJECT("Reject");

    private String value;

    ComparisonActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ComparisonActionEnum fromValue(String text) {
      for (ComparisonActionEnum b : ComparisonActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ComparisonActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ComparisonActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ComparisonActionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ComparisonActionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("comparisonAction")
  private ComparisonActionEnum comparisonAction = null;

  /**
   * Type of change (Inserted, Deleted or StyleChanged)
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NONE("None"),
    
    MODIFIED("Modified"),
    
    INSERTED("Inserted"),
    
    DELETED("Deleted"),
    
    ADDED("Added"),
    
    NOTMODIFIED("NotModified"),
    
    STYLECHANGED("StyleChanged"),
    
    RESIZED("Resized"),
    
    MOVED("Moved"),
    
    MOVEDANDRESIZED("MovedAndResized"),
    
    SHIFTEDANDRESIZED("ShiftedAndResized");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("targetText")
  private String targetText = null;

  @SerializedName("authors")
  private List<String> authors = null;

  @SerializedName("styleChangeInfo")
  private List<StyleChangeInfo> styleChangeInfo = null;

  @SerializedName("pageInfo")
  private PageInfo pageInfo = null;

  @SerializedName("box")
  private Rectangle box = null;

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

  public ChangeInfo comparisonAction(ComparisonActionEnum comparisonAction) {
    this.comparisonAction = comparisonAction;
    return this;
  }

   /**
   * Action (accept or reject). This field shows comparison what to do with this change
   * @return comparisonAction
  **/
  @ApiModelProperty(required = true, value = "Action (accept or reject). This field shows comparison what to do with this change")
  public ComparisonActionEnum getComparisonAction() {
    return comparisonAction;
  }

  public void setComparisonAction(ComparisonActionEnum comparisonAction) {
    this.comparisonAction = comparisonAction;
  }

  public ChangeInfo type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of change (Inserted, Deleted or StyleChanged)
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of change (Inserted, Deleted or StyleChanged)")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
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

  public ChangeInfo targetText(String targetText) {
    this.targetText = targetText;
    return this;
  }

   /**
   * Changed text of target doc
   * @return targetText
  **/
  @ApiModelProperty(value = "Changed text of target doc")
  public String getTargetText() {
    return targetText;
  }

  public void setTargetText(String targetText) {
    this.targetText = targetText;
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

  public ChangeInfo pageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Page where current change is placed
   * @return pageInfo
  **/
  @ApiModelProperty(value = "Page where current change is placed")
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  public ChangeInfo box(Rectangle box) {
    this.box = box;
    return this;
  }

   /**
   * Coordinates of changed element
   * @return box
  **/
  @ApiModelProperty(required = true, value = "Coordinates of changed element")
  public Rectangle getBox() {
    return box;
  }

  public void setBox(Rectangle box) {
    this.box = box;
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
        Objects.equals(this.type, changeInfo.type) &&
        Objects.equals(this.text, changeInfo.text) &&
        Objects.equals(this.targetText, changeInfo.targetText) &&
        Objects.equals(this.authors, changeInfo.authors) &&
        Objects.equals(this.styleChangeInfo, changeInfo.styleChangeInfo) &&
        Objects.equals(this.pageInfo, changeInfo.pageInfo) &&
        Objects.equals(this.box, changeInfo.box);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, comparisonAction, type, text, targetText, authors, styleChangeInfo, pageInfo, box);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    comparisonAction: ").append(toIndentedString(comparisonAction)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    targetText: ").append(toIndentedString(targetText)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    styleChangeInfo: ").append(toIndentedString(styleChangeInfo)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    box: ").append(toIndentedString(box)).append("\n");
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


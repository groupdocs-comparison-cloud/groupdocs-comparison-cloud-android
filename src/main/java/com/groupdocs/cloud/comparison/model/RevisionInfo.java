/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="RevisionInfo.java">
 *   Copyright (c) 2003-2021 Aspose Pty Ltd
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
 * Provides information about one revision.
 */
@ApiModel(description = "Provides information about one revision.")
public class RevisionInfo {
  @SerializedName("id")
  private Integer id = null;

  /**
   * Action (accept or reject). This field allows you to influence the display of the revision.             
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    NONE("None"),
    
    ACCEPT("Accept"),
    
    REJECT("Reject");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("action")
  private ActionEnum action = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("author")
  private String author = null;

  /**
   * RevisionHandler type, depending on the type the Action (accept or reject) logic changes.             
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INSERTION("Insertion"),
    
    DELETION("Deletion"),
    
    FORMATCHANGE("FormatChange"),
    
    STYLEDEFINITIONCHANGE("StyleDefinitionChange"),
    
    MOVING("Moving");

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

  public RevisionInfo id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id of revision
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Id of revision")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RevisionInfo action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Action (accept or reject). This field allows you to influence the display of the revision.             
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Action (accept or reject). This field allows you to influence the display of the revision.             ")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public RevisionInfo text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text that is in revision.
   * @return text
  **/
  @ApiModelProperty(value = "The text that is in revision.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public RevisionInfo author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Author.
   * @return author
  **/
  @ApiModelProperty(value = "Author.")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public RevisionInfo type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * RevisionHandler type, depending on the type the Action (accept or reject) logic changes.             
   * @return type
  **/
  @ApiModelProperty(required = true, value = "RevisionHandler type, depending on the type the Action (accept or reject) logic changes.             ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevisionInfo revisionInfo = (RevisionInfo) o;
    return Objects.equals(this.id, revisionInfo.id) &&
        Objects.equals(this.action, revisionInfo.action) &&
        Objects.equals(this.text, revisionInfo.text) &&
        Objects.equals(this.author, revisionInfo.author) &&
        Objects.equals(this.type, revisionInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, action, text, author, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevisionInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


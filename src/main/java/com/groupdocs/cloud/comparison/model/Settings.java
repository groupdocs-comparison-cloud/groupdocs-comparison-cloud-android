/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Settings.java">
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
import com.groupdocs.cloud.comparison.model.DiagramMasterSetting;
import com.groupdocs.cloud.comparison.model.ItemsStyle;
import com.groupdocs.cloud.comparison.model.Metadata;
import com.groupdocs.cloud.comparison.model.Size;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines comparison process additional settings 
 */
@ApiModel(description = "Defines comparison process additional settings ")
public class Settings {
  @SerializedName("generateSummaryPage")
  private Boolean generateSummaryPage = null;

  @SerializedName("showDeletedContent")
  private Boolean showDeletedContent = null;

  @SerializedName("showInsertedContent")
  private Boolean showInsertedContent = null;

  @SerializedName("styleChangeDetection")
  private Boolean styleChangeDetection = null;

  @SerializedName("insertedItemsStyle")
  private ItemsStyle insertedItemsStyle = null;

  @SerializedName("deletedItemsStyle")
  private ItemsStyle deletedItemsStyle = null;

  @SerializedName("changedItemsStyle")
  private ItemsStyle changedItemsStyle = null;

  @SerializedName("wordsSeparatorChars")
  private List<String> wordsSeparatorChars = null;

  /**
   * Gets of sets the comparison details level 
   */
  @JsonAdapter(DetailsLevelEnum.Adapter.class)
  public enum DetailsLevelEnum {
    LOW("Low"),
    
    MIDDLE("Middle"),
    
    HIGH("High");

    private String value;

    DetailsLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DetailsLevelEnum fromValue(String text) {
      for (DetailsLevelEnum b : DetailsLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DetailsLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DetailsLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DetailsLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DetailsLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("detailsLevel")
  private DetailsLevelEnum detailsLevel = null;

  @SerializedName("useFramesForDelInsElements")
  private Boolean useFramesForDelInsElements = null;

  @SerializedName("calculateComponentCoordinates")
  private Boolean calculateComponentCoordinates = null;

  @SerializedName("markChangedContent")
  private Boolean markChangedContent = null;

  @SerializedName("markNestedContent")
  private Boolean markNestedContent = null;

  /**
   * Gets or sets type of metadata to clone
   */
  @JsonAdapter(CloneMetadataEnum.Adapter.class)
  public enum CloneMetadataEnum {
    DEFAULT("Default"),
    
    SOURCE("Source"),
    
    TARGET("Target"),
    
    FILEAUTHOR("FileAuthor");

    private String value;

    CloneMetadataEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CloneMetadataEnum fromValue(String text) {
      for (CloneMetadataEnum b : CloneMetadataEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CloneMetadataEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CloneMetadataEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CloneMetadataEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CloneMetadataEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("cloneMetadata")
  private CloneMetadataEnum cloneMetadata = null;

  @SerializedName("metaData")
  private Metadata metaData = null;

  /**
   * Gets or sets type of password saving
   */
  @JsonAdapter(PasswordSaveOptionEnum.Adapter.class)
  public enum PasswordSaveOptionEnum {
    NONE("None"),
    
    SOURCE("Source"),
    
    TARGET("Target"),
    
    USER("User");

    private String value;

    PasswordSaveOptionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PasswordSaveOptionEnum fromValue(String text) {
      for (PasswordSaveOptionEnum b : PasswordSaveOptionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PasswordSaveOptionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PasswordSaveOptionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PasswordSaveOptionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PasswordSaveOptionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("passwordSaveOption")
  private PasswordSaveOptionEnum passwordSaveOption = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("diagramMasterSetting")
  private DiagramMasterSetting diagramMasterSetting = null;

  @SerializedName("originalSize")
  private Size originalSize = null;

  @SerializedName("headerFootersComparison")
  private Boolean headerFootersComparison = null;

  /**
   * Gets or sets the result document paper size
   */
  @JsonAdapter(PaperSizeEnum.Adapter.class)
  public enum PaperSizeEnum {
    DEFAULT("Default"),
    
    A0("A0"),
    
    A1("A1"),
    
    A2("A2"),
    
    A3("A3"),
    
    A4("A4"),
    
    A5("A5"),
    
    A6("A6"),
    
    A7("A7"),
    
    A8("A8");

    private String value;

    PaperSizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaperSizeEnum fromValue(String text) {
      for (PaperSizeEnum b : PaperSizeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PaperSizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaperSizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaperSizeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaperSizeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("paperSize")
  private PaperSizeEnum paperSize = null;

  @SerializedName("sensitivityOfComparison")
  private Integer sensitivityOfComparison = null;

  public Settings generateSummaryPage(Boolean generateSummaryPage) {
    this.generateSummaryPage = generateSummaryPage;
    return this;
  }

   /**
   * Indicates whether to add summary page to resultant document or not
   * @return generateSummaryPage
  **/
  @ApiModelProperty(required = true, value = "Indicates whether to add summary page to resultant document or not")
  public Boolean getGenerateSummaryPage() {
    return generateSummaryPage;
  }

  public void setGenerateSummaryPage(Boolean generateSummaryPage) {
    this.generateSummaryPage = generateSummaryPage;
  }

  public Settings showDeletedContent(Boolean showDeletedContent) {
    this.showDeletedContent = showDeletedContent;
    return this;
  }

   /**
   * Indicates whether to show deleted components in resultant document or not
   * @return showDeletedContent
  **/
  @ApiModelProperty(required = true, value = "Indicates whether to show deleted components in resultant document or not")
  public Boolean getShowDeletedContent() {
    return showDeletedContent;
  }

  public void setShowDeletedContent(Boolean showDeletedContent) {
    this.showDeletedContent = showDeletedContent;
  }

  public Settings showInsertedContent(Boolean showInsertedContent) {
    this.showInsertedContent = showInsertedContent;
    return this;
  }

   /**
   * Indicates whether to show inserted components in resultant document or not
   * @return showInsertedContent
  **/
  @ApiModelProperty(required = true, value = "Indicates whether to show inserted components in resultant document or not")
  public Boolean getShowInsertedContent() {
    return showInsertedContent;
  }

  public void setShowInsertedContent(Boolean showInsertedContent) {
    this.showInsertedContent = showInsertedContent;
  }

  public Settings styleChangeDetection(Boolean styleChangeDetection) {
    this.styleChangeDetection = styleChangeDetection;
    return this;
  }

   /**
   * Indicates whether to detect style changes or not
   * @return styleChangeDetection
  **/
  @ApiModelProperty(required = true, value = "Indicates whether to detect style changes or not")
  public Boolean getStyleChangeDetection() {
    return styleChangeDetection;
  }

  public void setStyleChangeDetection(Boolean styleChangeDetection) {
    this.styleChangeDetection = styleChangeDetection;
  }

  public Settings insertedItemsStyle(ItemsStyle insertedItemsStyle) {
    this.insertedItemsStyle = insertedItemsStyle;
    return this;
  }

   /**
   * Style for inserted components
   * @return insertedItemsStyle
  **/
  @ApiModelProperty(value = "Style for inserted components")
  public ItemsStyle getInsertedItemsStyle() {
    return insertedItemsStyle;
  }

  public void setInsertedItemsStyle(ItemsStyle insertedItemsStyle) {
    this.insertedItemsStyle = insertedItemsStyle;
  }

  public Settings deletedItemsStyle(ItemsStyle deletedItemsStyle) {
    this.deletedItemsStyle = deletedItemsStyle;
    return this;
  }

   /**
   * Style for deleted components
   * @return deletedItemsStyle
  **/
  @ApiModelProperty(value = "Style for deleted components")
  public ItemsStyle getDeletedItemsStyle() {
    return deletedItemsStyle;
  }

  public void setDeletedItemsStyle(ItemsStyle deletedItemsStyle) {
    this.deletedItemsStyle = deletedItemsStyle;
  }

  public Settings changedItemsStyle(ItemsStyle changedItemsStyle) {
    this.changedItemsStyle = changedItemsStyle;
    return this;
  }

   /**
   * Style for components with changed style
   * @return changedItemsStyle
  **/
  @ApiModelProperty(value = "Style for components with changed style")
  public ItemsStyle getChangedItemsStyle() {
    return changedItemsStyle;
  }

  public void setChangedItemsStyle(ItemsStyle changedItemsStyle) {
    this.changedItemsStyle = changedItemsStyle;
  }

  public Settings wordsSeparatorChars(List<String> wordsSeparatorChars) {
    this.wordsSeparatorChars = wordsSeparatorChars;
    return this;
  }

  public Settings addWordsSeparatorCharsItem(String wordsSeparatorCharsItem) {
    if (this.wordsSeparatorChars == null) {
      this.wordsSeparatorChars = new ArrayList<String>();
    }
    this.wordsSeparatorChars.add(wordsSeparatorCharsItem);
    return this;
  }

   /**
   * An array of delimiters to split text into words
   * @return wordsSeparatorChars
  **/
  @ApiModelProperty(value = "An array of delimiters to split text into words")
  public List<String> getWordsSeparatorChars() {
    return wordsSeparatorChars;
  }

  public void setWordsSeparatorChars(List<String> wordsSeparatorChars) {
    this.wordsSeparatorChars = wordsSeparatorChars;
  }

  public Settings detailsLevel(DetailsLevelEnum detailsLevel) {
    this.detailsLevel = detailsLevel;
    return this;
  }

   /**
   * Gets of sets the comparison details level 
   * @return detailsLevel
  **/
  @ApiModelProperty(required = true, value = "Gets of sets the comparison details level ")
  public DetailsLevelEnum getDetailsLevel() {
    return detailsLevel;
  }

  public void setDetailsLevel(DetailsLevelEnum detailsLevel) {
    this.detailsLevel = detailsLevel;
  }

  public Settings useFramesForDelInsElements(Boolean useFramesForDelInsElements) {
    this.useFramesForDelInsElements = useFramesForDelInsElements;
    return this;
  }

   /**
   * Indicates whether to use frames for shapes in Word Processing and for rectangles in Image documents
   * @return useFramesForDelInsElements
  **/
  @ApiModelProperty(required = true, value = "Indicates whether to use frames for shapes in Word Processing and for rectangles in Image documents")
  public Boolean getUseFramesForDelInsElements() {
    return useFramesForDelInsElements;
  }

  public void setUseFramesForDelInsElements(Boolean useFramesForDelInsElements) {
    this.useFramesForDelInsElements = useFramesForDelInsElements;
  }

  public Settings calculateComponentCoordinates(Boolean calculateComponentCoordinates) {
    this.calculateComponentCoordinates = calculateComponentCoordinates;
    return this;
  }

   /**
   * Indicates whether to calculate coordinates for changed components
   * @return calculateComponentCoordinates
  **/
  @ApiModelProperty(required = true, value = "Indicates whether to calculate coordinates for changed components")
  public Boolean getCalculateComponentCoordinates() {
    return calculateComponentCoordinates;
  }

  public void setCalculateComponentCoordinates(Boolean calculateComponentCoordinates) {
    this.calculateComponentCoordinates = calculateComponentCoordinates;
  }

  public Settings markChangedContent(Boolean markChangedContent) {
    this.markChangedContent = markChangedContent;
    return this;
  }

   /**
   * Indicates whether to use frames for shapes in Word Processing and for rectangles in Image documents
   * @return markChangedContent
  **/
  @ApiModelProperty(required = true, value = "Indicates whether to use frames for shapes in Word Processing and for rectangles in Image documents")
  public Boolean getMarkChangedContent() {
    return markChangedContent;
  }

  public void setMarkChangedContent(Boolean markChangedContent) {
    this.markChangedContent = markChangedContent;
  }

  public Settings markNestedContent(Boolean markNestedContent) {
    this.markNestedContent = markNestedContent;
    return this;
  }

   /**
   * Gets or sets a value indicating whether to mark the children of the deleted or inserted element as deleted or inserted
   * @return markNestedContent
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether to mark the children of the deleted or inserted element as deleted or inserted")
  public Boolean getMarkNestedContent() {
    return markNestedContent;
  }

  public void setMarkNestedContent(Boolean markNestedContent) {
    this.markNestedContent = markNestedContent;
  }

  public Settings cloneMetadata(CloneMetadataEnum cloneMetadata) {
    this.cloneMetadata = cloneMetadata;
    return this;
  }

   /**
   * Gets or sets type of metadata to clone
   * @return cloneMetadata
  **/
  @ApiModelProperty(required = true, value = "Gets or sets type of metadata to clone")
  public CloneMetadataEnum getCloneMetadata() {
    return cloneMetadata;
  }

  public void setCloneMetadata(CloneMetadataEnum cloneMetadata) {
    this.cloneMetadata = cloneMetadata;
  }

  public Settings metaData(Metadata metaData) {
    this.metaData = metaData;
    return this;
  }

   /**
   * Gets or sets user metadata
   * @return metaData
  **/
  @ApiModelProperty(value = "Gets or sets user metadata")
  public Metadata getMetaData() {
    return metaData;
  }

  public void setMetaData(Metadata metaData) {
    this.metaData = metaData;
  }

  public Settings passwordSaveOption(PasswordSaveOptionEnum passwordSaveOption) {
    this.passwordSaveOption = passwordSaveOption;
    return this;
  }

   /**
   * Gets or sets type of password saving
   * @return passwordSaveOption
  **/
  @ApiModelProperty(required = true, value = "Gets or sets type of password saving")
  public PasswordSaveOptionEnum getPasswordSaveOption() {
    return passwordSaveOption;
  }

  public void setPasswordSaveOption(PasswordSaveOptionEnum passwordSaveOption) {
    this.passwordSaveOption = passwordSaveOption;
  }

  public Settings password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Gets or sets user password to resultant document
   * @return password
  **/
  @ApiModelProperty(value = "Gets or sets user password to resultant document")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Settings diagramMasterSetting(DiagramMasterSetting diagramMasterSetting) {
    this.diagramMasterSetting = diagramMasterSetting;
    return this;
  }

   /**
   * Gets or sets master for Diagram document
   * @return diagramMasterSetting
  **/
  @ApiModelProperty(value = "Gets or sets master for Diagram document")
  public DiagramMasterSetting getDiagramMasterSetting() {
    return diagramMasterSetting;
  }

  public void setDiagramMasterSetting(DiagramMasterSetting diagramMasterSetting) {
    this.diagramMasterSetting = diagramMasterSetting;
  }

  public Settings originalSize(Size originalSize) {
    this.originalSize = originalSize;
    return this;
  }

   /**
   * Gets or sets original document size when picture is compared with other different formats
   * @return originalSize
  **/
  @ApiModelProperty(value = "Gets or sets original document size when picture is compared with other different formats")
  public Size getOriginalSize() {
    return originalSize;
  }

  public void setOriginalSize(Size originalSize) {
    this.originalSize = originalSize;
  }

  public Settings headerFootersComparison(Boolean headerFootersComparison) {
    this.headerFootersComparison = headerFootersComparison;
    return this;
  }

   /**
   * Control to turn on comparison of header/footer contents
   * @return headerFootersComparison
  **/
  @ApiModelProperty(required = true, value = "Control to turn on comparison of header/footer contents")
  public Boolean getHeaderFootersComparison() {
    return headerFootersComparison;
  }

  public void setHeaderFootersComparison(Boolean headerFootersComparison) {
    this.headerFootersComparison = headerFootersComparison;
  }

  public Settings paperSize(PaperSizeEnum paperSize) {
    this.paperSize = paperSize;
    return this;
  }

   /**
   * Gets or sets the result document paper size
   * @return paperSize
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the result document paper size")
  public PaperSizeEnum getPaperSize() {
    return paperSize;
  }

  public void setPaperSize(PaperSizeEnum paperSize) {
    this.paperSize = paperSize;
  }

  public Settings sensitivityOfComparison(Integer sensitivityOfComparison) {
    this.sensitivityOfComparison = sensitivityOfComparison;
    return this;
  }

   /**
   * Gets or sets a sensitivity of comparison. Default is 75
   * @return sensitivityOfComparison
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a sensitivity of comparison. Default is 75")
  public Integer getSensitivityOfComparison() {
    return sensitivityOfComparison;
  }

  public void setSensitivityOfComparison(Integer sensitivityOfComparison) {
    this.sensitivityOfComparison = sensitivityOfComparison;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settings settings = (Settings) o;
    return Objects.equals(this.generateSummaryPage, settings.generateSummaryPage) &&
        Objects.equals(this.showDeletedContent, settings.showDeletedContent) &&
        Objects.equals(this.showInsertedContent, settings.showInsertedContent) &&
        Objects.equals(this.styleChangeDetection, settings.styleChangeDetection) &&
        Objects.equals(this.insertedItemsStyle, settings.insertedItemsStyle) &&
        Objects.equals(this.deletedItemsStyle, settings.deletedItemsStyle) &&
        Objects.equals(this.changedItemsStyle, settings.changedItemsStyle) &&
        Objects.equals(this.wordsSeparatorChars, settings.wordsSeparatorChars) &&
        Objects.equals(this.detailsLevel, settings.detailsLevel) &&
        Objects.equals(this.useFramesForDelInsElements, settings.useFramesForDelInsElements) &&
        Objects.equals(this.calculateComponentCoordinates, settings.calculateComponentCoordinates) &&
        Objects.equals(this.markChangedContent, settings.markChangedContent) &&
        Objects.equals(this.markNestedContent, settings.markNestedContent) &&
        Objects.equals(this.cloneMetadata, settings.cloneMetadata) &&
        Objects.equals(this.metaData, settings.metaData) &&
        Objects.equals(this.passwordSaveOption, settings.passwordSaveOption) &&
        Objects.equals(this.password, settings.password) &&
        Objects.equals(this.diagramMasterSetting, settings.diagramMasterSetting) &&
        Objects.equals(this.originalSize, settings.originalSize) &&
        Objects.equals(this.headerFootersComparison, settings.headerFootersComparison) &&
        Objects.equals(this.paperSize, settings.paperSize) &&
        Objects.equals(this.sensitivityOfComparison, settings.sensitivityOfComparison);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generateSummaryPage, showDeletedContent, showInsertedContent, styleChangeDetection, insertedItemsStyle, deletedItemsStyle, changedItemsStyle, wordsSeparatorChars, detailsLevel, useFramesForDelInsElements, calculateComponentCoordinates, markChangedContent, markNestedContent, cloneMetadata, metaData, passwordSaveOption, password, diagramMasterSetting, originalSize, headerFootersComparison, paperSize, sensitivityOfComparison);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settings {\n");
    
    sb.append("    generateSummaryPage: ").append(toIndentedString(generateSummaryPage)).append("\n");
    sb.append("    showDeletedContent: ").append(toIndentedString(showDeletedContent)).append("\n");
    sb.append("    showInsertedContent: ").append(toIndentedString(showInsertedContent)).append("\n");
    sb.append("    styleChangeDetection: ").append(toIndentedString(styleChangeDetection)).append("\n");
    sb.append("    insertedItemsStyle: ").append(toIndentedString(insertedItemsStyle)).append("\n");
    sb.append("    deletedItemsStyle: ").append(toIndentedString(deletedItemsStyle)).append("\n");
    sb.append("    changedItemsStyle: ").append(toIndentedString(changedItemsStyle)).append("\n");
    sb.append("    wordsSeparatorChars: ").append(toIndentedString(wordsSeparatorChars)).append("\n");
    sb.append("    detailsLevel: ").append(toIndentedString(detailsLevel)).append("\n");
    sb.append("    useFramesForDelInsElements: ").append(toIndentedString(useFramesForDelInsElements)).append("\n");
    sb.append("    calculateComponentCoordinates: ").append(toIndentedString(calculateComponentCoordinates)).append("\n");
    sb.append("    markChangedContent: ").append(toIndentedString(markChangedContent)).append("\n");
    sb.append("    markNestedContent: ").append(toIndentedString(markNestedContent)).append("\n");
    sb.append("    cloneMetadata: ").append(toIndentedString(cloneMetadata)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    passwordSaveOption: ").append(toIndentedString(passwordSaveOption)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    diagramMasterSetting: ").append(toIndentedString(diagramMasterSetting)).append("\n");
    sb.append("    originalSize: ").append(toIndentedString(originalSize)).append("\n");
    sb.append("    headerFootersComparison: ").append(toIndentedString(headerFootersComparison)).append("\n");
    sb.append("    paperSize: ").append(toIndentedString(paperSize)).append("\n");
    sb.append("    sensitivityOfComparison: ").append(toIndentedString(sensitivityOfComparison)).append("\n");
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


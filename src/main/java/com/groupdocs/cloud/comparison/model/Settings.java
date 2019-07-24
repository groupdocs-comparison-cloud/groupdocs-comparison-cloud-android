/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Settings.java">
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
import com.groupdocs.cloud.comparison.model.DiagramMasterSetting;
import com.groupdocs.cloud.comparison.model.ItemsStyle;
import com.groupdocs.cloud.comparison.model.Metadata;
import com.groupdocs.cloud.comparison.model.OriginalSize;
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

  @SerializedName("styleChangeDetection")
  private Boolean styleChangeDetection = null;

  @SerializedName("insertedItemsStyle")
  private ItemsStyle insertedItemsStyle = null;

  @SerializedName("deletedItemsStyle")
  private ItemsStyle deletedItemsStyle = null;

  @SerializedName("styleChangedItemsStyle")
  private ItemsStyle styleChangedItemsStyle = null;

  @SerializedName("wordsSeparatorChars")
  private List<String> wordsSeparatorChars = null;

  @SerializedName("detailLevel")
  private String detailLevel = null;

  @SerializedName("useFramesForDelInsElements")
  private Boolean useFramesForDelInsElements = null;

  @SerializedName("calculateComponentCoordinates")
  private Boolean calculateComponentCoordinates = null;

  @SerializedName("markDeletedInsertedContentDeep")
  private Boolean markDeletedInsertedContentDeep = null;

  @SerializedName("cloneMetadata")
  private String cloneMetadata = null;

  @SerializedName("metaData")
  private Metadata metaData = null;

  @SerializedName("passwordSaveOption")
  private String passwordSaveOption = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("diagramMasterSetting")
  private DiagramMasterSetting diagramMasterSetting = null;

  @SerializedName("originalSize")
  private OriginalSize originalSize = null;

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

  public Settings styleChangedItemsStyle(ItemsStyle styleChangedItemsStyle) {
    this.styleChangedItemsStyle = styleChangedItemsStyle;
    return this;
  }

   /**
   * Style for components with changed style
   * @return styleChangedItemsStyle
  **/
  @ApiModelProperty(value = "Style for components with changed style")
  public ItemsStyle getStyleChangedItemsStyle() {
    return styleChangedItemsStyle;
  }

  public void setStyleChangedItemsStyle(ItemsStyle styleChangedItemsStyle) {
    this.styleChangedItemsStyle = styleChangedItemsStyle;
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

  public Settings detailLevel(String detailLevel) {
    this.detailLevel = detailLevel;
    return this;
  }

   /**
   * Gets of sets the comparison detalisation level 
   * @return detailLevel
  **/
  @ApiModelProperty(value = "Gets of sets the comparison detalisation level ")
  public String getDetailLevel() {
    return detailLevel;
  }

  public void setDetailLevel(String detailLevel) {
    this.detailLevel = detailLevel;
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

  public Settings markDeletedInsertedContentDeep(Boolean markDeletedInsertedContentDeep) {
    this.markDeletedInsertedContentDeep = markDeletedInsertedContentDeep;
    return this;
  }

   /**
   * Indicates whether to accept inserted/deleted styles for all children of inserted/deleted components
   * @return markDeletedInsertedContentDeep
  **/
  @ApiModelProperty(required = true, value = "Indicates whether to accept inserted/deleted styles for all children of inserted/deleted components")
  public Boolean getMarkDeletedInsertedContentDeep() {
    return markDeletedInsertedContentDeep;
  }

  public void setMarkDeletedInsertedContentDeep(Boolean markDeletedInsertedContentDeep) {
    this.markDeletedInsertedContentDeep = markDeletedInsertedContentDeep;
  }

  public Settings cloneMetadata(String cloneMetadata) {
    this.cloneMetadata = cloneMetadata;
    return this;
  }

   /**
   * Gets or sets type of metadata to clone
   * @return cloneMetadata
  **/
  @ApiModelProperty(value = "Gets or sets type of metadata to clone")
  public String getCloneMetadata() {
    return cloneMetadata;
  }

  public void setCloneMetadata(String cloneMetadata) {
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

  public Settings passwordSaveOption(String passwordSaveOption) {
    this.passwordSaveOption = passwordSaveOption;
    return this;
  }

   /**
   * Gets or sets type of password saving
   * @return passwordSaveOption
  **/
  @ApiModelProperty(value = "Gets or sets type of password saving")
  public String getPasswordSaveOption() {
    return passwordSaveOption;
  }

  public void setPasswordSaveOption(String passwordSaveOption) {
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

  public Settings originalSize(OriginalSize originalSize) {
    this.originalSize = originalSize;
    return this;
  }

   /**
   * Gets or sets original document size when picture is compared with other different formats
   * @return originalSize
  **/
  @ApiModelProperty(value = "Gets or sets original document size when picture is compared with other different formats")
  public OriginalSize getOriginalSize() {
    return originalSize;
  }

  public void setOriginalSize(OriginalSize originalSize) {
    this.originalSize = originalSize;
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
        Objects.equals(this.styleChangeDetection, settings.styleChangeDetection) &&
        Objects.equals(this.insertedItemsStyle, settings.insertedItemsStyle) &&
        Objects.equals(this.deletedItemsStyle, settings.deletedItemsStyle) &&
        Objects.equals(this.styleChangedItemsStyle, settings.styleChangedItemsStyle) &&
        Objects.equals(this.wordsSeparatorChars, settings.wordsSeparatorChars) &&
        Objects.equals(this.detailLevel, settings.detailLevel) &&
        Objects.equals(this.useFramesForDelInsElements, settings.useFramesForDelInsElements) &&
        Objects.equals(this.calculateComponentCoordinates, settings.calculateComponentCoordinates) &&
        Objects.equals(this.markDeletedInsertedContentDeep, settings.markDeletedInsertedContentDeep) &&
        Objects.equals(this.cloneMetadata, settings.cloneMetadata) &&
        Objects.equals(this.metaData, settings.metaData) &&
        Objects.equals(this.passwordSaveOption, settings.passwordSaveOption) &&
        Objects.equals(this.password, settings.password) &&
        Objects.equals(this.diagramMasterSetting, settings.diagramMasterSetting) &&
        Objects.equals(this.originalSize, settings.originalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generateSummaryPage, showDeletedContent, styleChangeDetection, insertedItemsStyle, deletedItemsStyle, styleChangedItemsStyle, wordsSeparatorChars, detailLevel, useFramesForDelInsElements, calculateComponentCoordinates, markDeletedInsertedContentDeep, cloneMetadata, metaData, passwordSaveOption, password, diagramMasterSetting, originalSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settings {\n");
    
    sb.append("    generateSummaryPage: ").append(toIndentedString(generateSummaryPage)).append("\n");
    sb.append("    showDeletedContent: ").append(toIndentedString(showDeletedContent)).append("\n");
    sb.append("    styleChangeDetection: ").append(toIndentedString(styleChangeDetection)).append("\n");
    sb.append("    insertedItemsStyle: ").append(toIndentedString(insertedItemsStyle)).append("\n");
    sb.append("    deletedItemsStyle: ").append(toIndentedString(deletedItemsStyle)).append("\n");
    sb.append("    styleChangedItemsStyle: ").append(toIndentedString(styleChangedItemsStyle)).append("\n");
    sb.append("    wordsSeparatorChars: ").append(toIndentedString(wordsSeparatorChars)).append("\n");
    sb.append("    detailLevel: ").append(toIndentedString(detailLevel)).append("\n");
    sb.append("    useFramesForDelInsElements: ").append(toIndentedString(useFramesForDelInsElements)).append("\n");
    sb.append("    calculateComponentCoordinates: ").append(toIndentedString(calculateComponentCoordinates)).append("\n");
    sb.append("    markDeletedInsertedContentDeep: ").append(toIndentedString(markDeletedInsertedContentDeep)).append("\n");
    sb.append("    cloneMetadata: ").append(toIndentedString(cloneMetadata)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    passwordSaveOption: ").append(toIndentedString(passwordSaveOption)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    diagramMasterSetting: ").append(toIndentedString(diagramMasterSetting)).append("\n");
    sb.append("    originalSize: ").append(toIndentedString(originalSize)).append("\n");
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


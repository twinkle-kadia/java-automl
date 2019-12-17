/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/data_items.proto

package com.google.cloud.automl.v1beta1;

public interface ExamplePayloadOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ExamplePayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Example image.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
   *
   * @return Whether the image field is set.
   */
  boolean hasImage();
  /**
   *
   *
   * <pre>
   * Example image.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
   *
   * @return The image.
   */
  com.google.cloud.automl.v1beta1.Image getImage();
  /**
   *
   *
   * <pre>
   * Example image.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
   */
  com.google.cloud.automl.v1beta1.ImageOrBuilder getImageOrBuilder();

  /**
   *
   *
   * <pre>
   * Example text.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
   *
   * @return Whether the textSnippet field is set.
   */
  boolean hasTextSnippet();
  /**
   *
   *
   * <pre>
   * Example text.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
   *
   * @return The textSnippet.
   */
  com.google.cloud.automl.v1beta1.TextSnippet getTextSnippet();
  /**
   *
   *
   * <pre>
   * Example text.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
   */
  com.google.cloud.automl.v1beta1.TextSnippetOrBuilder getTextSnippetOrBuilder();

  /**
   *
   *
   * <pre>
   * Example document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Document document = 4;</code>
   *
   * @return Whether the document field is set.
   */
  boolean hasDocument();
  /**
   *
   *
   * <pre>
   * Example document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Document document = 4;</code>
   *
   * @return The document.
   */
  com.google.cloud.automl.v1beta1.Document getDocument();
  /**
   *
   *
   * <pre>
   * Example document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Document document = 4;</code>
   */
  com.google.cloud.automl.v1beta1.DocumentOrBuilder getDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * Example relational table row.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Row row = 3;</code>
   *
   * @return Whether the row field is set.
   */
  boolean hasRow();
  /**
   *
   *
   * <pre>
   * Example relational table row.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Row row = 3;</code>
   *
   * @return The row.
   */
  com.google.cloud.automl.v1beta1.Row getRow();
  /**
   *
   *
   * <pre>
   * Example relational table row.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Row row = 3;</code>
   */
  com.google.cloud.automl.v1beta1.RowOrBuilder getRowOrBuilder();

  public com.google.cloud.automl.v1beta1.ExamplePayload.PayloadCase getPayloadCase();
}

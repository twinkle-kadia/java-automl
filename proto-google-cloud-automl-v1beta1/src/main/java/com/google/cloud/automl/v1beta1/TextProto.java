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
// source: google/cloud/automl/v1beta1/text.proto

package com.google.cloud.automl.v1beta1;

public final class TextProto {
  private TextProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TextClassificationDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextClassificationDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TextClassificationModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextClassificationModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TextExtractionDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextExtractionDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TextExtractionModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextExtractionModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TextSentimentDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextSentimentDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TextSentimentModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextSentimentModelMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/automl/v1beta1/text.proto"
          + "\022\033google.cloud.automl.v1beta1\032\034google/ap"
          + "i/annotations.proto\0320google/cloud/automl"
          + "/v1beta1/classification.proto\"q\n!TextCla"
          + "ssificationDatasetMetadata\022L\n\023classifica"
          + "tion_type\030\001 \001(\0162/.google.cloud.automl.v1"
          + "beta1.ClassificationType\"o\n\037TextClassifi"
          + "cationModelMetadata\022L\n\023classification_ty"
          + "pe\030\003 \001(\0162/.google.cloud.automl.v1beta1.C"
          + "lassificationType\"\037\n\035TextExtractionDatas"
          + "etMetadata\"\035\n\033TextExtractionModelMetadat"
          + "a\"5\n\034TextSentimentDatasetMetadata\022\025\n\rsen"
          + "timent_max\030\001 \001(\005\"\034\n\032TextSentimentModelMe"
          + "tadataB\260\001\n\037com.google.cloud.automl.v1bet"
          + "a1B\tTextProtoP\001ZAgoogle.golang.org/genpr"
          + "oto/googleapis/cloud/automl/v1beta1;auto"
          + "ml\312\002\033Google\\Cloud\\AutoMl\\V1beta1\352\002\036Googl"
          + "e::Cloud::AutoML::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1beta1_TextClassificationDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_TextClassificationDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TextClassificationDatasetMetadata_descriptor,
            new java.lang.String[] {
              "ClassificationType",
            });
    internal_static_google_cloud_automl_v1beta1_TextClassificationModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_TextClassificationModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TextClassificationModelMetadata_descriptor,
            new java.lang.String[] {
              "ClassificationType",
            });
    internal_static_google_cloud_automl_v1beta1_TextExtractionDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1beta1_TextExtractionDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TextExtractionDatasetMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1beta1_TextExtractionModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1beta1_TextExtractionModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TextExtractionModelMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1beta1_TextSentimentDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_automl_v1beta1_TextSentimentDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TextSentimentDatasetMetadata_descriptor,
            new java.lang.String[] {
              "SentimentMax",
            });
    internal_static_google_cloud_automl_v1beta1_TextSentimentModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_automl_v1beta1_TextSentimentModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TextSentimentModelMetadata_descriptor,
            new java.lang.String[] {});
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

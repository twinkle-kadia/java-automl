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
// source: google/cloud/automl/v1/model_evaluation.proto

package com.google.cloud.automl.v1;

public final class ModelEvaluationOuterClass {
  private ModelEvaluationOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ModelEvaluation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ModelEvaluation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/automl/v1/model_evaluatio"
          + "n.proto\022\026google.cloud.automl.v1\032(google/"
          + "cloud/automl/v1/translation.proto\032\037googl"
          + "e/protobuf/timestamp.proto\032\034google/api/a"
          + "nnotations.proto\"\370\001\n\017ModelEvaluation\022^\n\036"
          + "translation_evaluation_metrics\030\t \001(\01324.g"
          + "oogle.cloud.automl.v1.TranslationEvaluat"
          + "ionMetricsH\000\022\014\n\004name\030\001 \001(\t\022\032\n\022annotation"
          + "_spec_id\030\002 \001(\t\022/\n\013create_time\030\005 \001(\0132\032.go"
          + "ogle.protobuf.Timestamp\022\037\n\027evaluated_exa"
          + "mple_count\030\006 \001(\005B\t\n\007metricsB\252\001\n\032com.goog"
          + "le.cloud.automl.v1P\001Z<google.golang.org/"
          + "genproto/googleapis/cloud/automl/v1;auto"
          + "ml\252\002\026Google.Cloud.AutoML.V1\312\002\026Google\\Clo"
          + "ud\\AutoML\\V1\352\002\031Google::Cloud::AutoML::V1"
          + "b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.automl.v1.TranslationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_automl_v1_ModelEvaluation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_ModelEvaluation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ModelEvaluation_descriptor,
            new java.lang.String[] {
              "TranslationEvaluationMetrics",
              "Name",
              "AnnotationSpecId",
              "CreateTime",
              "EvaluatedExampleCount",
              "Metrics",
            });
    com.google.cloud.automl.v1.TranslationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

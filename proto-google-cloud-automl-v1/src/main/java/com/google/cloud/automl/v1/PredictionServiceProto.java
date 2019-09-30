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
// source: google/cloud/automl/v1/prediction_service.proto

package com.google.cloud.automl.v1;

public final class PredictionServiceProto {
  private PredictionServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_PredictRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_PredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_PredictRequest_ParamsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_PredictRequest_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_PredictResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_PredictResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_PredictResponse_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_PredictResponse_MetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/automl/v1/prediction_serv"
          + "ice.proto\022\026google.cloud.automl.v1\032\034googl"
          + "e/api/annotations.proto\032/google/cloud/au"
          + "toml/v1/annotation_payload.proto\032\'google"
          + "/cloud/automl/v1/data_items.proto\032\037googl"
          + "e/cloud/automl/v1/io.proto\032#google/longr"
          + "unning/operations.proto\032\027google/api/clie"
          + "nt.proto\"\312\001\n\016PredictRequest\022\014\n\004name\030\001 \001("
          + "\t\0227\n\007payload\030\002 \001(\0132&.google.cloud.automl"
          + ".v1.ExamplePayload\022B\n\006params\030\003 \003(\01322.goo"
          + "gle.cloud.automl.v1.PredictRequest.Param"
          + "sEntry\032-\n\013ParamsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va"
          + "lue\030\002 \001(\t:\0028\001\"\307\001\n\017PredictResponse\022:\n\007pay"
          + "load\030\001 \003(\0132).google.cloud.automl.v1.Anno"
          + "tationPayload\022G\n\010metadata\030\002 \003(\01325.google"
          + ".cloud.automl.v1.PredictResponse.Metadat"
          + "aEntry\032/\n\rMetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005"
          + "value\030\002 \001(\t:\0028\0012\372\001\n\021PredictionService\022\231\001"
          + "\n\007Predict\022&.google.cloud.automl.v1.Predi"
          + "ctRequest\032\'.google.cloud.automl.v1.Predi"
          + "ctResponse\"=\202\323\344\223\0027\"2/v1/{name=projects/*"
          + "/locations/*/models/*}:predict:\001*\032I\312A\025au"
          + "toml.googleapis.com\322A.https://www.google"
          + "apis.com/auth/cloud-platformB\302\001\n\032com.goo"
          + "gle.cloud.automl.v1B\026PredictionServicePr"
          + "otoP\001Z<google.golang.org/genproto/google"
          + "apis/cloud/automl/v1;automl\252\002\026Google.Clo"
          + "ud.AutoML.V1\312\002\026Google\\Cloud\\AutoML\\V1\352\002\031"
          + "Google::Cloud::AutoML::V1b\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.automl.v1.AnnotationPayloadOuterClass.getDescriptor(),
          com.google.cloud.automl.v1.DataItems.getDescriptor(),
          com.google.cloud.automl.v1.Io.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_automl_v1_PredictRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_PredictRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_PredictRequest_descriptor,
            new java.lang.String[] {
              "Name", "Payload", "Params",
            });
    internal_static_google_cloud_automl_v1_PredictRequest_ParamsEntry_descriptor =
        internal_static_google_cloud_automl_v1_PredictRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1_PredictRequest_ParamsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_PredictRequest_ParamsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_automl_v1_PredictResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1_PredictResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_PredictResponse_descriptor,
            new java.lang.String[] {
              "Payload", "Metadata",
            });
    internal_static_google_cloud_automl_v1_PredictResponse_MetadataEntry_descriptor =
        internal_static_google_cloud_automl_v1_PredictResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1_PredictResponse_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_PredictResponse_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.automl.v1.AnnotationPayloadOuterClass.getDescriptor();
    com.google.cloud.automl.v1.DataItems.getDescriptor();
    com.google.cloud.automl.v1.Io.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

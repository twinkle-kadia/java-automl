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
// source: google/cloud/automl/v1/data_items.proto

package com.google.cloud.automl.v1;

public final class DataItems {
  private DataItems() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_TextSnippet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_TextSnippet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ExamplePayload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ExamplePayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/automl/v1/data_items.prot"
          + "o\022\026google.cloud.automl.v1\032\037google/cloud/"
          + "automl/v1/io.proto\032\031google/protobuf/any."
          + "proto\032\036google/protobuf/duration.proto\032\034g"
          + "oogle/protobuf/struct.proto\032\034google/api/"
          + "annotations.proto\"F\n\013TextSnippet\022\017\n\007cont"
          + "ent\030\001 \001(\t\022\021\n\tmime_type\030\002 \001(\t\022\023\n\013content_"
          + "uri\030\004 \001(\t\"X\n\016ExamplePayload\022;\n\014text_snip"
          + "pet\030\002 \001(\0132#.google.cloud.automl.v1.TextS"
          + "nippetH\000B\t\n\007payloadB\252\001\n\032com.google.cloud"
          + ".automl.v1P\001Z<google.golang.org/genproto"
          + "/googleapis/cloud/automl/v1;automl\252\002\026Goo"
          + "gle.Cloud.AutoML.V1\312\002\026Google\\Cloud\\AutoM"
          + "L\\V1\352\002\031Google::Cloud::AutoML::V1b\006proto3"
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
          com.google.cloud.automl.v1.Io.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_automl_v1_TextSnippet_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_TextSnippet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_TextSnippet_descriptor,
            new java.lang.String[] {
              "Content", "MimeType", "ContentUri",
            });
    internal_static_google_cloud_automl_v1_ExamplePayload_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1_ExamplePayload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ExamplePayload_descriptor,
            new java.lang.String[] {
              "TextSnippet", "Payload",
            });
    com.google.cloud.automl.v1.Io.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

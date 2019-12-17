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

/**
 *
 *
 * <pre>
 * Result of the Batch Predict. This message is returned in
 * [response][google.longrunning.Operation.response] of the operation returned
 * by the
 * [PredictionService.BatchPredict][google.cloud.automl.v1.PredictionService.BatchPredict].
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1.BatchPredictResult}
 */
public final class BatchPredictResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1.BatchPredictResult)
    BatchPredictResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchPredictResult.newBuilder() to construct.
  private BatchPredictResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchPredictResult() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchPredictResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BatchPredictResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                metadata_ =
                    com.google.protobuf.MapField.newMapField(
                        MetadataDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String> metadata__ =
                  input.readMessage(
                      MetadataDefaultEntryHolder.defaultEntry.getParserForType(),
                      extensionRegistry);
              metadata_.getMutableMap().put(metadata__.getKey(), metadata__.getValue());
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1.PredictionServiceProto
        .internal_static_google_cloud_automl_v1_BatchPredictResult_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 1:
        return internalGetMetadata();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1.PredictionServiceProto
        .internal_static_google_cloud_automl_v1_BatchPredictResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1.BatchPredictResult.class,
            com.google.cloud.automl.v1.BatchPredictResult.Builder.class);
  }

  public static final int METADATA_FIELD_NUMBER = 1;

  private static final class MetadataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.automl.v1.PredictionServiceProto
                .internal_static_google_cloud_automl_v1_BatchPredictResult_MetadataEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> metadata_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetMetadata() {
    if (metadata_ == null) {
      return com.google.protobuf.MapField.emptyMapField(MetadataDefaultEntryHolder.defaultEntry);
    }
    return metadata_;
  }

  public int getMetadataCount() {
    return internalGetMetadata().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Additional domain-specific prediction response metadata.
   * *  For Image Object Detection:
   *  `max_bounding_box_count` - (int64) At most that many bounding boxes per
   *      image could have been returned.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 1;</code>
   */
  public boolean containsMetadata(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    return internalGetMetadata().getMap().containsKey(key);
  }
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getMetadata() {
    return getMetadataMap();
  }
  /**
   *
   *
   * <pre>
   * Additional domain-specific prediction response metadata.
   * *  For Image Object Detection:
   *  `max_bounding_box_count` - (int64) At most that many bounding boxes per
   *      image could have been returned.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 1;</code>
   */
  public java.util.Map<java.lang.String, java.lang.String> getMetadataMap() {
    return internalGetMetadata().getMap();
  }
  /**
   *
   *
   * <pre>
   * Additional domain-specific prediction response metadata.
   * *  For Image Object Detection:
   *  `max_bounding_box_count` - (int64) At most that many bounding boxes per
   *      image could have been returned.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 1;</code>
   */
  public java.lang.String getMetadataOrDefault(
      java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetMetadata().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Additional domain-specific prediction response metadata.
   * *  For Image Object Detection:
   *  `max_bounding_box_count` - (int64) At most that many bounding boxes per
   *      image could have been returned.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 1;</code>
   */
  public java.lang.String getMetadataOrThrow(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetMetadata().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetMetadata(), MetadataDefaultEntryHolder.defaultEntry, 1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetMetadata().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> metadata__ =
          MetadataDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, metadata__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.automl.v1.BatchPredictResult)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1.BatchPredictResult other =
        (com.google.cloud.automl.v1.BatchPredictResult) obj;

    if (!internalGetMetadata().equals(other.internalGetMetadata())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetMetadata().getMap().isEmpty()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1.BatchPredictResult parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.BatchPredictResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.BatchPredictResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.BatchPredictResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.BatchPredictResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.BatchPredictResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.BatchPredictResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.BatchPredictResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.BatchPredictResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.BatchPredictResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.BatchPredictResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.BatchPredictResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.automl.v1.BatchPredictResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Result of the Batch Predict. This message is returned in
   * [response][google.longrunning.Operation.response] of the operation returned
   * by the
   * [PredictionService.BatchPredict][google.cloud.automl.v1.PredictionService.BatchPredict].
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1.BatchPredictResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1.BatchPredictResult)
      com.google.cloud.automl.v1.BatchPredictResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1.PredictionServiceProto
          .internal_static_google_cloud_automl_v1_BatchPredictResult_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 1:
          return internalGetMetadata();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 1:
          return internalGetMutableMetadata();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1.PredictionServiceProto
          .internal_static_google_cloud_automl_v1_BatchPredictResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1.BatchPredictResult.class,
              com.google.cloud.automl.v1.BatchPredictResult.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1.BatchPredictResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableMetadata().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1.PredictionServiceProto
          .internal_static_google_cloud_automl_v1_BatchPredictResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.BatchPredictResult getDefaultInstanceForType() {
      return com.google.cloud.automl.v1.BatchPredictResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.BatchPredictResult build() {
      com.google.cloud.automl.v1.BatchPredictResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.BatchPredictResult buildPartial() {
      com.google.cloud.automl.v1.BatchPredictResult result =
          new com.google.cloud.automl.v1.BatchPredictResult(this);
      int from_bitField0_ = bitField0_;
      result.metadata_ = internalGetMetadata();
      result.metadata_.makeImmutable();
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.automl.v1.BatchPredictResult) {
        return mergeFrom((com.google.cloud.automl.v1.BatchPredictResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1.BatchPredictResult other) {
      if (other == com.google.cloud.automl.v1.BatchPredictResult.getDefaultInstance()) return this;
      internalGetMutableMetadata().mergeFrom(other.internalGetMetadata());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.automl.v1.BatchPredictResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.automl.v1.BatchPredictResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> metadata_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetMetadata() {
      if (metadata_ == null) {
        return com.google.protobuf.MapField.emptyMapField(MetadataDefaultEntryHolder.defaultEntry);
      }
      return metadata_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableMetadata() {
      onChanged();
      ;
      if (metadata_ == null) {
        metadata_ =
            com.google.protobuf.MapField.newMapField(MetadataDefaultEntryHolder.defaultEntry);
      }
      if (!metadata_.isMutable()) {
        metadata_ = metadata_.copy();
      }
      return metadata_;
    }

    public int getMetadataCount() {
      return internalGetMetadata().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Additional domain-specific prediction response metadata.
     * *  For Image Object Detection:
     *  `max_bounding_box_count` - (int64) At most that many bounding boxes per
     *      image could have been returned.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 1;</code>
     */
    public boolean containsMetadata(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetMetadata().getMap().containsKey(key);
    }
    /** Use {@link #getMetadataMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMetadata() {
      return getMetadataMap();
    }
    /**
     *
     *
     * <pre>
     * Additional domain-specific prediction response metadata.
     * *  For Image Object Detection:
     *  `max_bounding_box_count` - (int64) At most that many bounding boxes per
     *      image could have been returned.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 1;</code>
     */
    public java.util.Map<java.lang.String, java.lang.String> getMetadataMap() {
      return internalGetMetadata().getMap();
    }
    /**
     *
     *
     * <pre>
     * Additional domain-specific prediction response metadata.
     * *  For Image Object Detection:
     *  `max_bounding_box_count` - (int64) At most that many bounding boxes per
     *      image could have been returned.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 1;</code>
     */
    public java.lang.String getMetadataOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetMetadata().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Additional domain-specific prediction response metadata.
     * *  For Image Object Detection:
     *  `max_bounding_box_count` - (int64) At most that many bounding boxes per
     *      image could have been returned.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 1;</code>
     */
    public java.lang.String getMetadataOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetMetadata().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearMetadata() {
      internalGetMutableMetadata().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional domain-specific prediction response metadata.
     * *  For Image Object Detection:
     *  `max_bounding_box_count` - (int64) At most that many bounding boxes per
     *      image could have been returned.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 1;</code>
     */
    public Builder removeMetadata(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableMetadata().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableMetadata() {
      return internalGetMutableMetadata().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Additional domain-specific prediction response metadata.
     * *  For Image Object Detection:
     *  `max_bounding_box_count` - (int64) At most that many bounding boxes per
     *      image could have been returned.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 1;</code>
     */
    public Builder putMetadata(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      if (value == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableMetadata().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional domain-specific prediction response metadata.
     * *  For Image Object Detection:
     *  `max_bounding_box_count` - (int64) At most that many bounding boxes per
     *      image could have been returned.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 1;</code>
     */
    public Builder putAllMetadata(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableMetadata().getMutableMap().putAll(values);
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1.BatchPredictResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1.BatchPredictResult)
  private static final com.google.cloud.automl.v1.BatchPredictResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1.BatchPredictResult();
  }

  public static com.google.cloud.automl.v1.BatchPredictResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchPredictResult> PARSER =
      new com.google.protobuf.AbstractParser<BatchPredictResult>() {
        @java.lang.Override
        public BatchPredictResult parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BatchPredictResult(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BatchPredictResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchPredictResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1.BatchPredictResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

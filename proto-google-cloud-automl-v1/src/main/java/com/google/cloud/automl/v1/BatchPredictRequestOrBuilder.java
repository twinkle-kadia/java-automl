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

public interface BatchPredictRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.BatchPredictRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the model requested to serve the batch prediction.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the model requested to serve the batch prediction.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The input configuration for batch prediction.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BatchPredictInputConfig input_config = 3;</code>
   *
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();
  /**
   *
   *
   * <pre>
   * Required. The input configuration for batch prediction.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BatchPredictInputConfig input_config = 3;</code>
   *
   * @return The inputConfig.
   */
  com.google.cloud.automl.v1.BatchPredictInputConfig getInputConfig();
  /**
   *
   *
   * <pre>
   * Required. The input configuration for batch prediction.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BatchPredictInputConfig input_config = 3;</code>
   */
  com.google.cloud.automl.v1.BatchPredictInputConfigOrBuilder getInputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The Configuration specifying where output predictions should
   * be written.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BatchPredictOutputConfig output_config = 4;</code>
   *
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   *
   *
   * <pre>
   * Required. The Configuration specifying where output predictions should
   * be written.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BatchPredictOutputConfig output_config = 4;</code>
   *
   * @return The outputConfig.
   */
  com.google.cloud.automl.v1.BatchPredictOutputConfig getOutputConfig();
  /**
   *
   *
   * <pre>
   * Required. The Configuration specifying where output predictions should
   * be written.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BatchPredictOutputConfig output_config = 4;</code>
   */
  com.google.cloud.automl.v1.BatchPredictOutputConfigOrBuilder getOutputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters for the predictions, any string must
   * be up to 25000 characters long.
   * *  For Text Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for a text snippet, it will only produce results
   *         that have at least this confidence score. The default is 0.5.
   * *  For Image Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for an image, it will only produce results that
   *         have at least this confidence score. The default is 0.5.
   * *  For Image Object Detection:
   *    `score_threshold` - (float) When Model detects objects on the image,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be produced per image. Default is 100, the
   *        requested value may be limited by server.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 5;</code>
   */
  int getParamsCount();
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters for the predictions, any string must
   * be up to 25000 characters long.
   * *  For Text Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for a text snippet, it will only produce results
   *         that have at least this confidence score. The default is 0.5.
   * *  For Image Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for an image, it will only produce results that
   *         have at least this confidence score. The default is 0.5.
   * *  For Image Object Detection:
   *    `score_threshold` - (float) When Model detects objects on the image,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be produced per image. Default is 100, the
   *        requested value may be limited by server.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 5;</code>
   */
  boolean containsParams(java.lang.String key);
  /** Use {@link #getParamsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getParams();
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters for the predictions, any string must
   * be up to 25000 characters long.
   * *  For Text Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for a text snippet, it will only produce results
   *         that have at least this confidence score. The default is 0.5.
   * *  For Image Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for an image, it will only produce results that
   *         have at least this confidence score. The default is 0.5.
   * *  For Image Object Detection:
   *    `score_threshold` - (float) When Model detects objects on the image,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be produced per image. Default is 100, the
   *        requested value may be limited by server.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getParamsMap();
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters for the predictions, any string must
   * be up to 25000 characters long.
   * *  For Text Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for a text snippet, it will only produce results
   *         that have at least this confidence score. The default is 0.5.
   * *  For Image Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for an image, it will only produce results that
   *         have at least this confidence score. The default is 0.5.
   * *  For Image Object Detection:
   *    `score_threshold` - (float) When Model detects objects on the image,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be produced per image. Default is 100, the
   *        requested value may be limited by server.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 5;</code>
   */
  java.lang.String getParamsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters for the predictions, any string must
   * be up to 25000 characters long.
   * *  For Text Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for a text snippet, it will only produce results
   *         that have at least this confidence score. The default is 0.5.
   * *  For Image Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for an image, it will only produce results that
   *         have at least this confidence score. The default is 0.5.
   * *  For Image Object Detection:
   *    `score_threshold` - (float) When Model detects objects on the image,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be produced per image. Default is 100, the
   *        requested value may be limited by server.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 5;</code>
   */
  java.lang.String getParamsOrThrow(java.lang.String key);
}

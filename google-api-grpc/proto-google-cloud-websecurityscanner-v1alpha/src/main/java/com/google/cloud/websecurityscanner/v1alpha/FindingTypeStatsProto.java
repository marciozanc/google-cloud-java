// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/finding_type_stats.proto

package com.google.cloud.websecurityscanner.v1alpha;

public final class FindingTypeStatsProto {
  private FindingTypeStatsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1alpha_FindingTypeStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_FindingTypeStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/cloud/websecurityscanner/v1alph" +
      "a/finding_type_stats.proto\022\'google.cloud" +
      ".websecurityscanner.v1alpha\032\034google/api/" +
      "annotations.proto\0325google/cloud/websecur" +
      "ityscanner/v1alpha/finding.proto\"}\n\020Find" +
      "ingTypeStats\022R\n\014finding_type\030\001 \001(\0162<.goo" +
      "gle.cloud.websecurityscanner.v1alpha.Fin" +
      "ding.FindingType\022\025\n\rfinding_count\030\002 \001(\005B" +
      "\241\001\n+com.google.cloud.websecurityscanner." +
      "v1alphaB\025FindingTypeStatsProtoP\001ZYgoogle",
      ".golang.org/genproto/googleapis/cloud/we" +
      "bsecurityscanner/v1alpha;websecurityscan" +
      "nerb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.websecurityscanner.v1alpha.FindingProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_websecurityscanner_v1alpha_FindingTypeStats_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1alpha_FindingTypeStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1alpha_FindingTypeStats_descriptor,
        new java.lang.String[] { "FindingType", "FindingCount", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.websecurityscanner.v1alpha.FindingProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
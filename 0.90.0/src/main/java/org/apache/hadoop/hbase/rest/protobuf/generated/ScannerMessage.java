// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScannerMessage.proto

package org.apache.hadoop.hbase.rest.protobuf.generated;

public final class ScannerMessage {
  private ScannerMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class Scanner extends
      com.google.protobuf.GeneratedMessage {
    // Use Scanner.newBuilder() to construct.
    private Scanner() {
      initFields();
    }
    private Scanner(boolean noInit) {}
    
    private static final Scanner defaultInstance;
    public static Scanner getDefaultInstance() {
      return defaultInstance;
    }
    
    public Scanner getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Scanner_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Scanner_fieldAccessorTable;
    }
    
    // optional bytes startRow = 1;
    public static final int STARTROW_FIELD_NUMBER = 1;
    private boolean hasStartRow;
    private com.google.protobuf.ByteString startRow_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasStartRow() { return hasStartRow; }
    public com.google.protobuf.ByteString getStartRow() { return startRow_; }
    
    // optional bytes endRow = 2;
    public static final int ENDROW_FIELD_NUMBER = 2;
    private boolean hasEndRow;
    private com.google.protobuf.ByteString endRow_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasEndRow() { return hasEndRow; }
    public com.google.protobuf.ByteString getEndRow() { return endRow_; }
    
    // repeated bytes columns = 3;
    public static final int COLUMNS_FIELD_NUMBER = 3;
    private java.util.List<com.google.protobuf.ByteString> columns_ =
      java.util.Collections.emptyList();
    public java.util.List<com.google.protobuf.ByteString> getColumnsList() {
      return columns_;
    }
    public int getColumnsCount() { return columns_.size(); }
    public com.google.protobuf.ByteString getColumns(int index) {
      return columns_.get(index);
    }
    
    // optional int32 batch = 4;
    public static final int BATCH_FIELD_NUMBER = 4;
    private boolean hasBatch;
    private int batch_ = 0;
    public boolean hasBatch() { return hasBatch; }
    public int getBatch() { return batch_; }
    
    // optional int64 startTime = 5;
    public static final int STARTTIME_FIELD_NUMBER = 5;
    private boolean hasStartTime;
    private long startTime_ = 0L;
    public boolean hasStartTime() { return hasStartTime; }
    public long getStartTime() { return startTime_; }
    
    // optional int64 endTime = 6;
    public static final int ENDTIME_FIELD_NUMBER = 6;
    private boolean hasEndTime;
    private long endTime_ = 0L;
    public boolean hasEndTime() { return hasEndTime; }
    public long getEndTime() { return endTime_; }
    
    // optional int32 maxVersions = 7;
    public static final int MAXVERSIONS_FIELD_NUMBER = 7;
    private boolean hasMaxVersions;
    private int maxVersions_ = 0;
    public boolean hasMaxVersions() { return hasMaxVersions; }
    public int getMaxVersions() { return maxVersions_; }
    
    // optional string filter = 8;
    public static final int FILTER_FIELD_NUMBER = 8;
    private boolean hasFilter;
    private java.lang.String filter_ = "";
    public boolean hasFilter() { return hasFilter; }
    public java.lang.String getFilter() { return filter_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasStartRow()) {
        output.writeBytes(1, getStartRow());
      }
      if (hasEndRow()) {
        output.writeBytes(2, getEndRow());
      }
      for (com.google.protobuf.ByteString element : getColumnsList()) {
        output.writeBytes(3, element);
      }
      if (hasBatch()) {
        output.writeInt32(4, getBatch());
      }
      if (hasStartTime()) {
        output.writeInt64(5, getStartTime());
      }
      if (hasEndTime()) {
        output.writeInt64(6, getEndTime());
      }
      if (hasMaxVersions()) {
        output.writeInt32(7, getMaxVersions());
      }
      if (hasFilter()) {
        output.writeString(8, getFilter());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasStartRow()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getStartRow());
      }
      if (hasEndRow()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getEndRow());
      }
      {
        int dataSize = 0;
        for (com.google.protobuf.ByteString element : getColumnsList()) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(element);
        }
        size += dataSize;
        size += 1 * getColumnsList().size();
      }
      if (hasBatch()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, getBatch());
      }
      if (hasStartTime()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, getStartTime());
      }
      if (hasEndTime()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, getEndTime());
      }
      if (hasMaxVersions()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, getMaxVersions());
      }
      if (hasFilter()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(8, getFilter());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner result;
      
      // Construct using org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner();
        return builder;
      }
      
      protected org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner.getDescriptor();
      }
      
      public org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.columns_ != java.util.Collections.EMPTY_LIST) {
          result.columns_ =
            java.util.Collections.unmodifiableList(result.columns_);
        }
        org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner) {
          return mergeFrom((org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner other) {
        if (other == org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner.getDefaultInstance()) return this;
        if (other.hasStartRow()) {
          setStartRow(other.getStartRow());
        }
        if (other.hasEndRow()) {
          setEndRow(other.getEndRow());
        }
        if (!other.columns_.isEmpty()) {
          if (result.columns_.isEmpty()) {
            result.columns_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
          }
          result.columns_.addAll(other.columns_);
        }
        if (other.hasBatch()) {
          setBatch(other.getBatch());
        }
        if (other.hasStartTime()) {
          setStartTime(other.getStartTime());
        }
        if (other.hasEndTime()) {
          setEndTime(other.getEndTime());
        }
        if (other.hasMaxVersions()) {
          setMaxVersions(other.getMaxVersions());
        }
        if (other.hasFilter()) {
          setFilter(other.getFilter());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setStartRow(input.readBytes());
              break;
            }
            case 18: {
              setEndRow(input.readBytes());
              break;
            }
            case 26: {
              addColumns(input.readBytes());
              break;
            }
            case 32: {
              setBatch(input.readInt32());
              break;
            }
            case 40: {
              setStartTime(input.readInt64());
              break;
            }
            case 48: {
              setEndTime(input.readInt64());
              break;
            }
            case 56: {
              setMaxVersions(input.readInt32());
              break;
            }
            case 66: {
              setFilter(input.readString());
              break;
            }
          }
        }
      }
      
      
      // optional bytes startRow = 1;
      public boolean hasStartRow() {
        return result.hasStartRow();
      }
      public com.google.protobuf.ByteString getStartRow() {
        return result.getStartRow();
      }
      public Builder setStartRow(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasStartRow = true;
        result.startRow_ = value;
        return this;
      }
      public Builder clearStartRow() {
        result.hasStartRow = false;
        result.startRow_ = getDefaultInstance().getStartRow();
        return this;
      }
      
      // optional bytes endRow = 2;
      public boolean hasEndRow() {
        return result.hasEndRow();
      }
      public com.google.protobuf.ByteString getEndRow() {
        return result.getEndRow();
      }
      public Builder setEndRow(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasEndRow = true;
        result.endRow_ = value;
        return this;
      }
      public Builder clearEndRow() {
        result.hasEndRow = false;
        result.endRow_ = getDefaultInstance().getEndRow();
        return this;
      }
      
      // repeated bytes columns = 3;
      public java.util.List<com.google.protobuf.ByteString> getColumnsList() {
        return java.util.Collections.unmodifiableList(result.columns_);
      }
      public int getColumnsCount() {
        return result.getColumnsCount();
      }
      public com.google.protobuf.ByteString getColumns(int index) {
        return result.getColumns(index);
      }
      public Builder setColumns(int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.columns_.set(index, value);
        return this;
      }
      public Builder addColumns(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  if (result.columns_.isEmpty()) {
          result.columns_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
        }
        result.columns_.add(value);
        return this;
      }
      public Builder addAllColumns(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        if (result.columns_.isEmpty()) {
          result.columns_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
        }
        super.addAll(values, result.columns_);
        return this;
      }
      public Builder clearColumns() {
        result.columns_ = java.util.Collections.emptyList();
        return this;
      }
      
      // optional int32 batch = 4;
      public boolean hasBatch() {
        return result.hasBatch();
      }
      public int getBatch() {
        return result.getBatch();
      }
      public Builder setBatch(int value) {
        result.hasBatch = true;
        result.batch_ = value;
        return this;
      }
      public Builder clearBatch() {
        result.hasBatch = false;
        result.batch_ = 0;
        return this;
      }
      
      // optional int64 startTime = 5;
      public boolean hasStartTime() {
        return result.hasStartTime();
      }
      public long getStartTime() {
        return result.getStartTime();
      }
      public Builder setStartTime(long value) {
        result.hasStartTime = true;
        result.startTime_ = value;
        return this;
      }
      public Builder clearStartTime() {
        result.hasStartTime = false;
        result.startTime_ = 0L;
        return this;
      }
      
      // optional int64 endTime = 6;
      public boolean hasEndTime() {
        return result.hasEndTime();
      }
      public long getEndTime() {
        return result.getEndTime();
      }
      public Builder setEndTime(long value) {
        result.hasEndTime = true;
        result.endTime_ = value;
        return this;
      }
      public Builder clearEndTime() {
        result.hasEndTime = false;
        result.endTime_ = 0L;
        return this;
      }
      
      // optional int32 maxVersions = 7;
      public boolean hasMaxVersions() {
        return result.hasMaxVersions();
      }
      public int getMaxVersions() {
        return result.getMaxVersions();
      }
      public Builder setMaxVersions(int value) {
        result.hasMaxVersions = true;
        result.maxVersions_ = value;
        return this;
      }
      public Builder clearMaxVersions() {
        result.hasMaxVersions = false;
        result.maxVersions_ = 0;
        return this;
      }
      
      // optional string filter = 8;
      public boolean hasFilter() {
        return result.hasFilter();
      }
      public java.lang.String getFilter() {
        return result.getFilter();
      }
      public Builder setFilter(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasFilter = true;
        result.filter_ = value;
        return this;
      }
      public Builder clearFilter() {
        result.hasFilter = false;
        result.filter_ = getDefaultInstance().getFilter();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:org.apache.hadoop.hbase.rest.protobuf.generated.Scanner)
    }
    
    static {
      defaultInstance = new Scanner(true);
      org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:org.apache.hadoop.hbase.rest.protobuf.generated.Scanner)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Scanner_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Scanner_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ScannerMessage.proto\022/org.apache.hadoo" +
      "p.hbase.rest.protobuf.generated\"\224\001\n\007Scan" +
      "ner\022\020\n\010startRow\030\001 \001(\014\022\016\n\006endRow\030\002 \001(\014\022\017\n" +
      "\007columns\030\003 \003(\014\022\r\n\005batch\030\004 \001(\005\022\021\n\tstartTi" +
      "me\030\005 \001(\003\022\017\n\007endTime\030\006 \001(\003\022\023\n\013maxVersions" +
      "\030\007 \001(\005\022\016\n\006filter\030\010 \001(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Scanner_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Scanner_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Scanner_descriptor,
              new java.lang.String[] { "StartRow", "EndRow", "Columns", "Batch", "StartTime", "EndTime", "MaxVersions", "Filter", },
              org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner.class,
              org.apache.hadoop.hbase.rest.protobuf.generated.ScannerMessage.Scanner.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
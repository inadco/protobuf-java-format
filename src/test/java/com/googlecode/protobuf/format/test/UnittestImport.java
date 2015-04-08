// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/unittest_import.proto

package com.googlecode.protobuf.format.test;

public final class UnittestImport {
  private UnittestImport() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum ImportEnum
      implements com.google.protobuf.ProtocolMessageEnum {
    IMPORT_FOO(0, 7),
    IMPORT_BAR(1, 8),
    IMPORT_BAZ(2, 9),
    ;
    
    public static final int IMPORT_FOO_VALUE = 7;
    public static final int IMPORT_BAR_VALUE = 8;
    public static final int IMPORT_BAZ_VALUE = 9;
    
    
    public final int getNumber() { return value; }
    
    public static ImportEnum valueOf(int value) {
      switch (value) {
        case 7: return IMPORT_FOO;
        case 8: return IMPORT_BAR;
        case 9: return IMPORT_BAZ;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<ImportEnum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ImportEnum>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ImportEnum>() {
            public ImportEnum findValueByNumber(int number) {
              return ImportEnum.valueOf(number);
            }
          };
    
    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.googlecode.protobuf.format.test.UnittestImport.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final ImportEnum[] VALUES = {
      IMPORT_FOO, IMPORT_BAR, IMPORT_BAZ, 
    };
    
    public static ImportEnum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private ImportEnum(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:protobuf_unittest_import.ImportEnum)
  }
  
  public interface ImportMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int32 d = 1;
    boolean hasD();
    int getD();
  }
  public static final class ImportMessage extends
      com.google.protobuf.GeneratedMessage
      implements ImportMessageOrBuilder {
    // Use ImportMessage.newBuilder() to construct.
    private ImportMessage(Builder builder) {
      super(builder);
    }
    private ImportMessage(boolean noInit) {}
    
    private static final ImportMessage defaultInstance;
    public static ImportMessage getDefaultInstance() {
      return defaultInstance;
    }
    
    public ImportMessage getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.googlecode.protobuf.format.test.UnittestImport.internal_static_protobuf_unittest_import_ImportMessage_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.googlecode.protobuf.format.test.UnittestImport.internal_static_protobuf_unittest_import_ImportMessage_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int32 d = 1;
    public static final int D_FIELD_NUMBER = 1;
    private int d_;
    public boolean hasD() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getD() {
      return d_;
    }
    
    private void initFields() {
      d_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, d_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, d_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.googlecode.protobuf.format.test.UnittestImport.ImportMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.googlecode.protobuf.format.test.UnittestImport.ImportMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.protobuf.format.test.UnittestImport.ImportMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.googlecode.protobuf.format.test.UnittestImport.ImportMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.protobuf.format.test.UnittestImport.ImportMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.googlecode.protobuf.format.test.UnittestImport.ImportMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.protobuf.format.test.UnittestImport.ImportMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.googlecode.protobuf.format.test.UnittestImport.ImportMessage parseDelimitedFrom(
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
    public static com.googlecode.protobuf.format.test.UnittestImport.ImportMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.googlecode.protobuf.format.test.UnittestImport.ImportMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.googlecode.protobuf.format.test.UnittestImport.ImportMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.googlecode.protobuf.format.test.UnittestImport.ImportMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.googlecode.protobuf.format.test.UnittestImport.internal_static_protobuf_unittest_import_ImportMessage_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.googlecode.protobuf.format.test.UnittestImport.internal_static_protobuf_unittest_import_ImportMessage_fieldAccessorTable;
      }
      
      // Construct using com.googlecode.protobuf.format.test.UnittestImport.ImportMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        d_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.googlecode.protobuf.format.test.UnittestImport.ImportMessage.getDescriptor();
      }
      
      public com.googlecode.protobuf.format.test.UnittestImport.ImportMessage getDefaultInstanceForType() {
        return com.googlecode.protobuf.format.test.UnittestImport.ImportMessage.getDefaultInstance();
      }
      
      public com.googlecode.protobuf.format.test.UnittestImport.ImportMessage build() {
        com.googlecode.protobuf.format.test.UnittestImport.ImportMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.googlecode.protobuf.format.test.UnittestImport.ImportMessage buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.googlecode.protobuf.format.test.UnittestImport.ImportMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.googlecode.protobuf.format.test.UnittestImport.ImportMessage buildPartial() {
        com.googlecode.protobuf.format.test.UnittestImport.ImportMessage result = new com.googlecode.protobuf.format.test.UnittestImport.ImportMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.d_ = d_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.googlecode.protobuf.format.test.UnittestImport.ImportMessage) {
          return mergeFrom((com.googlecode.protobuf.format.test.UnittestImport.ImportMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.googlecode.protobuf.format.test.UnittestImport.ImportMessage other) {
        if (other == com.googlecode.protobuf.format.test.UnittestImport.ImportMessage.getDefaultInstance()) return this;
        if (other.hasD()) {
          setD(other.getD());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
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
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              d_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int32 d = 1;
      private int d_ ;
      public boolean hasD() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getD() {
        return d_;
      }
      public Builder setD(int value) {
        bitField0_ |= 0x00000001;
        d_ = value;
        onChanged();
        return this;
      }
      public Builder clearD() {
        bitField0_ = (bitField0_ & ~0x00000001);
        d_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:protobuf_unittest_import.ImportMessage)
    }
    
    static {
      defaultInstance = new ImportMessage(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:protobuf_unittest_import.ImportMessage)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_unittest_import_ImportMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protobuf_unittest_import_ImportMessage_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033proto/unittest_import.proto\022\030protobuf_" +
      "unittest_import\"\032\n\rImportMessage\022\t\n\001d\030\001 " +
      "\001(\005*<\n\nImportEnum\022\016\n\nIMPORT_FOO\020\007\022\016\n\nIMP" +
      "ORT_BAR\020\010\022\016\n\nIMPORT_BAZ\020\tB\'\n#com.googlec" +
      "ode.protobuf.format.testH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_protobuf_unittest_import_ImportMessage_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_protobuf_unittest_import_ImportMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protobuf_unittest_import_ImportMessage_descriptor,
              new java.lang.String[] { "D", },
              com.googlecode.protobuf.format.test.UnittestImport.ImportMessage.class,
              com.googlecode.protobuf.format.test.UnittestImport.ImportMessage.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}

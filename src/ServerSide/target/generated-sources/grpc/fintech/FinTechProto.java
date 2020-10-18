// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fintech.proto

package fintech;

public final class FinTechProto {
  private FinTechProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintech_Error_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintech_Error_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintech_Error_ExtraEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintech_Error_ExtraEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintech_BalanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintech_BalanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintech_BalanceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintech_BalanceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintech_BalanceResponse_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintech_BalanceResponse_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintech_HistoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintech_HistoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintech_HistoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintech_HistoryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintech_HistoryResponse_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintech_HistoryResponse_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintech_HistoryItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintech_HistoryItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintech_TransferRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintech_TransferRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintech_TransferResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintech_TransferResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintech_TransferResponse_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintech_TransferResponse_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintech_NotificationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintech_NotificationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintech_NotificationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintech_NotificationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintech_NotificationResponse_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintech_NotificationResponse_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintech_NotificationItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintech_NotificationItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rfintech.proto\022\007fintech\"\215\001\n\005Error\022\033\n\004co" +
      "de\030\001 \001(\0162\r.fintech.Code\022\017\n\007message\030\002 \001(\t" +
      "\022(\n\005extra\030\003 \003(\0132\031.fintech.Error.ExtraEnt" +
      "ry\032,\n\nExtraEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002" +
      " \001(\t:\0028\001\"\020\n\016BalanceRequest\"\230\001\n\017BalanceRe" +
      "sponse\022\035\n\005error\030\001 \001(\0132\016.fintech.Error\022+\n" +
      "\004data\030\002 \001(\0132\035.fintech.BalanceResponse.Da" +
      "ta\0329\n\004Data\022\017\n\007balance\030\001 \001(\003\022 \n\030last_time" +
      "_update_balance\030\002 \001(\003\"\020\n\016HistoryRequest\"" +
      "\222\001\n\017HistoryResponse\022\035\n\005error\030\001 \001(\0132\016.fin",
      "tech.Error\022+\n\004data\030\002 \001(\0132\035.fintech.Histo" +
      "ryResponse.Data\0323\n\004Data\022+\n\rhistory_items" +
      "\030\001 \003(\0132\024.fintech.HistoryItem\"\360\001\n\013History" +
      "Item\022\022\n\npartner_id\030\001 \001(\003\0228\n\rtransfer_typ" +
      "e\030\002 \001(\0162!.fintech.HistoryItem.TransferTy" +
      "pe\022\016\n\006amount\030\003 \001(\003\022\017\n\007message\030\004 \001(\t\022\017\n\007b" +
      "alance\030\005 \001(\003\022\025\n\rtransfer_time\030\006 \001(\003\022\020\n\010u" +
      "sername\030\007 \001(\t\022\021\n\tfull_name\030\010 \001(\t\"%\n\014Tran" +
      "sferType\022\010\n\004SEND\020\000\022\013\n\007RECEIVE\020\001\"l\n\017Trans" +
      "ferRequest\022\021\n\tsender_id\030\001 \001(\003\022\023\n\013receive",
      "r_id\030\002 \001(\003\022\016\n\006amount\030\003 \001(\003\022\017\n\007message\030\004 " +
      "\001(\t\022\020\n\010password\030\005 \001(\t\"\222\001\n\020TransferRespon" +
      "se\022\035\n\005error\030\001 \001(\0132\016.fintech.Error\022,\n\004dat" +
      "a\030\002 \001(\0132\036.fintech.TransferResponse.Data\032" +
      "1\n\004Data\022)\n\013historyItem\030\001 \001(\0132\024.fintech.H" +
      "istoryItem\"\025\n\023NotificationRequest\"\246\001\n\024No" +
      "tificationResponse\022\035\n\005error\030\001 \001(\0132\016.fint" +
      "ech.Error\0220\n\004data\030\002 \001(\0132\".fintech.Notifi" +
      "cationResponse.Data\032=\n\004Data\0225\n\022notificat" +
      "ion_items\030\001 \003(\0132\031.fintech.NotificationIt",
      "em\"\306\001\n\020NotificationItem\022\027\n\017notification_" +
      "id\030\001 \001(\003\022\031\n\021notification_type\030\002 \001(\005\022\022\n\np" +
      "artner_id\030\003 \001(\003\022\016\n\006amount\030\004 \001(\003\022\017\n\007messa" +
      "ge\030\005 \001(\t\022,\n\004seen\030\006 \001(\0162\036.fintech.Notific" +
      "ationItem.Seen\"\033\n\004Seen\022\010\n\004TRUE\020\000\022\t\n\005FALS" +
      "E\020\001*\177\n\004Code\022\013\n\007SUCCESS\020\000\022\020\n\014UNAUTHORIZED" +
      "\020\001\022\017\n\013BAD_REQUEST\020\002\022\026\n\022INCORRECT_PASSWOR" +
      "D\020\003\022\024\n\020NOT_ENOUGH_MONEY\020\004\022\031\n\025INTERNAL_SE" +
      "RVER_ERROR\020\0052\253\002\n\016FintechService\022A\n\ngetBa" +
      "lance\022\027.fintech.BalanceRequest\032\030.fintech",
      ".BalanceResponse\"\000\022A\n\ngetHistory\022\027.finte" +
      "ch.HistoryRequest\032\030.fintech.HistoryRespo" +
      "nse\"\000\022A\n\010transfer\022\030.fintech.TransferRequ" +
      "est\032\031.fintech.TransferResponse\"\000\022P\n\017getN" +
      "otification\022\034.fintech.NotificationReques" +
      "t\032\035.fintech.NotificationResponse\"\000B\031\n\007fi" +
      "ntechB\014FinTechProtoP\001b\006proto3"
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
        }, assigner);
    internal_static_fintech_Error_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fintech_Error_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintech_Error_descriptor,
        new java.lang.String[] { "Code", "Message", "Extra", });
    internal_static_fintech_Error_ExtraEntry_descriptor =
      internal_static_fintech_Error_descriptor.getNestedTypes().get(0);
    internal_static_fintech_Error_ExtraEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintech_Error_ExtraEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_fintech_BalanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_fintech_BalanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintech_BalanceRequest_descriptor,
        new java.lang.String[] { });
    internal_static_fintech_BalanceResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_fintech_BalanceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintech_BalanceResponse_descriptor,
        new java.lang.String[] { "Error", "Data", });
    internal_static_fintech_BalanceResponse_Data_descriptor =
      internal_static_fintech_BalanceResponse_descriptor.getNestedTypes().get(0);
    internal_static_fintech_BalanceResponse_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintech_BalanceResponse_Data_descriptor,
        new java.lang.String[] { "Balance", "LastTimeUpdateBalance", });
    internal_static_fintech_HistoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_fintech_HistoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintech_HistoryRequest_descriptor,
        new java.lang.String[] { });
    internal_static_fintech_HistoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_fintech_HistoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintech_HistoryResponse_descriptor,
        new java.lang.String[] { "Error", "Data", });
    internal_static_fintech_HistoryResponse_Data_descriptor =
      internal_static_fintech_HistoryResponse_descriptor.getNestedTypes().get(0);
    internal_static_fintech_HistoryResponse_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintech_HistoryResponse_Data_descriptor,
        new java.lang.String[] { "HistoryItems", });
    internal_static_fintech_HistoryItem_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_fintech_HistoryItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintech_HistoryItem_descriptor,
        new java.lang.String[] { "PartnerId", "TransferType", "Amount", "Message", "Balance", "TransferTime", "Username", "FullName", });
    internal_static_fintech_TransferRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_fintech_TransferRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintech_TransferRequest_descriptor,
        new java.lang.String[] { "SenderId", "ReceiverId", "Amount", "Message", "Password", });
    internal_static_fintech_TransferResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_fintech_TransferResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintech_TransferResponse_descriptor,
        new java.lang.String[] { "Error", "Data", });
    internal_static_fintech_TransferResponse_Data_descriptor =
      internal_static_fintech_TransferResponse_descriptor.getNestedTypes().get(0);
    internal_static_fintech_TransferResponse_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintech_TransferResponse_Data_descriptor,
        new java.lang.String[] { "HistoryItem", });
    internal_static_fintech_NotificationRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_fintech_NotificationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintech_NotificationRequest_descriptor,
        new java.lang.String[] { });
    internal_static_fintech_NotificationResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_fintech_NotificationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintech_NotificationResponse_descriptor,
        new java.lang.String[] { "Error", "Data", });
    internal_static_fintech_NotificationResponse_Data_descriptor =
      internal_static_fintech_NotificationResponse_descriptor.getNestedTypes().get(0);
    internal_static_fintech_NotificationResponse_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintech_NotificationResponse_Data_descriptor,
        new java.lang.String[] { "NotificationItems", });
    internal_static_fintech_NotificationItem_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_fintech_NotificationItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintech_NotificationItem_descriptor,
        new java.lang.String[] { "NotificationId", "NotificationType", "PartnerId", "Amount", "Message", "Seen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

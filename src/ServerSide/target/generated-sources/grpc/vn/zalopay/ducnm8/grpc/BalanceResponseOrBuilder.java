// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fintech.proto

package vn.zalopay.ducnm8.grpc;

public interface BalanceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:fintech.BalanceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.fintech.Error error = 1;</code>
   */
  boolean hasError();
  /**
   * <code>.fintech.Error error = 1;</code>
   */
  vn.zalopay.ducnm8.grpc.Error getError();
  /**
   * <code>.fintech.Error error = 1;</code>
   */
  vn.zalopay.ducnm8.grpc.ErrorOrBuilder getErrorOrBuilder();

  /**
   * <code>.fintech.BalanceResponse.Data data = 2;</code>
   */
  boolean hasData();
  /**
   * <code>.fintech.BalanceResponse.Data data = 2;</code>
   */
  vn.zalopay.ducnm8.grpc.BalanceResponse.Data getData();
  /**
   * <code>.fintech.BalanceResponse.Data data = 2;</code>
   */
  vn.zalopay.ducnm8.grpc.BalanceResponse.DataOrBuilder getDataOrBuilder();
}
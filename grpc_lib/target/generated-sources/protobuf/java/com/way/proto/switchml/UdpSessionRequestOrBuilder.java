// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: switchml.proto

package com.way.proto.switchml;

public interface UdpSessionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.way.proto.switchml.UdpSessionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 session_id = 1;</code>
   * @return The sessionId.
   */
  long getSessionId();

  /**
   * <code>uint32 rank = 2;</code>
   * @return The rank.
   */
  int getRank();

  /**
   * <code>uint32 num_workers = 3;</code>
   * @return The numWorkers.
   */
  int getNumWorkers();

  /**
   * <code>uint64 mac = 4;</code>
   * @return The mac.
   */
  long getMac();

  /**
   * <code>uint32 ipv4 = 5;</code>
   * @return The ipv4.
   */
  int getIpv4();

  /**
   * <code>.com.way.proto.switchml.PacketSize packet_size = 7;</code>
   * @return The enum numeric value on the wire for packetSize.
   */
  int getPacketSizeValue();
  /**
   * <code>.com.way.proto.switchml.PacketSize packet_size = 7;</code>
   * @return The packetSize.
   */
  com.way.proto.switchml.PacketSize getPacketSize();
}
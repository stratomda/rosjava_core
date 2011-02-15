/* Auto-generated by genmsg_cpp for file /usr/local/google/ros_tutorials/beginner_tutorials/srv/AddTwoInts.srv */

package org.ros.message.srv;

import org.ros.message.Message;
import org.ros.message.Service;

import java.nio.ByteBuffer;


public class AddTwoInts extends Service<AddTwoInts.Request, AddTwoInts.Response> {

  public static java.lang.String __s_getDataType() { return "beginner_tutorials/AddTwoInts"; }
  public static java.lang.String __s_getMD5Sum() { return "6a2e34150c00229791cc89ff309fff21"; }

  public java.lang.String getDataType() { return AddTwoInts.__s_getDataType(); }
  public java.lang.String getMD5Sum() { return AddTwoInts.__s_getMD5Sum(); }

  public AddTwoInts.Request createRequest() {
    return new AddTwoInts.Request();
  }

  public AddTwoInts.Response createResponse() {
    return new AddTwoInts.Response();
  }

static public class Request extends Message {

  public long a;
  public long b;

  public Request() {
  }

  public static java.lang.String __s_getDataType() { return "beginner_tutorials/AddTwoIntsRequest"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "36d09b846be0b371c5f190354dd3153e"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "6a2e34150c00229791cc89ff309fff21"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "int64 a\n" +
"int64 b\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Request clone() {
    Request c = new Request();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 8; // a
    __l += 8; // b
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.putLong(a);
    bb.putLong(b);
  }

  public void deserialize(ByteBuffer bb) {
    a = bb.getLong();
    b = bb.getLong();
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Request))
      return false;
    Request other = (Request) o;
    return
      a == other.a &&
      b == other.b &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (int)(this.a ^ (this.a >>> 32));
    result = prime * result + (int)(this.b ^ (this.b >>> 32));
    return result;
  }
} // class Request

static public class Response extends Message {

  public long sum;

  public Response() {
  }

  public static java.lang.String __s_getDataType() { return "beginner_tutorials/AddTwoIntsResponse"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "b88405221c77b1878a3cbbfff53428d7"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "6a2e34150c00229791cc89ff309fff21"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "int64 sum\n" +
"\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Response clone() {
    Response c = new Response();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 8; // sum
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.putLong(sum);
  }

  public void deserialize(ByteBuffer bb) {
    sum = bb.getLong();
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Response))
      return false;
    Response other = (Response) o;
    return
      sum == other.sum &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (int)(this.sum ^ (this.sum >>> 32));
    return result;
  }
} // class Response

} //class


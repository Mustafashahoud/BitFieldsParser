//package com.example.sar.bitfiledsparser;
//
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//
//public class BitFieldPraser {
//    public static void main(String[] args)
//    {
//
//        User user = new User("Mustafa", 176, 25, 1);
//
//        try{
//            byte[] bytes = serialize(user);
//          System.out.println("Text [Byte Format] : " + bytes);
//            try{
//                User user2 = User.class.cast(deserialize(bytes));
//                User user3 = (User) deserialize(bytes);
//                System.out.println("Text Decryted : " + user2.getUser_name());
//                System.out.println("After Deserialization");
//                System.out.println(user2);
//
//            }catch (ClassNotFoundException ex) {}
//
//
//        }catch (IOException ex) {}
//
//    }
//
//
//    public static byte[] serialize(Object obj) throws IOException {
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        ObjectOutputStream os = new ObjectOutputStream(out);
//        os.writeObject(obj);
//        return out.toByteArray();
//    }
//    public static Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
//        ByteArrayInputStream in = new ByteArrayInputStream(data);
//        ObjectInputStream is = new ObjectInputStream(in);
//        return is.readObject();
//    }
//
//}

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
//            /*
//            Serialization is the process of converting a object into a stream
//            Deserialization is the process of reconstructing an object that has been serialized before
//            */
//            /*
//            serialize method converts a data Structure into ByteArray which can be sent sequentially over a connection
//            and then the receiver will Deserialize it and reconstruct the object
//            this is a useful way to use the serializable Interface but what we can do more is to put the
//            attributes of an object into a file  and then get them back "but that object must implement the serializable Interface
//            */
//            /*
//            FileOutputStream fio = new FileOutputStream(new File("User.txt"));
//            ObjectOutputStream oos = new ObjectOutputStream(fio);
//            oos.writeObject(user);
//            and then we can read it back
//            FileInputStream fio = new FileInputStream(new File("User.txt"));
//            ObjectInoutStream ois = new ObjectInputStream(fio);
//            User user = (user)ois.readObject(user);
//            */
//
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

import java.io.*;
class Ch12TestDataInputStream{
  public static void main(String[] args) throws IOException{
    File inFile = new File("Sample2.data");
    FileInputStream inFileStream = new FileInputStream(inFile);
    DataInputStream inDataStream = new DataInputStream(inFileStream);

    System.out.println(inDataStream.readInt());
    System.out.println(inDataStream.readLong());
    System.out.println(inDataStream.readFloat());
    System.out.println(inDataStream.readDouble());
    System.out.println(inDataStream.readChar());
    System.out.println(inDataStream.readBoolean());

    inDataStream.close();
  }
}

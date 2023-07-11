package Main;

import Classes.Cipher;
import Classes.FileCopy;

import java.io.*;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        //Первая задача

        try {
            FileCopy.makeBackUp("./src/main/java");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //Вторая задача

        byte[][] field = {{0, 1, 2}, {3, 2, 1}, {0, 1, 3}};

        try (FileOutputStream fos = new FileOutputStream("./src/main/java/key.txt")) {
            byte[] buffer = Cipher.encrypt(field);
            fos.write(buffer, 0, buffer.length);
            System.out.println("Файл записан и имеет длину " + buffer.length + " байта");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        byte[] keyForDecrypted = new byte[3];
        try (FileInputStream fin = new FileInputStream("./src/main/java/key.txt")) {
            int i;
            int index = 0;
            while ((i = fin.read()) != -1) {
                if (i != 0) {
                    keyForDecrypted[index] = (byte) i;
                    index++;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Дешифрованное поле из файла");
        System.out.println(Arrays.deepToString(Cipher.decrypt(keyForDecrypted)));
    }
}
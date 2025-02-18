package com.learning.Learning.pojo;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.PdfCopy;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;

public class PDFCre {
    public static void main(String[] args) {
        String src = "C:\\Data\\1672001500009818-PNB-1-Stmt.pdf";  // Input file
        String dest = "AccStmt_1672001500009818.pdf";  // Output file
        String userPassword = "MK62750094";
        try {
            PdfReader reader = new PdfReader(src);
            FileOutputStream fileOut = new FileOutputStream(dest);

            // Create PdfStamper instance to allow writing to the new file
            PdfStamper stamper = new PdfStamper(reader, fileOut);

            // Apply password protection with encryption
            stamper.setEncryption(userPassword.getBytes(), userPassword.getBytes(),
                    PdfWriter.ALLOW_PRINTING | PdfWriter.ALLOW_COPY,
                    PdfWriter.ENCRYPTION_AES_128);

            stamper.close();
            reader.close();

            System.out.println("PDF modified and saved as: " + dest);
        } catch (IOException | com.itextpdf.text.DocumentException e) {
            e.printStackTrace();
        }

    }

    private static void removeProducerField(PdfStamper stamper) throws NoSuchFieldException, IllegalAccessException {
        // Access the private field '_writer' using reflection
        Field writerField = PdfStamper.class.getDeclaredField("writer");
        writerField.setAccessible(true);
        PdfWriter writer = (PdfWriter) writerField.get(stamper);

        // Access the private field '_info' and clear the 'Producer' field
        Field infoField = PdfWriter.class.getDeclaredField("info");
        infoField.setAccessible(true);
        HashMap<String, String> info = (HashMap<String, String>) infoField.get(writer);
        info.put("Producer", ""); // Clear the Producer metadata
    }
}



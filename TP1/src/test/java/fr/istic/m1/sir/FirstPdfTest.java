package fr.istic.m1.sir;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstPdfTest {


    @BeforeEach
    public void init(){

    }

    @Test
    public void testOk() throws DocumentException, FileNotFoundException {
        Document document = new Document();
        PdfWriter.getInstance(document,new FileOutputStream("FirstPdf.pdf"));

        document.open();
        FirstPdf.addMetaData(document);
        FirstPdf.addTitlePage(document);
        FirstPdf.addContent(document);
        document.close();

        //test null..
        assertTrue(true);
    }

}
